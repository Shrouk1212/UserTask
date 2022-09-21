package UserControllerIntegrationo.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UserControllerIntegrationo.DTO.UserDTO;
import UserControllerIntegrationo.entity.UserEntity;
import UserControllerIntegrationo.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDTO saveUser(UserDTO user) { 
		user.setHashedPassword(encryptPassword(user.getName() ,user.getPassword()));
	    UserEntity userEntity = userRepository.save(new UserEntity(user.getName() , user.getHashedPassword()));
		return new UserDTO(userEntity.getName() , user.getPassword()  , userEntity.getPassword() );
		
    }
	
	
	private String encryptPassword(String name , String password) {
		String valueToEncrypt = name + password;
		return DigestUtils.sha256Hex(valueToEncrypt);
	}

}

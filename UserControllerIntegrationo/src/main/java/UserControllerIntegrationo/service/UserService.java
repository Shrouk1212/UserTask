package UserControllerIntegrationo.service;

import UserControllerIntegrationo.DTO.UserDTO;
import UserControllerIntegrationo.entity.UserEntity;

public interface UserService {
	
	 // Save operation
    UserDTO saveUser(UserDTO user);
    

}

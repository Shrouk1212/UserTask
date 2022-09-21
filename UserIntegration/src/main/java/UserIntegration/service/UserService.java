package UserIntegration.service;

import UserIntegration.DTO.UserDTO;
import UserIntegration.entity.UserEntity;

public interface UserService {
	
	 // Save operation
    UserDTO saveUser(UserDTO user);
    

}

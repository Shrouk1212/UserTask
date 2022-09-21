package UserControllerIntegrationo.Controller;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import UserControllerIntegrationo.DTO.UserDTO;
import UserControllerIntegrationo.entity.UserEntity;
import UserControllerIntegrationo.service.UserService;

@RestController
public class UserController {

	@Autowired private UserService userService;
    
    @PostMapping("/saveuser2")
    public UserDTO saveUser(
        @Validated @RequestBody UserDTO user)
    {
        return userService.saveUser(user);
    }
    
    // for test case but not recommended to pass a password in the url
    @PostMapping("/saveuser") 
    public UserDTO save( @RequestParam(value="name") String name , @RequestParam(value="password") String password) {
    	return userService.saveUser(new UserDTO(name , password));
    }


}

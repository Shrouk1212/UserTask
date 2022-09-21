package UserControllerIntegrationo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import UserIntegration.Controller.UserControllerIntegration;
import UserIntegration.DTO.UserDTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerIntegrationTest {

	@Autowired
	private UserControllerIntegration userController;
	
	@Test
	public  final void saveUser() {
	String name = "Name1";
	String password = "Password1";
	String hashedPassword ="b9efd0093bc77cd96e6f86db09321ffe5cb4ffa7634df89df586379fe6276cc8";
	
	UserDTO dto = userController.save( name , password);
	assertNotNull(dto);
	assertNotNull(dto.getName());
	assertNotNull(dto.getHashedPassword());
	assertEquals(dto.getHashedPassword(), hashedPassword);
	
	}

}

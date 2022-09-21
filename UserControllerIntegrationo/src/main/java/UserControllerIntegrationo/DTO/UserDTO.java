package UserControllerIntegrationo.DTO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
	
	private String name;
	private String password;
    private String hashedPassword;
	public UserDTO(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	




}

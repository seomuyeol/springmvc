package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

	/**
	 * 会員リスト照会：GET /users
	 * 会員登録：POST /users
	 * 会員照会：GET /users/{userID}
	 * 会員修正：PATCH /users/{userID}
	 * 会員削除：DELETE /users/{userID}
	 * @return
	 */
	
	@GetMapping
	public String user() {
		return "get users";
	}
	@PostMapping
	public String addUser() {
		return "post user";
	}
	
	@GetMapping("/{userId}")
	public String findUser(@PathVariable String userId) {
		return "get userId = " + userId;
	}
	
	@PatchMapping("/{userId}")
	public String updateUser(@PathVariable String userId) {
		return "update userId = " +userId;
	}
	
	@DeleteMapping("/{userId}")
	public String deleteUser(@PathVariable String userId) {
		return "delete userId = " + userId;
	}
}

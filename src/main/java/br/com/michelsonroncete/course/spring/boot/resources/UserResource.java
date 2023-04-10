package br.com.michelsonroncete.course.spring.boot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.michelsonroncete.course.spring.boot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Tobias", "tobias@gmail.com", "21964185007", "123456");
		return ResponseEntity.ok().body(u);
	}
}

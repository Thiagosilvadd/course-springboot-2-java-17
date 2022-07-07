package dev.thiagosilva.course.resources;

import dev.thiagosilva.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Thiago","silvaa.thiagod2@gmail.com", "123456789", "12345");
        return ResponseEntity.ok().body(u);
    }
}

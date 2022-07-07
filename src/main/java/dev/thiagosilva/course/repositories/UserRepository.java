package dev.thiagosilva.course.repositories;

import dev.thiagosilva.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

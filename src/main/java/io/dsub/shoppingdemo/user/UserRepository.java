package io.dsub.shoppingdemo.user;

import io.dsub.shoppingdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Declarative Interface
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);
}

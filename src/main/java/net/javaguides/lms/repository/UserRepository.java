package net.javaguides.lms.repository;

import net.javaguides.lms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

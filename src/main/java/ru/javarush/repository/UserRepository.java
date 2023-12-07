package ru.javarush.repository;

import java.util.Optional;
import ru.javarush.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> getByAge(Integer age);

}

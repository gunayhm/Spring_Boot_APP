package ru.javarush.service;

import com.example.products.controller.ProductController;
import com.example.products.dto.ProductDto;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.function.ServerRequest;
import ru.javarush.client.ProductClient;
import ru.javarush.dto.UserDto;
import ru.javarush.entity.UserEntity;
import ru.javarush.mapper.UserMapper;
import ru.javarush.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto getUserById(Long id){
        if(id!=null){
            System.out.println("Hello");
        }
        UserEntity userEntity=userRepository.findById(id).orElseThrow();
        return userMapper.toUserDto(userEntity);
    }

    public void saveUser(UserDto userDto){
        userRepository.save(userMapper.toUserEntity(userDto));
    }

    public void  deleteUserById(Long id){
        userRepository.deleteById(id);
    }

}

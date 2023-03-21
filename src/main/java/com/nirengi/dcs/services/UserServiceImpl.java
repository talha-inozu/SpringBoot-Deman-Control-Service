package com.nirengi.dcs.services;

import com.nirengi.dcs.data.entity.DemandEntity;
import com.nirengi.dcs.data.entity.UserEntity;
import com.nirengi.dcs.data.repository.UserRepository;
import com.nirengi.dcs.dto.DemandDto;
import com.nirengi.dcs.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<UserDto> getAllUsers() {
        List<UserDto> responseList = new ArrayList<>();

        Iterable<UserEntity> entities = userRepository.findAll();

        for(UserEntity entity:entities){
            responseList.add(entityToDto(entity));
        }
        return responseList ;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseEntity<UserDto> getUserById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<UserDto> updateUser(Long id, UserDto userDto) throws Throwable {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteUser(Long id) throws Throwable {
        return null;
    }

    @Override
    public UserDto entityToDto(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity dtoToEntity(UserDto userDto) {
        return null;
    }
}

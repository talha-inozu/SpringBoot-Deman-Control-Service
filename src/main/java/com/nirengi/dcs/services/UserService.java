package com.nirengi.dcs.services;

import com.nirengi.dcs.data.entity.DemandEntity;
import com.nirengi.dcs.data.entity.UserEntity;
import com.nirengi.dcs.dto.DemandDto;
import com.nirengi.dcs.dto.UserDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    public List<UserDto> getAllUsers();

    public UserDto createUser(UserDto userDto);
    public ResponseEntity<UserDto> getUserById(Long id);

    public ResponseEntity<UserDto> updateUser(Long id, UserDto userDto) throws Throwable;
    public  ResponseEntity<Map<String,Boolean>> deleteUser(Long id) throws Throwable;

    //Model Wrapper
    public  UserDto entityToDto(UserEntity userEntity);
    public  UserEntity dtoToEntity(UserDto userDto);


}

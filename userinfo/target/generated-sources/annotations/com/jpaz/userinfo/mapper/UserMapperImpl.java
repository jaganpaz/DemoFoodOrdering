package com.jpaz.userinfo.mapper;

import com.jpaz.userinfo.dto.UserDTO;
import com.jpaz.userinfo.entity.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-15T22:35:02-0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User mapUserDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setUserId( userDTO.getUserId() );
        user.setUserName( userDTO.getUserName() );
        user.setUserPassword( userDTO.getUserPassword() );
        user.setAddress( userDTO.getAddress() );
        user.setCity( userDTO.getCity() );

        return user;
    }

    @Override
    public UserDTO mapUserToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setUserId( user.getUserId() );
        userDTO.setUserName( user.getUserName() );
        userDTO.setUserPassword( user.getUserPassword() );
        userDTO.setAddress( user.getAddress() );
        userDTO.setCity( user.getCity() );

        return userDTO;
    }
}

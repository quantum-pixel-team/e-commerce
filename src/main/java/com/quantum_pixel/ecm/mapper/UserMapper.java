package com.quantum_pixel.ecm.mapper;

import com.quantum_pixel.ecm.model.User;
import com.quantum_pixel.ecm.v1.web.model.CreateUserDTO;
import com.quantum_pixel.ecm.v1.web.model.UpdateUserRequestDTO;
import com.quantum_pixel.ecm.v1.web.model.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserDTO toDto(User user);

    User toEntity(CreateUserDTO userDTO);
    User toEntity(UpdateUserRequestDTO userDTO);
}
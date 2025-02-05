package com.edenlisk.ubuvuzi.connect.mapper;

import com.edenlisk.ubuvuzi.connect.dto.RoleDto;
import com.edenlisk.ubuvuzi.connect.entity.Role;

public class RoleMapper {

    public static RoleDto mapToRoleDto(Role role, RoleDto roleDto) {
        roleDto.setName(role.getName());
        roleDto.setPermissions(role.getPermissions());
        return roleDto;
    }

}

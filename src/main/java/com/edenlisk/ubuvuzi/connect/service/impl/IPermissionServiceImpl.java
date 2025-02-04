package com.edenlisk.ubuvuzi.connect.service.impl;

import com.edenlisk.ubuvuzi.connect.dto.CreatePermissionDto;
import com.edenlisk.ubuvuzi.connect.entity.Permission;
import com.edenlisk.ubuvuzi.connect.repository.PermissionRepository;
import com.edenlisk.ubuvuzi.connect.service.IPermissionService;
import org.springframework.stereotype.Service;

@Service
public class IPermissionServiceImpl implements IPermissionService {

    private final PermissionRepository permissionRepository;

    public IPermissionServiceImpl(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    /**
     * @param permissionDto
     */
    @Override
    public void createPermission(CreatePermissionDto permissionDto) {
        Permission permission = new Permission();
        permission.setAuthority(permissionDto.getAuthority());
        permissionRepository.save(permission);
    }
}

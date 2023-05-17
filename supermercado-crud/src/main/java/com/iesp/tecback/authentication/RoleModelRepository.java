package com.iesp.tecback.authentication;

import com.iesp.tecback.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleModelRepository extends JpaRepository<RoleModel, Long> {

    public List<RoleModel> findByRoleNameIn(List<RoleName> roles);
}

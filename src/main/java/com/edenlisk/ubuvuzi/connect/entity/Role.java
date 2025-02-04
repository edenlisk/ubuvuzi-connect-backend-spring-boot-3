//package com.unkownkoder.models;
//
//import org.springframework.security.core.GrantedAuthority;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="roles")
//public class Role implements GrantedAuthority {
//
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    @Column(name="role_id")
//    private Integer roleId;
//
//    private String authority;
//
//    public Role(){
//        super();
//    }
//
//    public Role(String authority){
//        this.authority = authority;
//    }
//
//    public Role(Integer roleId, String authority){
//        this.roleId = roleId;
//        this.authority = authority;
//    }
//
//    @Override
//    public String getAuthority() {
//        // TODO Auto-generated method stub
//        return this.authority;
//    }
//
//    public void setAuthority(String authority){
//        this.authority = authority;
//    }
//
//    public Integer getRoleId(){
//        return this.roleId;
//    }
//
//    public void setRoleId(Integer roleId){
//        this.roleId = roleId;
//    }
//}

package com.edenlisk.ubuvuzi.connect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "role_permissions",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private Set<Permission> permissions = new HashSet<>();

//    public Role() {
//    }

//    public Role(String name) {
//        this.name = name;
//    }
//
//    public Integer getRoleId() {
//        return roleId;
//    }
//
//    public void setRoleId(Integer roleId) {
//        this.roleId = roleId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Set<Permission> getPermissions() {
//        return permissions;
//    }
//
//    public void setPermissions(Set<Permission> permissions) {
//        this.permissions = permissions;
//    }
}

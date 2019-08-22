package com.j1904.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class RoleTable implements Serializable {
    private int roleId;//角色id
    private String roleName;//角色名称
}

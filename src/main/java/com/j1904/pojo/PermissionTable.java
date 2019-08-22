package com.j1904.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class PermissionTable implements Serializable {
    private int perId;//权限id
    private String perName;//权限名称
}

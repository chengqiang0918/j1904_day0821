package com.j1904.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserTable implements Serializable {
    private int userId;//用户id
    private String userName;//用户名
    private String userPwd;//用户密码
    private int userType;//用户类型（1表示普通用户，2表示会员）
    private String userPhone;//用户手机号
    private Date userCreatTime;//用户创建时间
    private String userPhoto;//用户头像
}

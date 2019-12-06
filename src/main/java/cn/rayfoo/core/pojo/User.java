package cn.rayfoo.core.pojo;

import lombok.Data;

@Data
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String tel;
    private Integer age;
    private String sex;
}

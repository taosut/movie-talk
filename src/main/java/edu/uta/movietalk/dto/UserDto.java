package edu.uta.movietalk.dto;


import edu.uta.movietalk.constant.UserGroup;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author housirvip
 */
@Data
public class UserDto implements Serializable {

    @NotBlank(groups = {Login.class})
    private String account;

    @NotBlank(groups = {Register.class})
    private String phone;

    @NotBlank(groups = {Register.class})
    private String username;

    @NotBlank(groups = {Login.class, Register.class})
    private String password;

    @NotBlank(groups = {Register.class})
    private String email;

    private Boolean remember;

    private String code;

    private String captcha;

    private Integer id;

    private Date createTime;

    private Date updateTime;

    private List<String> role;

    private Boolean enable;

    private Integer level;

    private Integer coin;

    private UserGroup group;

    private static final long serialVersionUID = 1L;
}
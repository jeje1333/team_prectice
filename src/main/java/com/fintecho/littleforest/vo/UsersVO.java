package com.fintecho.littleforest.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class UsersVO {
private int user_seq;
private String oauth_id;
private String name;
private String role;
private String badge;
private Date created_at;
private String address;
private String nickname;
private int point;
private String profile_photo;
}

package com.example.myapp.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserInfo extends BaseTime {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String userPw;
    private String userPhone;
    private String userName;
    private String userNickName;
    private String userEmail;
    private String userAddress;
    private String userCountry;
    private String userState;
    private Date userUpdate;



}

package com.example.myapp.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class House extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long house_info;

    private String houseName;
    private Long housePrice;
    private String houseLocation;
    private  Long houseCapa;
    private String houseCase;
    private Date houseUpdate;
    private String houseFileName;
}

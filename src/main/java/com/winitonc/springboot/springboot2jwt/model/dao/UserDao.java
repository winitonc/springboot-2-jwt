package com.winitonc.springboot.springboot2jwt.model.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class UserDao {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Id
    @Column
    private String username;

    @Column
    @JsonIgnore
    private String password;

}

package com.yx.spring.common.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Value;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@Table(name = "users")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private Integer uid;
    @Column(name = "uname")
    private String uname;
    @Column(name = "upwd")
    private String upwd;
    @Column(name = "ustatus")
    private Integer ustatus;

}

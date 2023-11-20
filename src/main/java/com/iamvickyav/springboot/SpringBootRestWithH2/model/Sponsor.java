// /src/main/java/com/iamvickyav/springboot/SpringBootRestWithH2/model/Sponsor.java
package com.iamvickyav.springboot.SpringBootRestWithH2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    // getters and setters omitted for brevity
}
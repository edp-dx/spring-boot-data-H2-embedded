// /src/main/java/com/iamvickyav/springboot/SpringBootRestWithH2/service/SponsorService.java
package com.iamvickyav.springboot.SpringBootRestWithH2.service;

import com.iamvickyav.springboot.SpringBootRestWithH2.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorService extends JpaRepository<Sponsor, Integer> {
}
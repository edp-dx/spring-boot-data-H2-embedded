// /src/main/java/com/iamvickyav/springboot/SpringBootRestWithH2/SponsorController.java
package com.iamvickyav.springboot.SpringBootRestWithH2;

import com.iamvickyav.springboot.SpringBootRestWithH2.model.Sponsor;
import com.iamvickyav.springboot.SpringBootRestWithH2.service.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sponsors")
public class SponsorController {

    @Autowired
    private SponsorService sponsorService;

    // Endpoints omitted for brevity
}
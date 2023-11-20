package com.iamvickyav.springboot.SpringBootRestWithH2;

import com.iamvickyav.springboot.SpringBootRestWithH2.model.Sponsor;
import com.iamvickyav.springboot.SpringBootRestWithH2.service.SponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class SponsorController {

    @Autowired
    private SponsorService sponsorService;

    // Select, Insert, Delete, Update Operations for a Sponsor

    @RequestMapping(value = "/sponsor/{id}", method = RequestMethod.GET)
    Sponsor getSponsor(@PathVariable Integer id){
        return  sponsorService.findById(id).get();
    }

    @RequestMapping(value = "/sponsor", method = RequestMethod.POST)
    String addSponsor(@RequestBody Sponsor sponsor){
        Sponsor savedSponsor = sponsorService.save(sponsor);
        return "SUCCESS";
    }

    @RequestMapping(value = "/sponsor", method = RequestMethod.PUT)
    Sponsor updateSponsor(@RequestBody Sponsor sponsor){
        Sponsor updatedSponsor = sponsorService.save(sponsor);
        return updatedSponsor;
    }

    @RequestMapping(value = "/sponsor", method = RequestMethod.DELETE)
    Map<String, String> deleteSponsor(@RequestParam Integer id){
        Map<String, String> status = new HashMap<>();
        Optional<Sponsor> sponsor = sponsorService.findById(id);
        if(sponsor.isPresent()) {
            sponsorService.delete(sponsor.get());
            status.put("Status", "Sponsor deleted successfully");
        }
        else {
            status.put("Status", "Sponsor not exist");
        }
        return status;
    }

    // Select, Insert, Delete for List of Sponsors

    @RequestMapping(value = "/sponsors", method = RequestMethod.GET)
    List<Sponsor> getAllSponsor(){
        return sponsorService.findAll();
    }

    @RequestMapping(value = "/sponsors", method = RequestMethod.POST)
    String addAllSponsors(@RequestBody List<Sponsor> sponsorList){
        sponsorService.saveAll(sponsorList);
        return "SUCCESS";
    }

    @RequestMapping(value = "/sponsors", method = RequestMethod.DELETE)
    String addAllSponsors(){
        sponsorService.deleteAll();
        return "SUCCESS";
    }
}

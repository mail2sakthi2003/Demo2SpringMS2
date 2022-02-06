package com.sakthi.springclaimms.controller;


import com.sakthi.springclaimms.entity.Claim;
import com.sakthi.springclaimms.responseobj.ClaimRespTemplateVO;
import com.sakthi.springclaimms.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/claims")
public class ClaimController
{
    @Autowired
    private ClaimService claimService;

    @PostMapping("/")
    public Claim saveClaim(@RequestBody Claim claim){

        return  claimService.saveClaim(claim);
    }


    @GetMapping("/{id}")
    public ClaimRespTemplateVO getClaimWithPersondetail(@PathVariable("id") Long claimId){

        return claimService.getClaimwithPersondetail(claimId);
    }

}

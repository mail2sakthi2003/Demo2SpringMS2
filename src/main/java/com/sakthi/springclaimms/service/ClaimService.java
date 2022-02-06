package com.sakthi.springclaimms.service;


import com.sakthi.springclaimms.entity.Claim;
import com.sakthi.springclaimms.repository.ClaimRepository;
import com.sakthi.springclaimms.responseobj.ClaimRespTemplateVO;
import com.sakthi.springclaimms.responseobj.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Claim saveClaim(Claim claim) {
        return claimRepository.save(claim);
    }

    public ClaimRespTemplateVO getClaimwithPersondetail(Long claimId) {
        ClaimRespTemplateVO vo = new ClaimRespTemplateVO();
        Claim claimdetail = claimRepository.getById(claimId);

        //Rest Call to another Microservice
        PersonVO personVO = restTemplate.getForObject("http://localhost:8080/persons/"+claimdetail.getMemberId(),PersonVO.class);

        vo.setClaim(claimdetail);
        vo.setPerson(personVO);

        return vo;
    }
}

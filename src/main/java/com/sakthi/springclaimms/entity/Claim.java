package com.sakthi.springclaimms.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Claim {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long ClaimId;
    private String ClaimNo;
    private String ClaimDet;
    private String ClaimType;
    private String MemberId;

}

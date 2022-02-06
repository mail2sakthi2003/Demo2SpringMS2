package com.sakthi.springclaimms.responseobj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sakthi.springclaimms.entity.Claim;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClaimRespTemplateVO
{
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Claim claim;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private PersonVO person;
}

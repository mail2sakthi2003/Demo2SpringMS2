package com.sakthi.springclaimms.responseobj;

import com.sakthi.springclaimms.entity.Claim;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClaimRespTemplateVO
{
    private Claim claim;
    private PersonVO person;
}

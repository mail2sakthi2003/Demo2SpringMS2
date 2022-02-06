package com.sakthi.springclaimms.responseobj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonVO
{
    private Long personId;
    private String firstName;
    private String lastName;
    private String add1;
    private String add2;
    private String planId;
}

package com.codeofus.awsexampledemo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class PersonDto implements Serializable {
    String firstName;
    String lastName;
}

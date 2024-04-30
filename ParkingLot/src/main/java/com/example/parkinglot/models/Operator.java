package com.example.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Operator extends BaseModel{
    private String employeeId;
    private String name;
    private String email;
    private String phone;

}

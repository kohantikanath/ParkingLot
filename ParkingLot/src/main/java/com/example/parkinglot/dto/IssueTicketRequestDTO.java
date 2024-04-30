package com.example.parkinglot.dto;

import com.example.parkinglot.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketRequestDTO {
    private Long gateID;
    private VehicleType vehicleType;
    private String vehicleNumber;
    private String ownerName;
}

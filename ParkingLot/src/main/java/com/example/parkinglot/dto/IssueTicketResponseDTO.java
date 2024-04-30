package com.example.parkinglot.dto;

import com.example.parkinglot.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueTicketResponseDTO {
    private Ticket ticket;
    private ResponseStatus status;
}

package com.example.parkinglot.services;

import com.example.parkinglot.exceptions.InvalidGateException;
import com.example.parkinglot.models.Gate;
import com.example.parkinglot.models.Ticket;
import com.example.parkinglot.models.VehicleType;
import com.example.parkinglot.repositories.GateRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class TicketService {
    private GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket (Long gateId, String vehicleNumber , String ownerName , VehicleType vehicleType) throws InvalidGateException {
        // Issue a ticket\
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if(optionalGate.isEmpty()){
            throw new InvalidGateException("Invalid Gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setEntryGate(gate);
        ticket.setOperator(gate.getOperator());

        return null;
    }
}

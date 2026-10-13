package com.aakash.nepalairlines.controller;

import com.aakash.nepalairlines.bindingClass.PassengerInfo;
import com.aakash.nepalairlines.bindingClass.TicketInfo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name="TicketBooking" ,
        description = "Used to take the passengerInfo and provide them ticketInfo")
public class ticketController {

    @PostMapping(
            value = "/ticket" ,
            consumes = {"application/json","application/xml"},
            produces ={"application/xml","application/json"})

    public ResponseEntity<TicketInfo> ticketRestController(@RequestBody PassengerInfo passengerInfo){
        System.out.println(passengerInfo);

        //code to store the infos in db
        TicketInfo t1 = new TicketInfo();
        t1.setPassengerName(passengerInfo.getPassengerName());
        t1.setTicketID(1);
        t1.setTo(passengerInfo.getTo());
        t1.setFrom(passengerInfo.getFrom());
        t1.setPassengerID(101);

        t1.setTicketStatus("CONFIRMED");

        return new ResponseEntity<>(t1, HttpStatus.CREATED);

    }
}

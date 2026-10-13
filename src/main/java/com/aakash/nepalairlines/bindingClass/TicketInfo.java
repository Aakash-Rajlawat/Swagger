package com.aakash.nepalairlines.bindingClass;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {

    private String passengerName;
    private int passengerID;
    private String to;
    private String from;
    private int TicketID;
    private String TicketStatus;
}

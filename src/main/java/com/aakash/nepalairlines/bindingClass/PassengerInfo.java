package com.aakash.nepalairlines.bindingClass;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class PassengerInfo {

    private String passengerName;
    private String to;
    private String from;
    private int passengerAge;
}

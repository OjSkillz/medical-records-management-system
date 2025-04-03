package org.ses.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Appointment {
    String appointmentDate;
    String appointmentTime;
    @Id
    Patient patient;
    @Id
    Doctor doctor;
}

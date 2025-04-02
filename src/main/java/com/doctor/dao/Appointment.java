package com.doctor.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
    
    private String patientName;
    
    private String doctorName;
    
    private String date;

}

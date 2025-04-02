package com.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.dao.Appointment;
import com.doctor.service.AppointmentService;


@RestController
@RequestMapping("/doctor")
public class AppointmentController {
	
	  @Autowired
	    private AppointmentService service;

	    // CREATE: Add new appointment
	    @PostMapping("/create")
	    public Appointment createAppointment(@RequestBody Appointment appointment) {
	        return service.createAppointment(appointment);
	    }

	    // READ: Get all appointments
	    @GetMapping("/getall")
	    public List<Appointment> getAllAppointments() {
	        return service.getAllAppointments();
	    }

	    // READ: Get appointment by ID
	    @GetMapping("/get/{id}")
	    public Appointment getAppointmentById(@PathVariable Integer id) {
	        return service.getAppointmentById(id);
	    }

	    // UPDATE: Modify existing appointment
	    @PutMapping("/update/{id}")
	    public Appointment updateAppointment(@PathVariable Integer id, @RequestBody Appointment updatedAppointment) {
	        return service.updateAppointment(id, updatedAppointment);
	    }

	    // DELETE: Remove appointment by ID
	    @DeleteMapping("/delete/{id}")
	    public void deleteAppointment(@PathVariable Integer id) {
	        service.deleteAppointment(id);
	    }

}

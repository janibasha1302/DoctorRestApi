package com.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.dao.Appointment;
import com.doctor.dao.AppointmentRepository;


@Service
public class AppointmentService {
	
	 @Autowired
	    private AppointmentRepository repository;

	    // CREATE Appointment
	    public Appointment createAppointment(Appointment appointment) {
	        return repository.save(appointment);
	    }

	    // READ All Appointments
	    public List<Appointment> getAllAppointments() {
	        return repository.findAll();
	    }

	    // READ Single Appointment by ID
	    public Appointment getAppointmentById(Integer id) {
	        return repository.findById(id).orElse(null);
	    }

	    // UPDATE Appointment
	    public Appointment updateAppointment(Integer id, Appointment updatedAppointment) {
	        Appointment existingAppointment = repository.findById(id).orElse(null);
	        if (existingAppointment != null) {
	            existingAppointment.setPatientName(updatedAppointment.getPatientName());
	            existingAppointment.setDoctorName(updatedAppointment.getDoctorName());
	            existingAppointment.setDate(updatedAppointment.getDate());
	            return repository.save(existingAppointment);
	        }
	        return null;
	    }

	    // DELETE Appointment
	    public void deleteAppointment(Integer id) {
	        repository.deleteById(id);
	    }
	    

}

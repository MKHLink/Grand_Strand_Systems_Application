package Services;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import Appointment.Appointment;

public class AppointmentService {
	
	public Map<String,Appointment> appointments = new HashMap<>();

	//adds an appointment if no matching id is found
	public void addAppointment(String id, Date date, String desc) {
		try {
			if(appointments.containsKey(id)) {
				throw new Exception();
			}else {
				Appointment app = new Appointment(id,date,desc);
				appointments.put(app.getId(), app);
			}
		} catch (Exception e) {
			System.out.println("Appoint with id " + id + " already exists");
		}
	}

	//deletes an appointment based on its id
	public void deleteAppointment(String id) {
		try {
			if(appointments.containsKey(id)) {
				appointments.remove(id);
				System.out.println("Removed appointment with id " + id);
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("Appointment with id " + id + " does not exist");
		}
	}
}

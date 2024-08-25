package Services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Appointment.Appointment;

public class AppointmentService {
	public List<Appointment> appointments = new ArrayList<>();

	public void addAppointment(String id, Date date, String desc) {
		try {
			for (Appointment appointment : appointments) {
				if (appointment.getId().equals(id)) {
					throw new Exception();
				}
			}
			appointments.add(new Appointment(id,date, desc));
			System.out.println("Added appointment with id " + id);
		} catch (Exception e) {
			System.out.println("Appoint with id " + id + " already exists");
		}
	}

	public void deleteAppointment(String id) {
		for (Appointment appointment : appointments) {
			if (appointment.getId().equals(id)) {
				appointments.remove(appointment);
				System.out.println("Removed appointment with id " + id);
				break;
			}
		}
	}
}

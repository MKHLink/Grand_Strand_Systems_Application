package Tests;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import Appointment.Appointment;
import Services.AppointmentService;

public class AppointmentServiceTest {
    
    private AppointmentService appointmentService;
    private Date date = new Date(System.currentTimeMillis() + 86400000);

    
    @Before
    public void setUp() {
        appointmentService = new AppointmentService();
    }
    
    @Test
    public void testAddAppointment() {
        appointmentService.addAppointment("1",date, "Description 1");
        Appointment app = appointmentService.appointments.get("1");
        assertEquals("1", app.getId());
        assertEquals(date,app.getDate());
        assertEquals("Description 1", app.getDescription());
    }
    
    @Test
    public void testAddDuplicateAppointment() {
        appointmentService.addAppointment("1", date,"Description 1");
        appointmentService.addAppointment("1",date, "Description 1");
        assertEquals(1, appointmentService.appointments.size());
    }
    
    @Test
    public void testDeleteAppointment() {
        appointmentService.addAppointment("1",date, "Description 1");
        appointmentService.deleteAppointment("1");
        assertEquals(0, appointmentService.appointments.size());
    }

}

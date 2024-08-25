package Tests;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
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
        assertEquals("1", appointmentService.appointments.get(0).getId());
        assertEquals("Description 1", appointmentService.appointments.get(0).getDescription());
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

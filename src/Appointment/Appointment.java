package Appointment;

import java.util.Date;

import Util.Checker;

public class Appointment {
	private final String id;
	private Date date;
	private String description;
	
	public Appointment(String id, Date date, String desc) {
		Checker.dataChecker(id);
		this.id = id;
		Checker.dateChecker(date);
		this.date = date;
		Checker.descriptionChecker(desc);
		this.description = desc;
	}
	
	public String getId() {
		return this.id;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		Checker.dateChecker(date);
		this.date = date;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String desc) {
		Checker.descriptionChecker(desc);
		this.description = desc;
	}
}

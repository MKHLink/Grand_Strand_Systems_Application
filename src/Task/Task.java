package Task;

import Util.Checker;

public class Task {
	private final String taskId;
	private String name;
	private String description;
	
	public Task(String id, String name, String desc) {
		Checker.dataChecker(id);
		this.taskId = id;
		Checker.objectChecker(name);
		this.name = name;
		Checker.descriptionChecker(desc);
		this.description = desc;
	}
	
	public String getTaskId() {
		return this.taskId;
	}
	
	public String getTaskName() {
		return this.name;
	}
	
	public String getTaskDescription() {
		return this.description;
	}
	
	public void setTaskName(String name) {
		Checker.objectChecker(name);
		this.name = name;
	}
	
	public void setTaskDescriptin(String desc) {
		Checker.descriptionChecker(desc);
		this.description = desc;
	}
}
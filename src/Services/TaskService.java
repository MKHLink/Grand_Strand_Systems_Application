package Services;

import java.util.ArrayList;
import java.util.List;

import Task.Task;

public class TaskService {
	public List<Task> taskList = new ArrayList<>();
	
	public void addTask(String id, String name, String desc) throws Exception {
		for(Task task:taskList) {
			if(task.getTaskId().equals(id)) {
				throw new Exception("Duplicate Ids");
			}
		}
		Task task = new Task(id,name,desc);
		taskList.add(task);
		System.out.println("Added task with id: "+ task.getTaskId());
	}
	
	public void deleteTask(String id) {
		for(Task task: taskList) {
			if(task.getTaskId().equals(id)) {
				taskList.remove(task);
				System.out.println("Removed task with id "+ task.getTaskId());
				break;
			}
		}
	}
	
	public void updateTask(String id, String name, String desc) {
		for(Task task:taskList) {
			if(task.getTaskId().equals(id)){
				task.setTaskName(name);
				task.setTaskDescriptin(desc);
				break;
			}
		}
	}
}
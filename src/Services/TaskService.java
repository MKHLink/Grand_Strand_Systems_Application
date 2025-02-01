package Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Task.Task;

public class TaskService {
	public Map<String, Task> tasks = new HashMap<>();
	
	//adds an task if no matching id is found
	public void addTask(String id, String name, String desc) throws Exception {
		try {
			if(tasks.containsKey(id)) {
				throw new Exception();
			}else {
				Task task = new Task(id,name,desc);
				tasks.put(id, task);
				System.out.println("Added task with id: "+ task.getTaskId());
			}
		}catch(Exception e){
			System.out.println("Duplicate task exists");
			throw new Exception();
		}
	}
	
	//deletes a task based on its id
	public void deleteTask(String id) {
		try {
			if(tasks.containsKey(id)) {
				tasks.remove(id);
				System.out.println("Removed task with id "+ id);
			}else {
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("Task not found");
		}
	}
	
	//updates a tasks based on its id
	public void updateTask(String id, String name, String desc) {
		try {
			if(tasks.containsKey(id)) {
				Task task = tasks.get(id);
				task.setTaskName(name);
				task.setTaskDescriptin(desc);
				tasks.put(id, task);
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("Task not found");
		}
	}
}
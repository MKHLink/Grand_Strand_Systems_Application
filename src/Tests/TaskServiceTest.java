package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Services.TaskService;

public class TaskServiceTest {
    private TaskService taskService;

    @Before
    public void setUp() {
        taskService = new TaskService();
    }

    @Test
    public void testAddTask() throws Exception {
        taskService.addTask("1", "TaskName", "TaskDescription");
        assertEquals(1, taskService.taskList.size());
        assertEquals("1", taskService.taskList.get(0).getTaskId());
    }

    @Test(expected = Exception.class)
    public void testAddTaskDuplicateId() throws Exception {
        taskService.addTask("1", "TaskName", "TaskDescription");
        taskService.addTask("1", "Task", "Description");
    }

    @Test
    public void testDeleteTask() throws Exception {
        taskService.addTask("1", "TaskName", "TaskDescription");
        taskService.deleteTask("1");
        assertEquals(0, taskService.taskList.size());
    }

    @Test
    public void testUpdateTask() throws Exception {
        taskService.addTask("1", "TaskName", "TaskDescription");
        taskService.updateTask("1", "Name", "Description");
        assertEquals("Name", taskService.taskList.get(0).getTaskName());
        assertEquals("Description", taskService.taskList.get(0).getTaskDescription());
    }

}

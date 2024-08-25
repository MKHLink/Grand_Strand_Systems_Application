package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import Task.Task;
import Util.Checker;

public class TaskTest {

    @Test
    public void testTask() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        assertEquals("1", task.getTaskId());
        assertEquals("TaskName", task.getTaskName());
        assertEquals("TaskDescription", task.getTaskDescription());
    }

    @Test
    public void testGetTaskId() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        assertEquals("1", task.getTaskId());
    }

    @Test
    public void testGetTaskName() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        assertEquals("TaskName", task.getTaskName());
    }

    @Test
    public void testSetTaskName() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        task.setTaskName("NewTaskName");
        assertEquals("NewTaskName", task.getTaskName());
    }

    @Test
    public void testGetTaskDescription() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        assertEquals("TaskDescription", task.getTaskDescription());
    }

    @Test
    public void testSetTaskDescription() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        task.setTaskDescriptin("NewTaskDescription");
        assertEquals("NewTaskDescription", task.getTaskDescription());
    }
    
    @Test(expected = NullPointerException.class)
    public void testDataCheckerNull() {
        Task task = new Task(null, "TaskName", "TaskDescription");
        Checker.dataChecker(task.getTaskId()); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataCheckerInvalid() {
        Task task = new Task("12345678901234567890", "TaskName", "TaskDescription");
        Checker.dataChecker(task.getTaskId());
    }

    @Test(expected = NullPointerException.class)
    public void testObjectCheckerNull() {
        Task task = new Task("1", null, "TaskDescription");
        Checker.objectChecker(task.getTaskName()); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testObjectCheckerInvalid() {
        Task task = new Task("1", "kldsjfpoiusdhf;lkwjewporfiud;likfnmjsd;lkf;dsklfj", "TaskDescription");
        Checker.objectChecker(task.getTaskName());
    }

    @Test(expected = NullPointerException.class)
    public void testDescriptionCheckerNull() {
        Task task = new Task("1", "TaskName", null);
        Checker.descriptionChecker(task.getTaskDescription()); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDescriptionCheckerInvalid() {
        Task task = new Task("1", "TaskName", "saoijdhpasiolf;lkasdsj;asoidas;dlkfjasd;odifuapsoifru;wealfrjuh;eowaihrfo;iweafh;oiuasduhfyhaspdio;fhas;lkdfhep;oiafuywforiWJE;ROKFHSADUIFYGHADOISUFKAHSUJDLAISUDTFOAILSdfglijugliujhbgIUGYLU");
        Checker.descriptionChecker(task.getTaskDescription());
    }
}

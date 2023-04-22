package com.company.advancedCoding.task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskList {
    private List<Task> tasks;
    private Scanner scan;

    public TaskList() {
        this.tasks = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }

    public void addTask() throws InvalidInputException {
        // Print the prompt and store the required values
        System.out.print("Enter the task description: "); // description
        String desc = scan.nextLine().trim();

        if (desc.isEmpty()) {
            throw new InvalidInputException("Description can't be empty!");
        }

        System.out.print("Enter the due date(YYYY-MM-DD): "); // due Date
        String dueDateString = scan.nextLine().trim();

        LocalDate dueDate;
        try {
            dueDate = LocalDate.parse(dueDateString);
        } catch (Exception e) {
            throw new InvalidInputException("Invalid Due Date format. Format must be (YYYY-MM-DD)");
        }

        System.out.print("Enter the priority(1 - 5): "); // priority
        String priorityString = scan.nextLine().trim();

        int priority;
        try {
            priority = Integer.parseInt(priorityString);
            // if the above conversion is successful, then check
            // if the number is within the expected range
            if (priority < 1 || priority > 5) throw new InvalidInputException("Priority must be between 1 and 5.");
        } catch(NumberFormatException e) {
            // if the conversion fails then throw this.
            throw new InvalidInputException("Invalid priority format. Priority must be an integer between 1 and 5");
        }
        /*
        Task task = new Task(desc, dueDate, priority);
        tasks.add(task);
        */

        tasks.add(new Task(desc, dueDate, priority));
        System.out.println("Task added successfully");

    }

    public void completeTask() throws InvalidInputException {
        System.out.print("Enter the task ID: ");
        String idString = scan.nextLine().trim();

        int id;
        try {
            id = Integer.parseInt(idString);
            if (id < 1 || id > tasks.size()) throw new InvalidInputException("Invalid task id. Id must be between 1 and " + tasks.size());
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid id format. Id must be between 1 and " + tasks.size());
        }
        tasks.get(id - 1).setComplete(true);

        System.out.println("Task marked as complete");
    }

    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display");
        } else {
            tasks
                    .stream()
                    .sorted(Comparator.comparing(Task::getDueDate))
                    .forEach(System.out::println);

        }
    }

    public void printOverdue() {
        List<Task> overdueTasks = tasks.stream()
                .filter(task -> task.getDueDate().isBefore(LocalDate.now())) // filter out dates that have passed.
                .sorted(Comparator.comparing(Task::getDueDate))
                .collect(Collectors.toList());

        if (overdueTasks.isEmpty()) {
            System.out.println("No overdue tasks to display");
        } else {
            overdueTasks.forEach(System.out::println);
        }

    }
}

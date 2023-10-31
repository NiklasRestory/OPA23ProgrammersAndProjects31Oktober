package org.example;

public class Project extends Item {
    private int startDate;
    private int deadline;

    private static int nextProjectId = 1;
    public Project(int id, String name, int startDate, int deadline) {
        super(nextProjectId, name);
        nextProjectId++;
        this.startDate = startDate;
        this.deadline = deadline;
    }


}

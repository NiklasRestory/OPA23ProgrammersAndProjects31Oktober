package org.example;

public class Project extends Item {
    private int startDate;
    private int deadline;

    private static int nextProjectId = 1;
    public Project(String name, int startDate, int deadline) {
        super(nextProjectId, name);
        nextProjectId++;
        this.startDate = startDate;
        this.deadline = deadline;
    }

    public int getStartDate() {
        return startDate;
    }
    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }
    public int getDeadline() {
        return deadline;
    }
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
}

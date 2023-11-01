package entities;

public class Task {
    public Integer id;
    public String name;
    private Boolean complete;

    public Task(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.complete = false;
    }

    public void toggleComplete() {
        this.complete = !complete;
    }

    private String taskStatsSimbol(Boolean stats) {
        return stats ? "X" : " ";
    }

    @Override
    public String toString() {

        return String.format("-(%d): %s (%s)", id, name, taskStatsSimbol(complete));
    }
}

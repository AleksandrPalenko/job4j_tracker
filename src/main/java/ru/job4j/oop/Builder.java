package ru.job4j.oop;

public class Builder extends Engineer {

    private String nameOfTool;
    private int sizeOfWall;

    public Builder() {
        super();
    }

    public Builder(String name, String education, int birthday,
                   String nameOfProject, String executorOfProject, String nameOfTool,
                   int sizeOfWall) {
        super(name, education, birthday, nameOfProject, executorOfProject);
        this.nameOfTool = nameOfTool;
        this.sizeOfWall = sizeOfWall;
    }

    public String getNameOfTool() {
        return nameOfTool;
    }

    public int getSizeOfWall() {
        return sizeOfWall;
    }

    public void paintAWall() {

    }
}

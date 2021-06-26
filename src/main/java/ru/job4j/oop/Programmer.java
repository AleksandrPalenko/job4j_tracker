package ru.job4j.oop;

public class Programmer extends Engineer {
    private String nameOfLanguageOfPrograming;
    private int timeForMakeAProgram;

    public Programmer() {
        super();
    }

    public Programmer(String name, String education, int birthday,
                      String nameOfProject, String executorOfProject,
                      String nameOfLanguageOfPrograming, int timeForMakeAProgram) {
        super(name, education, birthday, nameOfProject, executorOfProject);
        this.nameOfLanguageOfPrograming = nameOfLanguageOfPrograming;
        this.timeForMakeAProgram = timeForMakeAProgram;
    }

    public String getNameOfLanguageOfPrograming() {
        return nameOfLanguageOfPrograming;
    }

    public int getTimeForMakeAProgram() {
        return timeForMakeAProgram;
    }

    public void makeAProgram() {

    }

    public static void main(String[] args) {
        Engineer programmer = new Programmer();
        programmer.createAProject();
    }
}

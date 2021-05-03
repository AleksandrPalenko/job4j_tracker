package ru.job4j.oop;

public class Engineer extends Profession {

    private String nameOfProject;

    private String executorOfProject;

    public Engineer() {
        super();
    }

    public Engineer(String name, String surname, String education, int birthday, String nameOfProject, String executorOfProject) {
        super(name, surname, education, birthday);
        this.nameOfProject = nameOfProject;
        this.executorOfProject = executorOfProject;
    }


    public String getNameOfProject() {
        return nameOfProject;
    }

    public String getExecutorOfProject() {
        return executorOfProject;
    }

    public void createAProject() {

    }
}

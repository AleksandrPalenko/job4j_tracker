package ru.job4j.stream;

public class Human {
    private String name;
    private String surname;
    private String profession;
    private String gender;
    private boolean isHealthy;

    static class Builder {
        private String name;
        private String surname;
        private String profession;
        private String gender;
        private boolean isHealthy;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildProfession(String profession) {
            this.profession = profession;
            return this;
        }

        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        Builder buildIsHealthy(Boolean isHealthy) {
            this.isHealthy = isHealthy;
            return this;
        }

        Human build() {
            Human human = new Human();
            human.name = name;
            human.surname = surname;
            human.profession = profession;
            human.gender = gender;
            human.isHealthy = isHealthy;
            return human;
        }
    }

    public static void main(String[] args) {
        Human human = new Builder().buildName("Ivan")
                .buildSurname("Ivanov")
                .buildProfession("Programmer")
                .buildGender("M")
                .buildIsHealthy(true)
                .build();
        System.out.println(human);
    }

    @Override
    public String toString() {
        return "Human{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", profession='" + profession + '\''
                + ", gender='" + gender + '\''
                + ", isHealthy=" + isHealthy
                + '}';
    }
}

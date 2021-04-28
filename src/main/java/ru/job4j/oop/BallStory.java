package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        hare.tryEat(ball);
        System.out.println("run away from the hare");
        wolf.tryEat(ball);
        System.out.println("run away from the wolf");
        fox.tryEat(ball);
        System.out.println("the fox ate the ball");

    }

    public void tryEat(Ball ball) {

    }
}
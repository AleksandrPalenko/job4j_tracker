package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        ball.stop(fox);
        hare.run(ball);
        wolf.run(ball);
        fox.get(ball);

    }

    public void tryEat(Ball ball) {

    }
}
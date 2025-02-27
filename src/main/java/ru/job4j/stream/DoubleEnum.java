package ru.job4j.stream;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class DoubleEnum {

    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    public static class Card {
        private Suit suit;
        private Value value;

        public Card(Suit suit, Value value) {
            this.suit = suit;
            this.value = value;
        }

        public static void main(String[] args) {
            Stream.of(Suit.values())
                    .flatMap(x -> Stream.of(Value.values())
                            .map(y -> (new Card(x, y))))
                    .forEach(System.out::println);
        }

        @Override
        public String toString() {
            return "DoubleEnum{" + "suit=" + suit + ", value=" + value + '}';
        }
    }
}

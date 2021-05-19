package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key != null && key.equals(value)) {
                rsl = i;
                break;
            }
        }
        if (key == null) {
            throw new ElementNotFoundException("Key could not be null");
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] box = {"one", "two", "three", "four"};
        try {
            indexOf(box, null);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(indexOf(box, null));
    }
}

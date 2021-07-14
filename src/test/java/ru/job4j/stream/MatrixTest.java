package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void whenConvertToMatrix() {
        Integer[][] matrix = new Integer[][]{
                {1, 2}, {3, 4}
        };
        List<Integer> rsl = Matrix.convertToMatrix(matrix);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertThat(rsl, is(expected));
    }
}
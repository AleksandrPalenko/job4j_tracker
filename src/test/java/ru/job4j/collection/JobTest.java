package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenJobDescByName() {
        Comparator<Job> descName = new JobDescByName();
        int rsl = descName.compare(
                new Job("Read code", 1),
                new Job("Write code", 4)

        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobAscByName() {
        Comparator<Job> ascName = new JobAscByName();
        int rsl = ascName.compare(
                new Job("Read code", 1),
                new Job("Write code", 4)

        );
        assertThat(rsl, greaterThan(0));

    }

    @Test
    public void whenJobAscByPriority() {
        Comparator<Job> ascPriority = new JobAscByPriority();
        int rsl = ascPriority.compare(
                new Job("Read code", 1),
                new Job("Write code", 4)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobDescPriority() {
        Comparator<Job> descPriority = new JobDescByPriority();
        int rsl = descPriority.compare(
                new Job("Read code", 1),
                new Job("Write code", 4)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityAsc() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}
package manager;

import domain.MoviesPoster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovesPosterManagerTest {

    @Test
    public void shouldGetAll() {
        MovesPosterManager manager = new MovesPosterManager();
        MoviesPoster first = new MoviesPoster(1, "first", "dram", 2021);
        MoviesPoster second = new MoviesPoster(2, "second", "сom", 2019);
        MoviesPoster third = new MoviesPoster(3, "third", "adv", 2022);

        manager.add(first);
        manager.add(second);
        manager.add(third);

        MoviesPoster[] actual = manager.getAll();
        MoviesPoster[] expected = new MoviesPoster[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGet2() {
        MovesPosterManager manager = new MovesPosterManager();
        MoviesPoster first = new MoviesPoster(1, "first", "dram", 2021);
        MoviesPoster second = new MoviesPoster(2, "second", "сom", 2019);
        MoviesPoster third = new MoviesPoster(3, "third", "adv", 2022);

        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.setLimitLength(2);
        MoviesPoster[] actual = manager.getAll();
        MoviesPoster[] expected = new MoviesPoster[]{third, second};

        assertArrayEquals(expected, actual);
    }


}
package test.com.fizzbuzz;

import static org.junit.Assert.*;

import main.com.fizzbuzz.Fizzbuzz;
import org.junit.Test;

public class FizzbuzzTest {
    private final Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void returnsNumber() throws Exception {
        assertEquals("1", fizzbuzz.of(1));
    }
}

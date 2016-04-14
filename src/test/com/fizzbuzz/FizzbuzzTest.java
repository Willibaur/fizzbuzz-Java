package test.com.fizzbuzz;

import static org.junit.Assert.*;

import main.com.fizzbuzz.Fizzbuzz;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

public class FizzbuzzTest {
    private final Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void returnsNumber() throws Exception {
        assertEquals("1", fizzbuzz.fizzbuzzValue(1));
        assertEquals("2", fizzbuzz.fizzbuzzValue(2));
    }

    @Test
    public void returnsFizzWhenNumberIsThree() throws Exception {
        assertEquals("Fizz", fizzbuzz.fizzbuzzValue(3));
    }

    @Test
    public void returnsBuzzWhenNumberIsFive() throws Exception {
        assertEquals("Buzz", fizzbuzz.fizzbuzzValue(5));
    }

    @Test
    public void returnsFizzBuzzWhenNumberIsDivisibleby15() throws Exception {
        assertEquals("FizzBuzz", fizzbuzz.fizzbuzzValue(15));
    }
}

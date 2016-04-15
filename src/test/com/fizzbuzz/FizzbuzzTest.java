package test.com.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.com.fizzbuzz.Fizzbuzz;

public class FizzbuzzTest {
    private Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    public void whenNumberIsNotDivisibleBy3Or5ShouldReturnNumber() throws Exception {
        assertEquals("1", fizzbuzz.fizzbuzzValue(1));
        assertEquals("2", fizzbuzz.fizzbuzzValue(2));
        assertEquals("Should returns 4", "4", fizzbuzz.fizzbuzzValue(4));
    }

    @Test
    public void whenNumberIsDivisibleBy3ShouldReturnFizz() throws Exception {
        assertEquals("Fizz", fizzbuzz.fizzbuzzValue(3));
    }

    @Test
    public void whenNumberIsDivisibleBy5ShouldReturnBuzz() throws Exception {
        assertEquals("Buzz", fizzbuzz.fizzbuzzValue(5));
    }

    @Test
    public void whenNumberIsDivisibleby15ShouldReturnFizzBuzz() throws Exception {
        assertEquals("FizzBuzz", fizzbuzz.fizzbuzzValue(15));
    }
}

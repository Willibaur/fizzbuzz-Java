package main.com.fizzbuzz;

public class Fizzbuzz {
    public String fizzbuzzValue(int number) {
        if ((number % 15) == 0) return "FizzBuzz";
        if ((number % 5) == 0) return "Buzz";
        return (number % 3) == 0 ? "Fizz" : String.valueOf(number);
    }
}



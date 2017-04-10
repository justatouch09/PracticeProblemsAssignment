Get started by forking [this repository](https://github.com/TIY-Charlotte-Java/PracticeProblemsAssignment).

For today's homework, we're going to tackle a series of 3 practice problems. 

But first, let's enjoy this image of two hamsters on a hamster wheel:

![hamsters](https://lh6.googleusercontent.com/-jziFd9qK9qM/UJKz-jQJ3NI/AAAAAAACYAE/1SF8WJOF52w/w506-h380/photo.gif)


# Problem 1: FizzBuzz

For each number 1-100 inclusive, print out a value based off the current number. 
* If the value is evenly divisible by 3, print "Fizz"
* If the value is evenly divisible by 5, print "Buzz"
* If the value is evenly divisible by both 3 and 5, print "FizzBuzz"
* Otherwise, print the number


# Problem 2: Fibonacci Sequence
The Fibonacci sequence is a pretty sweet numerical sequence that is defined as:

```
fib(n) = fib(n-1) + fib(n-2)
```

...and fib(0) and fib(1) are both defined as 1. So the Fibonacci sequence starting from the beginning looks like `[1, 1, 2, 3, 5, 8, 13,...]`.

Write the `fibseq(x)` function that returns the first X elements of the Fibonacci sequence.


# Problem 3: Increment All The Things
Write a function called `boost()` that accepts a number as a parameter and increments all of the digits of the number individually. If the digit is 0-8, it should be incremented, but if its 9 then it should be reset to 0.

The function should return a number.

```
boost(129);   // 230
boost(49);    // 50
boost(412);   // 523
```


## Write all of these as static methods in the Main class, and demonstrate their functionality by writing tests for them.


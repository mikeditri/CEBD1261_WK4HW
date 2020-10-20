//Week 4 homework
//Exercise 1

import scala.math.BigDecimal

object Excercise1 {
   def main(args: Array[String]) {
      var xround :Double = BigDecimal(42.354562).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble;
      val xtext :String = "The round value of x is ";
      var three: Int = 3;
      var ypadd = f"$three%04.0f";
      val ytext = "The left zero padding version of y is ";
      println (xtext+xround)
      println (ytext+ypadd)
            
   }
}

Excercise1.main(null)

//Exercise 2

object Excercise2 {
def factorial(n: Int): Int = {
          
        var f = 1
        for(i <- 1 to n)
        {
            f = f * i;
        }
          
        return f
    }
     
   // Driver Code
    def main(n: Int)
    {
    println(factorial(n))
        }
    }
    

Excercise2.main(6)
Excercise2.main(8)
Excercise2.main(4.52)


//Exercise 3

object Excercise3 {
def factorial(n: Int): Int = {
          
        var f = 1
        for(i <- 1 to n)
        {
            f = f * i;
        }
          
        return f
    }
     
   // Driver Code
    def main(n: Double)
    {
    println(factorial(n.toInt))
        }
    }
    

Excercise3.main(6)
Excercise3.main(8)
Excercise3.main(4.52)


//Exercise 4

object Fibonacci {
    def fibonacci(n: Int): Int =
        if (n == 0) 0
        else
        if (n == 1) 1
              else fibonacci(n - 1) + fibonacci(n - 2)
    def main(args: Array[String]) {
        for {i <- List.range(0, 10)}
            yield { print(fibonacci(i) + ", ") }
        println("...")
    }
}

Fibonacci.main(null)


//Exercise 5 part 1

object Excercise5_1 {
def cube(n: Double): Double = {
          
        var f = (n*n*n)
          
        return f
    }
     
   // Driver Code
    def main(n: Double)
    {
    println("Here is the cube of "+n+": "+cube(n))
        }
    }

Excercise5_1.main(5)

//Exercise 5 part 2 - Lambda

object Excercise5_2 {
        val cube = (n:Double) => n*n*n
   // Driver Code
    def main(n: Double)
    {
    println("Here is the cube of "+n+": "+cube(n))
        }
    }

Excercise5_2.main(5)
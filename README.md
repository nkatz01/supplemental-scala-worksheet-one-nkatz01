# Programming Paradigms

## Scala Worksheet Supplemental - One

This worksheet is intended to familiarise students with the object-oriented programming language Scala.

1. To familiarize yourself with the Scala IDE of your choice, we will create a small `“Hello World”` project.
  Create an appropriate project and then create a Scala source file which contains: 
    ```scala
    package greeter
    object Hello extends App {
      println("Hello, World!")
    }
    ```
    Then save the file and run it.
  
    You should see a the relevant hello world output in the IDE console.  
2. Create a "Scala Worksheet" (or use the REPL) and experiment with the following:  
```scala
    val x = 1                      //> x  : Int = 1
    def increase(i: Int) = i + 1   //> increase: (i: Int)Int
    increase(x)                    //> res0: Int = 2
```  
3. What are the values and types of the following Scala literals?  
    ```scala
    42
    true
    123L
    42.0
    ```
4. What is the difference between the following literals? What is the type and value of each?
    ```scala
    'a'
    "a"
    ```
5. What is the difference between the following expressions? What is the type and value of each?
    ```scala
    "Hello world!"
    println("Hello world!")
    ```
6. What is the type and value of the following literal? 
  Try writing it on the REPL or in a Scala worksheet and see what happens!
    ```scala
    'Hello world!'
    ```
7. What is the type and value of the following conditional?
  ```scala
    val a = 1
    val b = 2
    if(a > b) "alien" else "predator"
  ```
8. What about this conditional?
  ```scala
    val a = 1
    val b = 2
    if(a > b) "alien" else 2001
  ```
9. What about this conditional?
    ```scala
      if(true) "hello"
    ```
9. What is the difference between the following expressions? What are the similarities?
    ```scala
    1 + 2 + 3
    6
    ```
9. Define an object called `Calc` with a method `square` that accepts a `Double` as an argument and... you guessed it...
    squares its input.
9. Add a method called `cube` that cubes its input and calls `square` as part of its result calculation.
9. Copy and paste `Calc` from the previous exercise to create a new object `Calc2` that is generalised to work with `Int`s 
    as well as `Double`s. If you have Java experience, this should be fairly straightforward. 
9. Define an object called `Person` that contains fields called `firstName` and `lastName`. 
9. Define a second object called `Alien` containing a method called `greet` that takes your Person as a parameter 
and returns a greeting using their first name.
9. What is the type of the `greet` method? Can we use this method to greet other objects?
9. Are methods values? Are they expressions? Why might this be the case?
9. When entered on the REPL, what does the following program output, and what is the type and value of the final expression? 
    Think carefully about the types, dependencies, and evaluation behaviour of each field and method.
    ```scala
      object argh {
        def a = {
          println("a")
          1
        }

      val b = {
        println("b")
        a + 2
      }

      def c = {
        println("c")
        a
        b + "c"
      }
    }

    argh.c + argh.b + argh.a
  ```
  

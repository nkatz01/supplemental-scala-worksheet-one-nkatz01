package greeter

import java.beans.Expression

import greeter.Calc.cube

object Hello extends  App{
  //1
  println("Hello, World!")
  //2
  val x = 1
  println(increase(x))
  def increase(i: Int) = i +1
  //3 & 4
  println(42.getClass)
  println(true.getClass)
  println(123L.getClass)
  println(42.0.getClass)
  println("a".getClass)//String
  println('a'.getClass)//Char
  //5
  println("Hello world!".getClass)
 println( println("Hello world!").getClass)
  //6
  //'Hello world!' //char can only be of one character
  //7
  val a = 1
  val b = 2
  println( (if(a > b) "alien" else "predator").getClass)
  //8
  println(  (if(a > b) "alien" else 2001).getClass)
  //9
  println( ( if(true) "hello").getClass)
  //10
  println((1 + 2 + 3).getClass)
 println( 6.getClass)
  println( (1 + 2 + 3) == 6)
  val c = 1 + 2 + 3
  val d = 6
  println()
  println(1 + 2 + 3)
  println()
  //11 , 12 & 13
  var e = 3.toInt
  println( Calc.cube(e))
  //14, 15 & 16
  val person = new Person("Mike", "Green")
  val alien = new Alien(person)
  alien.greet()
  println(alien.getClass)
  //No, it is bound to Person and cannot be used on other objects except of we generalize Alian




}
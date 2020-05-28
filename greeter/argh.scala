package greeter

object argh {
  def a = {
    println("a")
    1
  }

  val b = {
    println("b")
     a + 2
    // println(a.intValue())
  }

  def c = {
    println("c")
    a
    b + "c"
  }

  def main(args: Array[String]): Unit = {
 argh.c + argh.b  + argh.a//
   // println( argh.c + argh.b  + argh.a)
  }
}


package greeter

object PersonSingleton {
 // def firstName : String = firstName
  //def lastName: String  = lastName
  def createPerson1(firstname: String, lastname: String) = new Person(firstname,lastname)
}

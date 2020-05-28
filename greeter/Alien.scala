package greeter

class Alien(person: Person){
  //val person = person
  def greet()  : Unit = { println("Hi " + person.firstName +" "+ person.lastName) }
}

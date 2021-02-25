
object Main {
  //Carrot, Rabbit, Wolf, Meat, Plants, Animal.

  class Plants {
    override def toString: String = "Plants"
  }
  class Carrot extends Plants {
    override def toString: String = "Carrot"
  }
  trait Meat {
    override def toString: String = "Meat"
  }
  abstract class Animal{
    type T 
    def eat(a: T)
    override def toString: String = "Animal"
  }
  class Wolf extends Animal{
    type T = Meat
    override def eat(a: T): Unit = println("Wolf tears apart the " + a.toString)
    override def toString: String = "Wolf"
  }

  class Rabbit extends Animal with Meat  {
    type T = Plants
    override def eat(a: T): Unit = println("Rabbit crunches the " + a.toString)
    override def toString: String = "Rabbit"
  }

  def main(args: Array[String]): Unit = {
    val c: Plants = new Carrot
    val r = new Rabbit
    val w = new Wolf

    // this two shold compile and run w/o problems

    r.eat(c)
    w.eat(r)
    // whereas these should not compile

//    r.eat(r)
//    w.eat(c)
  }
}

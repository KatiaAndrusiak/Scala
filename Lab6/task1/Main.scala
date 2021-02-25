object Main {
  def main(args: Array[String]): Unit = {
    val car1 = new Car(0, 0, 0)
    println(car1)
    val car2 = new Car(1, 0, 90)
    println(car2)

    val betterCar = new Car ( 0, 0, 0) with RichMoves
    println(betterCar)
    betterCar.forward(5.0)
    betterCar.turnLeft
    betterCar.forward(4.0)
    println(betterCar)
    betterCar.turnBack
    betterCar.forward(1)
    println(betterCar)
    val runner = new Horse( (1,1), 270 ) with RichMoves
    println(runner)
    runner.turnLeft
    runner.forward(2)
    println(runner)

  }
}

trait RichMoves{
  var xpos: Double
  var ypos: Double
  var direction : Double

  def turnLeft: Unit ={
    direction = direction + 90
  }
  def turnRight: Unit ={
    direction = direction - 90
  }
  def turnBack: Unit ={
    direction = direction - 180
  }
  def forward( p: Double): Unit ={
    xpos = xpos + p* Math.cos(direction)
    ypos = ypos + p* Math.sin(direction)
}

}

class Car ( var xpos: Double , var ypos: Double , var direction: Double ) {
  override def toString = "Car x: "+xpos.toString + " y:"+ypos.toString + " dir:"+direction.toString

}

class Horse ( var mypos: (Double, Double), var whereHeading: Double ) {
  var xpos: Double = mypos._1
  var ypos: Double = mypos._2
  var direction : Double = whereHeading
  override def toString: String = "Horse x: "+xpos.toString + " y:"+ypos.toString + " dir:"+direction.toString
}
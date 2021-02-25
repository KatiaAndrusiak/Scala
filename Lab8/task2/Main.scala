import math.max
object Main {
  def repeated(value: Seq[Any]): List[Any]={
    value.toList.groupBy(identity).collect{ case (x, l) if l.length > 1  => x}.toList
  }
  def condMerge(list: List[Int], vec: Vector[Int], f: PartialFunction[(Int,Int),Int]): List[Int]={
    list.zip(vec).collect(f)
  }

  def main(args: Array[String]): Unit = {
    println(repeated(List(-8,5,6,1,4,4,2,5,-1,9,9))) // prints List(5, 9, 4)
    println(repeated("Hello world")) // prints List(l, o)

    val m = condMerge(List(2,-9,1,8), Vector(3,-2,45,2), { case x: Tuple2[Int,Int] if max(x._1, x._2) > 0 => max(x._1,x._2) } )
    println(m)
  }
}

//The goal is to write functions with maximal use of collection operations (solutions with for loops do not count):
//
//a) funtion to find repeated elements in any type of Seq
//
//println(repeated(List(-8,5,6,1,4,4,2,5,-1,9,9))) // prints List(5, 9, 4)
//
//println(repeated("Hello world")) // prints List(l, o)
//
//b) function that looks synchronously through two collections and according to the supplied function collects data from the two inputs
//
//import math.max
//
//val m = condMerge(List(2,-9,1,8), Vector(3,-2,45,2), { case x: Tuple2[Int,Int] if max(x._1, x._2) > 0 => max(x._1,x._2) } )
//
//println(m) // prints List(3, 45, 8)


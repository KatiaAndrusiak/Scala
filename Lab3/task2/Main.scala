import scala.annotation.tailrec

object Main {
  def frac(x: Int): Double={
    1.0/x
  }

  def sumfrac(value: Double): Double={
    @tailrec
    def sum(x: Int , result: Double): Double ={
      if(value > frac(x+1)) result
      else
        sum(x+1, result + frac(x))
    }
    sum(1,0.0)
  }

  def main(args: Array[String]): Unit = {
    val sum1 = sumfrac( 1e-3 )
    val sum2 = sumfrac( 1e-9 )
    println(sum1 + " " + sum2)
  }

}

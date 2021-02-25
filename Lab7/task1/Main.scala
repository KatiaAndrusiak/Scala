object Main {
  object Addition{

    def unapply(expr: String): Option[(Int,String,Int)] ={
      val a: Int = expr.charAt(0).toString.toInt
      val b: Int = expr.charAt(expr.length - 1).toString.toInt
      val c: String = expr.charAt(1).toString
      Option(a,c,b)
    }

  }
  def evalEx(expr: String): Any={
    val Addition(a, c, b) = expr
    c match {
      case "+" => (a+b)
      case "-" => (a-b)
      case "*" => (a*b)
      case "/" => (a.toDouble/b)
      case _ => "there is some troubles"
    }

  }

  def main(args: Array[String]): Unit = {
    val Addition(a,c, b) = "2+6"
    //println(a,b, c)
    println(evalEx("2+5"))

    println(evalEx("2-5"))

    println(evalEx("2*5"))

    println(evalEx("2/5"))

    println(evalEx("2.5"))
  }
}

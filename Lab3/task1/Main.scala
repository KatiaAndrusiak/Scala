object Main {

  val p1 = (x: Int) => x
  val p2 = (x:Int) => x*2
  val pn = (x:Int)=> (y: Int) => Math.pow(y,x).toInt



  def eval(list: List[ Int=> Int], x: Int): Unit = {
    var arg = x
    for(i <- list.indices)  arg = list(i)(arg)
    println(arg)
  }


  def main(args: Array[String]): Unit = {
    val l1 =List(p2,p2,pn(2))
    val l2 =List(p1,p2,pn(5))
    eval(l1,1)
    eval(l2,2)
  }

}


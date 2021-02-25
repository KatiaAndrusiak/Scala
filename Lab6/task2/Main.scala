import scala.annotation.tailrec

object Main {
  def stream( list: List[Any] ): List[String]={
  @tailrec
    def recstream(l:List[Any], tmp: List[String]=List()): List[String] ={
       l.isEmpty match {
         case true => tmp
         case false =>
           l.head match {
           case i: Int => recstream(l.tail,"Int("+ i +")"::tmp)
           case s: String =>  recstream(l.tail,"String("+ s +")"::tmp)
           case d: Double =>   recstream(l.tail,"Double("+ d +")"::tmp)
           case _ => tmp
         }
       }
    }
    recstream(list).reverse
  }

  def main(args: Array[String]): Unit = {
    val l = List(1, "hello", 2.56, 0x45, "key")
    val streamed = stream(l)
    println(streamed.mkString(" "))
  }
}

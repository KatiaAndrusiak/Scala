import scala.annotation.tailrec

object Main {

  def filterList(argList: List[String], f: String => Boolean): List[String]= {
    @tailrec
    def fl(recList: List[String], tmp:List[String] = List[String]() ): List[String] ={
      if(recList.isEmpty) tmp
      else
        if(f(recList.head))  fl(recList.tail, recList.head::tmp)
        else fl(recList.tail, tmp)
    }
    fl(argList)
  }


  def reverseList(argList: List[String]): List[String]= {
//    @tailrec
//    def rl(recList: List[String], tmp:List[String] = List[String]() ): List[String] ={
//      if(recList.isEmpty) tmp
//      else rl(recList.tail, recList.head::tmp)
//    }
//    rl(argList)
    //def f(string: String): Boolean =true
//    val ff = (str: String ) => true
    filterList(argList, (str: String ) => true)
  }

  def main(args: Array[String]): Unit = {
    println(filterList(List("Hello", "there", "people", "please"), _.contains('p')).mkString(", "))
    println(reverseList(List("Hello", "there", "people", "please")).mkString(", "))
  }
}

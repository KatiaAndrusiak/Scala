object Main {
   class node[T](val x: T, val n: node[T], val p: node[T]){
    var data: T = x
    var next : node[T] = n
    var prev : node[T] = p

  }
  class DL[T] {

    var head : node[T] = null

    def add(x: T): DL[T] = {
      var new_node = new node(x, null, null)
      new_node.next = head
      new_node.prev = null

      if(head != null)
        head.prev = new_node
      head = new_node
      this
    }

    override def toString: String = {
      var str: String = ""
      while( head !=null){
        str += head.data.toString + "<->"
        head = head.next
      }
      str
    }
  }

  def main(args: Array[String]): Unit = {
    val dli = new DL[Int]

    dli.add(1).add(9).add(0).add(7).add(8)

    println(dli)

    val dls = new DL[String]

    dls.add("TO").add("jest").add("DL").add("!")

    println(dls)
  }
}

//The goal is to implement generic doubly linked list in scala. The only method that the list needs to have is "add" and converion to string. The code below shows how it shoudl work:
//val dli = new DL[Int]
//
//dli.add(1).add(9).add(0).add(7).add(8)
//
//println(dli)
//
//val dls = new DL[String]
//
//dls.add("TO").add("jest").add("DL").add("!")
//
//println(dls)

/*

 1 <-> 9 <-> 0 <-> 7 <-> 8

 TO <-> jest <-> DL <-> !

 */
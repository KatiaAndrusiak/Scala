object StringDecorators {
  trait htmlH2{
    override def toString() : String = "<H2>"+ super.toString + "</H2>"
  }

  trait htmlI{
    override def toString() : String = "<I>"+ super.toString + "</I>"
  }

  trait Capitalisation {
    override def toString() : String = super.toString.capitalize
  }

  trait PageStretch {
    val llen : Int = super.toString.length + 21
    override def toString() : String = super.toString.split(" ").mkString(" "*((llen-super.toString.length)/3))
  }



}

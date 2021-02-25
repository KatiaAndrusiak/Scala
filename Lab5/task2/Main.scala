import StringDecorators._

object Main {
  def main(args: Array[String]): Unit = {

    class StringWrap (val s: String ) {
      override def toString() = s
    }



    class Pre( val text: String)  extends StringWrap(text) with htmlH2 with htmlI {}

    val h = new Pre("Paragraph header")

    println(h)



    class X(val text:String, override val llen: Int) extends StringWrap(text) with Capitalisation with PageStretch

    println(new X("abra ka dabra", 50))

    println(new X("abra ka dabra", 30))

    println(new X("abra ka dabra", 20))



    val z = new StringWrap("a tricky text with tricky content") with PageStretch

    println(z)

  }
}

/*
<I><H2>Paragraph header</H2></I>

Abra            ka            dabra

Abra     ka     dabra

Abra  ka  dabra

a       tricky       text       with       tricky       content

*/





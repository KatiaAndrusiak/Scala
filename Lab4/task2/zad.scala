object zad extends App {

  val krk = MapPoint( "Krakow", 50.061389, 19.938333 )

  println( krk )

  val nyc = MapPoint( "NYC", 40.7127, -74.0059 )

  println( nyc )

  val porto = MapPoint( "Porto", 41.162142, -8.621953 )

  val irkutsk = MapPoint( "Irkutsk",  52.283333, 104.283333 )

  println( irkutsk )


  println( porto - irkutsk )

  println( krk - irkutsk )

  println( krk.distanceTo(porto) )



  val mp = MapPoint.inTheMiddle( krk,  irkutsk, "Somewhere in Russia" )

  println( mp+" "+( mp - krk ) +" "+ ( mp - irkutsk ) )



  val r = Route( List(krk, nyc, porto) )

  println( r )

  r.addStop( porto.move( 1, 1 ) )

  r.addStop( irkutsk )

  println( r )

}

/* expected result

Krakow 50.061389N 19.938333E

NYC 40.7127N 74.0059W

Irkutsk 52.283333N 104.283333E

113.45168353092112

84.37426183463258

29.914654160942675

Somewhere in Russia 51.172360999999995N 62.110833E 42.18713091731629 42.18713091731629

Porto 41.162142N 8.621953W -> NYC 40.7127N 74.0059W -> Krakow 50.061389N 19.938333E

Irkutsk 52.283333N 104.283333E -> Nearby Porto 42.162142N 7.6219529999999995W -> Porto 41.162142N 8.621953W -> NYC 40.7127N 74.0059W -> Krakow 50.061389N 19.938333E



 */

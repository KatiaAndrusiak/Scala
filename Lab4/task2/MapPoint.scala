object MapPoint {

  def inTheMiddle(a: MapPoint, b: MapPoint, str: String): MapPoint = {
    new MapPoint(str, (a.pos._1 + b.pos._1) / 2.0, (a.pos._2 + b.pos._2) / 2.0)
  }
  def apply(name: String, x: Double, y: Double): MapPoint = new MapPoint(name, x, y)
}
// class MapPoint
class MapPoint(name: String, x: Double, y: Double){

  val pos: (Double, Double) = (x,y)

  override def toString: String = {
    val strx = if(x < 0.0)  Math.abs(x) + "S " else  x + "N "
    val stry = if(y < 0.0)  Math.abs(y) + "W " else  y + "E "
    name + " " + strx + stry
  }

  def -(a: MapPoint): Double = Math.sqrt(Math.pow(a.pos._1 - x,2) + Math.pow(a.pos._2 - y,2))

  def distanceTo(a: MapPoint): Double = this - a

  def move(dx: Double, dy: Double):  MapPoint = new MapPoint("Nearby " + name, x + dx, y + dy )

}
//end class MapPoint


object Route {
  def apply(value: List[MapPoint]): Route = new Route(value)
}

// class Route
class Route(listOfPlaces: List[MapPoint]){

  var places: List[MapPoint] = listOfPlaces.reverse

  override def toString: String = places.mkString(" -> ")

  def addStop(place: MapPoint): Unit = places = place::places

}
//end class Route


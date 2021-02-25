object Expense {
  def apply(amount: Double, itemName: String, category: String): Expense = new Expense(amount, itemName, category)
}
class Expense (val amount : Double, val itemName : String, val category : String) {
  override def toString: String = "-" +amount + "$  " + itemName+ ", category: " + category
}

object ExpensesList {
  def apply(): ExpensesList = new ExpensesList()
}
class ExpensesList {

  var list : List[Expense] = List()

  def+=(tmp : Expense): Unit = list = tmp::list

  def printList(): Unit = list.map(println(_))

  def sum() : Double = {
    var total: Double = 0.0
    list.foreach(total += _.amount)
    total
  }

  def max() : Expense = list.maxBy(_.amount)
}



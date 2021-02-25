object Main {
  def main(args: Array[String]): Unit = {
    val el = ExpensesList()

    el += Expense(5, "Bread", "food") // amount, item name, category

    el += Expense(7, "Butter", "food")

    el += Expense(3.2, "Tomatoes", "food")

    el += Expense(18, "Star Wars ticket", "entertainment")

    el.printList()

    println( el.sum )

    println( el.max )
  }
}

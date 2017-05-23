/**
  * Created by sid jain on 19-05-2017.
  */

class Entry {
  def loginWelcome(): Unit = {
    println("\nWelcome to Unicorn Library Management System")
    println("Press 1 for Login as Admin")
    println("press 2 for Login as Librarian")
    println("Press 0 for Exit")
    loginOptionSelection(readInt())
  }

  def loginOptionSelection(choice: Int): Unit = choice match {
    case 1 => new Adminstrator().options()
    case 2 => new Librarian().options
    case 0 => System.exit(0)
  }



  def librarianOptions() {
    println("press 1 for adding books")
    println("press")
  }

  def tuppleTest(tupp: ((String, Int))): Unit = {
    val l = tupp._1;

  }
}

object Entr {
  def main(args: Array[String]): Unit = {
new Entry().loginWelcome()
  }
}

/**
  * Created by sid jain on 19-05-2017.
  */
class Librarian {
  val io = scala.io.StdIn

  def options {
    println("\n **Librarian Panel**")
    println("press 1 for add book")
    println("press 2 for view book")
    println("press 3 for issue book")
    println("press 4 for return book")
    println("press 0 for logout")
    optionSelection(io.readInt())
  }

  def optionSelection(choice: Int) = choice match {
    case 1 => addBook
    case 2 => viewBook
    case 3 => issueBook
  }

  def addBook = try {
    Utility.addBook(println("Enter name of book"), io.readLine(), println("Enter name of author"), io.readLine(),
      println("Enter year of publication"), Utility.intInput(io.readInt()))
    options
  } catch {
    case _: IllegalArgumentException => println("Invalid Input")
      options
  }


  def viewBook = {
    Utility.getBooks
    options
  }

  def issueBook ={

  }


}

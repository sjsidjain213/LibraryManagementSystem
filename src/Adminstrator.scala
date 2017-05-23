import scala.util.Try

/**
  * Created by sid jain on 19-05-2017.
  */
class Adminstrator {
  def options(): Unit = {
    println("\n **Admin Panel**")
    println("press 1 for adding librarian")
    println("press 2 for removing librarian")
    println("press 3 for viewing librarian")
    println("press 0 for logout")
    optionSelection(readInt())
  }
  val io = scala.io.StdIn
  def optionSelection(choice: Int): Unit = {
    choice match {
      case 1 => addLibrarian()
      case 2 => showAndRemoveLibrarian()
      case 3 => showLibrarians()
      case 0 => new Entry().loginWelcome()
    }

  }

  def addLibrarian(){
    Utility.addLibrarian(println("\nEnter your name"),io.readLine(),println("Enter your password"),io.readLine(),Utility.libcount)
    options()
  }

  def showAndRemoveLibrarian(){
    Utility.getLibrarians()
    var input= 0
    if(Try(input = io.readInt().toInt).isSuccess)Utility.removeLibrarian(input) else println("Invalid Input. Try again")
    options()
  }
  def showLibrarians()
  {
    Utility.getLibrarians()
    options()
  }

}

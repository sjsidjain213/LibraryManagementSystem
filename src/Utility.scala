import scala.util.Try

/**
  * Created by sid jain on 19-05-2017.
  */
// This class will act as an database for our program. We will store the data in form constant tupples;
// These tuples will be stored in a immutable list
// Name of user, password

object Utility {
  var libcount = 1
  var bookcount = 1
  // var librarian = List(("sid","sid"));//private var librarian = List[(String,String)]
  // Context Bounding :
  var librarian: List[((String, String, Int))] = List()
  var books: List[((String, String, Int, Int))] = List()

  def addLibrarian(a: Unit, name: String, b: Unit, password: String, id: Int): Unit = {
    if (!name.isEmpty && (!password.isEmpty)) librarian = librarian :+ ((name, password, id))
    libcount = libcount + 1
  }

  def addBook(a: Unit, name: String, b: Unit, author: String, c: Unit, year: Int)
  = { require(year>1000&&(!name.isEmpty)&&(!author.isEmpty))
    books = books ::: List((name, author, Utility.bookcount, year))
    bookcount = bookcount + 1
    }

  def getLibrarians(): Unit = {
    val list = librarian.map(x => "" + x._3 + "." + x._1)
    println()
    list.foreach(println(_))
    println("***END OF LIST***")
  }

  def getBooks = {
    val list = books.map(x => "" + x._3 + "." + x._1 + "  " + x._2 + "  " + x._4)
    println()
    list.foreach(println(_))
    println("***END OF LIST***")
  }

  def removeLibrarian(id: Int): Unit = {
    try {
      librarian = librarian.filterNot(x => x._3 == id)
    } catch {
      case _: Exception => println("error")
    }
  }

  var stringInput = (input: String) => if (input.isEmpty) false else true

  def intInput(input: Int) = if (Try(input.toInt).isSuccess) Math.abs(input) else -1

  // as FirstClassFunction Function Value
  val intin = (input : Int) => if (Try(input.toInt).isSuccess) Math.abs(input) else -1
}

/*  def listIterator(): Unit ={
   for(tupple <- librarian)
     {
       println(tupple._1)
     }
  }*/
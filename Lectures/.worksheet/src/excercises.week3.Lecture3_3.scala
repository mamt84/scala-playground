package excercises.week3

object Lecture3_3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(216); 
  
  def nth[T](n: Int, list: List[T]): T = {
  	if (list.isEmpty)
  		throw new IndexOutOfBoundsException
  	else if (n == 0) list.head
  	else nth(n - 1, list.tail)
  };System.out.println("""nth: [T](n: Int, list: excercises.week3.List[T])T""");$skip(63); 
  
  val list = new Cons(5, new Cons(6, new Cons(7, new Nil)));System.out.println("""list  : excercises.week3.Cons[Int] = """ + $show(list ));$skip(15); val res$0 = 
  nth(0, list);System.out.println("""res0: Int = """ + $show(res$0))}
}

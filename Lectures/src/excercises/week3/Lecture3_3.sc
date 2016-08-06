package excercises.week3

object Lecture3_3 {
  
  def nth[T](n: Int, list: List[T]): T = {
  	if (list.isEmpty)
  		throw new IndexOutOfBoundsException
  	else if (n == 0) list.head
  	else nth(n - 1, list.tail)
  }                                               //> nth: [T](n: Int, list: excercises.week3.List[T])T
  
  val list = new Cons(5, new Cons(6, new Cons(7, new Nil)))
                                                  //> list  : excercises.week3.Cons[Int] = excercises.week3.Cons@3ac3fd8b
  nth(0, list)                                    //> res0: Int = 5
}
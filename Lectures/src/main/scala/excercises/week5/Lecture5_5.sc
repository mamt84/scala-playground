package excercises.week5

object Lecture5_5 {
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())((t, u) => f(t)::u)   //> mapFun: [T, U](xs: List[T], f: T => U)List[U]

  def lengthFun[T](xs: List[T]): Int =
    (xs foldRight 0)((t, u) => 1 + u)             //> lengthFun: [T](xs: List[T])Int
    
  val r = List(1, 2, 3, 4, 5)                     //> r  : List[Int] = List(1, 2, 3, 4, 5)
  lengthFun(r)                                    //> res0: Int = 5
  mapFun(r, (x: Int) => x*2)                      //> res1: List[Int] = List(2, 4, 6, 8, 10)
}
package excercises.week5

object Lecture5_1 {

  def init[T](xs: List[T]): List[T] = xs match {
    case List()  => throw new Error("init of empty list")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }                                               //> init: [T](xs: List[T])List[T]

  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List()  => ys
    case z :: zs => z :: concat(zs, ys)
  }                                               //> concat: [T](xs: List[T], ys: List[T])List[T]

  def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
    case (List(), r)      => r
    case (l, List())      => l
    case (x :: l, y :: r) => if (x <= y) x :: merge(l, ys) else y :: merge(xs, r)
  }                                               //> merge: (xs: List[Int], ys: List[Int])List[Int]

}
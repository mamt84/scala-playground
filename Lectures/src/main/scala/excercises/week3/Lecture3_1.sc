package excercises

import excercises.week3.NonEmpty
import excercises.week3.Empty

object Lecture3_1 {
  val t1 = new NonEmpty(3, Empty, Empty)          //> t1  : excercises.week3.NonEmpty = {.3.}
  val t2 = t1 add 4                               //> t2  : excercises.week3.IntSet = {.3{.4.}}
}
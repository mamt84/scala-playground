package excercises

import excercises.week3.NonEmpty
import excercises.week3.Empty

object Lecture3_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(144); 
  val t1 = new NonEmpty(3, Empty, Empty);System.out.println("""t1  : excercises.week3.NonEmpty = """ + $show(t1 ));$skip(20); 
  val t2 = t1 add 4;System.out.println("""t2  : excercises.week3.IntSet = """ + $show(t2 ))}
}

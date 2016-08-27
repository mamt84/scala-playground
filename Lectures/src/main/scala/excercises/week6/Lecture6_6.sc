package excercises.week6

import scala.io.Source

object Lecture6_6 {

  val words = List("Java", "Scala", "is", "cool", "fun") filter (word => word forall { w => w.isLetter })
                                                  //> words  : List[String] = List(Java, Scala, is, cool, fun)

  val mnem = Map('2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL", '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ")
                                                  //> mnem  : scala.collection.immutable.Map[Char,String] = Map(8 -> TUV, 4 -> GHI
                                                  //| , 9 -> WXYZ, 5 -> JKL, 6 -> MNO, 2 -> ABC, 7 -> PQRS, 3 -> DEF)

  /** Invert the mnem map to give a map from chars 'A' ... 'Z' to '2' ... '9' */
  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit
                                                  //> charCode  : Map[Char,Char] = Map(E -> 3, X -> 9, N -> 6, T -> 8, Y -> 9, J -
                                                  //| > 5, U -> 8, F -> 3, A -> 2, M -> 6, I -> 4, G -> 4, V -> 8, Q -> 7, L -> 5,
                                                  //|  B -> 2, P -> 7, C -> 2, H -> 4, W -> 9, K -> 5, R -> 7, O -> 6, D -> 3, Z -
                                                  //| > 9, S -> 7)
  /** Maps a word to the digit string it can represent, e.g. "Java" -> 5282 */
  def wordCode(word: String): String =
    word.toUpperCase() map charCode               //> wordCode: (word: String)String

  wordCode("Java")                                //> res0: String = 5282

  /**
   * A map from digit strings to the words that represent them,
   * e.g. "5282 -> List("Java", "Kata", "Lava", ...)
   * Note: A missing number should map to the empty set, e.g. "1111" -> List()
   */
  val wordsForNum: Map[String, Seq[String]] =
    words groupBy wordCode withDefaultValue Seq() //> wordsForNum  : Map[String,Seq[String]] = Map(386 -> List(fun), 47 -> List(is
                                                  //| ), 2665 -> List(cool), 5282 -> List(Java), 72252 -> List(Scala))
  /** Return all ways to encode a number as a list of words */
  def encode(number: String): Set[List[String]] =
    if (number.isEmpty()) Set(List())
    else {
      for {
        split <- 1 to number.length
        word <- wordsForNum(number take split)
        rest <- encode(number drop split)
      } yield word :: rest
    }.toSet                                       //> encode: (number: String)Set[List[String]]

  def translate(number: String): Set[String] =
    encode(number) map (_ mkString " ")           //> translate: (number: String)Set[String]

  translate("7225247386")                         //> res1: Set[String] = Set(Scala is fun)
}
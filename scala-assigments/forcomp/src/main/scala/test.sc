import forcomp.Anagrams._

object test {
  def wordOccurrences(w: Word): Occurrences = ((w.toLowerCase() groupBy ((x: Char) => x)).toList map (x => (x._1, x._2.length()))).sorted
                                                  //> wordOccurrences: (w: forcomp.Anagrams.Word)forcomp.Anagrams.Occurrences
  def combinations(occurrences: Occurrences): List[Occurrences] = {
    def innerCombinations(occurrences: Occurrences): List[Occurrences] = occurrences match {
      case List()        => List()
      case (c, f) :: Nil => List() ++ (for (n <- 1 to f) yield List((c, n))).toList
      case x :: xs       => List() ++ (for { n <- 1 to x._2 } yield List((x._1, n))).toList ++ (for { e <- innerCombinations(xs); n <- 1 to x._2 } yield (x._1, n) :: e).toList ++ innerCombinations(xs)
    }
    List() :: innerCombinations(occurrences)
  }                                               //> combinations: (occurrences: forcomp.Anagrams.Occurrences)List[forcomp.Anagra
                                                  //| ms.Occurrences]

  def subtract(x: Occurrences, y: Occurrences): Occurrences = {
    val yMap = y.toMap withDefaultValue 0
    (for { (xc, xn) <- x } yield (xc, xn - yMap(xc))) filter (elem => elem._2 > 0)
  }                                               //> subtract: (x: forcomp.Anagrams.Occurrences, y: forcomp.Anagrams.Occurrences)
                                                  //| forcomp.Anagrams.Occurrences

  val w = "aabcs"                                 //> w  : String = aabcs
  ((w.toLowerCase() groupBy ((x: Char) => x)).toList map (x => (x._1, x._2.length()))).sortWith((a, b) => a._1.compareTo(b._1) < 0)
                                                  //> res0: List[(Char, Int)] = List((a,2), (b,1), (c,1), (s,1))
  val sentence = List(w, "other")                 //> sentence  : List[String] = List(aabcs, other)
  sentence.flatten mkString ""                    //> res1: String = aabcsother

  List("ate", "eat", "tea") groupBy ((w: Word) => wordOccurrences(w))
                                                  //> res2: scala.collection.immutable.Map[forcomp.Anagrams.Occurrences,List[Stri
                                                  //| ng]] = Map(List((a,1), (e,1), (t,1)) -> List(ate, eat, tea))
  combinations(List(('a', 2), ('b', 2)))          //> res3: List[forcomp.Anagrams.Occurrences] = List(List(), List((a,1)), List((
                                                  //| a,2)), List((a,1), (b,1)), List((a,2), (b,1)), List((a,1), (b,2)), List((a,
                                                  //| 2), (b,2)), List((b,1)), List((b,2)))
  val x = List(('a', 2), ('d', 2), ('l', 2), ('r', 2))
                                                  //> x  : List[(Char, Int)] = List((a,2), (d,2), (l,2), (r,2))
  val y = List(('d', 2), ('r', 1))                //> y  : List[(Char, Int)] = List((d,2), (r,1))
  subtract(x, y)                                  //> res4: forcomp.Anagrams.Occurrences = List((a,2), (l,2), (r,1))
}
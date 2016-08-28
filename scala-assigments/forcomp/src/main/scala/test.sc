import forcomp.Anagrams._

object test {
  def wordOccurrences(w: Word): Occurrences = ((w.toLowerCase() groupBy ((x: Char) => x)).toList map (x => (x._1, x._2.length()))).sorted
                                                  //> wordOccurrences: (w: forcomp.Anagrams.Word)forcomp.Anagrams.Occurrences
  def combinations(occurrences: Occurrences): List[Occurrences] = occurrences.toSet.subsets().toList map (s => s.toList)
                                                  //> combinations: (occurrences: forcomp.Anagrams.Occurrences)List[forcomp.Anagra
                                                  //| ms.Occurrences]
  
  val w = "aabcs"                                 //> w  : String = aabcs
  ((w.toLowerCase() groupBy ((x: Char) => x)).toList map (x => (x._1, x._2.length()))).sortWith((a, b) => a._1.compareTo(b._1) < 0)
                                                  //> res0: List[(Char, Int)] = List((a,2), (b,1), (c,1), (s,1))
  val sentence = List(w, "other")                 //> sentence  : List[String] = List(aabcs, other)
  sentence.flatten mkString ""                    //> res1: String = aabcsother
  
  
  
  
  List("ate", "eat", "tea") groupBy ((w: Word) => wordOccurrences(w))
                                                  //> res2: scala.collection.immutable.Map[forcomp.Anagrams.Occurrences,List[Strin
                                                  //| g]] = Map(List((a,1), (e,1), (t,1)) -> List(ate, eat, tea))
  combinations (List(('a', 2), ('b', 2)))         //> res3: List[forcomp.Anagrams.Occurrences] = List(List(), List((a,2)), List((b
                                                  //| ,2)), List((a,2), (b,2)))
}
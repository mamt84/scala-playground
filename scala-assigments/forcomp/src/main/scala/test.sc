import forcomp.Anagrams._
import forcomp.Anagrams

object test {

  val w = "aabcs"                                 //> w  : String = aabcs
  val sentence = List("Linux", "Rulez")           //> sentence  : List[String] = List(Linux, Rulez)

  Anagrams.combinations(List(('a', 3), ('b', 4), ('c', 2)))
                                                  //> res0: List[forcomp.Anagrams.Occurrences] = List(List(), List((a,1)), List((a
                                                  //| ,2)), List((a,3)), List((a,1), (b,1)), List((a,2), (b,1)), List((a,3), (b,1)
                                                  //| ), List((a,1), (b,2)), List((a,2), (b,2)), List((a,3), (b,2)), List((a,1), (
                                                  //| b,3)), List((a,2), (b,3)), List((a,3), (b,3)), List((a,1), (b,4)), List((a,2
                                                  //| ), (b,4)), List((a,3), (b,4)), List((a,1), (b,1), (c,1)), List((a,2), (b,1),
                                                  //|  (c,1)), List((a,3), (b,1), (c,1)), List((a,1), (b,2), (c,1)), List((a,2), (
                                                  //| b,2), (c,1)), List((a,3), (b,2), (c,1)), List((a,1), (b,3), (c,1)), List((a,
                                                  //| 2), (b,3), (c,1)), List((a,3), (b,3), (c,1)), List((a,1), (b,4), (c,1)), Lis
                                                  //| t((a,2), (b,4), (c,1)), List((a,3), (b,4), (c,1)), List((a,1), (b,1), (c,2))
                                                  //| , List((a,2), (b,1), (c,2)), List((a,3), (b,1), (c,2)), List((a,1), (b,2), (
                                                  //| c,2)), List((a,2), (b,2), (c,2)), List((a,3), (b,2), (c,2)), List((a,1), (b,
                                                  //| 3), (c,2)), List((a,2), (b,3), (c,2)), List((a,3), (b,3), (c,2)), List((a,1)
                                                  //| , (b,4), (c,2)), List((a
                                                  //| Output exceeds cutoff limit.
  val x = List(('a', 2), ('d', 2), ('l', 2), ('r', 2))
                                                  //> x  : List[(Char, Int)] = List((a,2), (d,2), (l,2), (r,2))
  val y = List(('d', 2), ('r', 1))                //> y  : List[(Char, Int)] = List((d,2), (r,1))
  Anagrams.subtract(x, y)                         //> res1: forcomp.Anagrams.Occurrences = List((a,2), (l,2), (r,1))

  Anagrams.dictionary                             //> res2: List[forcomp.Anagrams.Word] = List(Aarhus, Aaron, Ababa, aback, abaft,
                                                  //|  abandon, abandoned, abandoning, abandonment, abandons, abase, abased, abase
                                                  //| ment, abasements, abases, abash, abashed, abashes, abashing, abasing, abate,
                                                  //|  abated, abatement, abatements, abater, abates, abating, Abba, abbe, abbey, 
                                                  //| abbeys, abbot, abbots, Abbott, abbreviate, abbreviated, abbreviates, abbrevi
                                                  //| ating, abbreviation, abbreviations, Abby, abdomen, abdomens, abdominal, abdu
                                                  //| ct, abducted, abduction, abductions, abductor, abductors, abducts, Abe, abed
                                                  //| , Abel, Abelian, Abelson, Aberdeen, Abernathy, aberrant, aberration, aberrat
                                                  //| ions, abet, abets, abetted, abetter, abetting, abeyance, abhor, abhorred, ab
                                                  //| horrent, abhorrer, abhorring, abhors, abide, abided, abides, abiding, Abidja
                                                  //| n, Abigail, Abilene, abilities, ability, abject, abjection, abjections, abje
                                                  //| ctly, abjectness, abjure, abjured, abjures, abjuring, ablate, ablated, ablat
                                                  //| es, ablating, ablation, 
                                                  //| Output exceeds cutoff limit.
  Anagrams.dictionaryByOccurrences                //> res3: Map[forcomp.Anagrams.Occurrences,List[forcomp.Anagrams.Word]] = Map(Li
                                                  //| st((e,1), (i,1), (l,1), (r,1), (t,2)) -> List(litter), List((a,1), (d,1), (e
                                                  //| ,1), (g,2), (l,1), (r,1)) -> List(gargled), List((a,1), (e,1), (h,1), (i,1),
                                                  //|  (k,1), (n,1), (s,3)) -> List(shakiness), List((e,2), (g,1), (n,1)) -> List(
                                                  //| gene), List((a,2), (n,1), (t,1), (y,1)) -> List(Tanya), List((a,1), (d,1), (
                                                  //| e,2), (h,1), (m,1), (n,2), (o,1), (s,3)) -> List(handsomeness), List((a,2), 
                                                  //| (c,1), (e,2), (k,1), (l,1), (m,1), (p,1), (r,1), (t,1)) -> List(marketplace)
                                                  //| , List((a,1), (i,1), (l,2), (s,1), (v,1)) -> List(villas), List((d,2), (e,1)
                                                  //| , (h,2), (n,1), (r,1), (t,1), (u,1)) -> List(hundredth), List((a,3), (b,1), 
                                                  //| (c,1), (h,1), (i,2), (l,1), (o,1), (p,2), (r,1), (t,1), (y,1)) -> List(appro
                                                  //| achability), List((d,1), (e,2), (l,1), (s,1), (t,2)) -> List(settled), List(
                                                  //| (a,1), (g,1), (i,3), (l,1), (n,2), (t,1), (z,1)) -> List(Latinizing), List((
                                                  //| a,1), (m,1), (n,1), (o,3
                                                  //| Output exceeds cutoff limit.
  sentence                                        //> res4: List[String] = List(Linux, Rulez)
  val occ = Anagrams.sentenceOccurrences(sentence)//> occ  : forcomp.Anagrams.Occurrences = List((e,1), (i,1), (l,2), (n,1), (r,1)
                                                  //| , (u,2), (x,1), (z,1))
  Anagrams.combinations(occ).length               //> res5: Int = 576

  val sentence2 = List("Eli", "lie", "lien", "line")
                                                  //> sentence2  : List[String] = List(Eli, lie, lien, line)
  Anagrams.sentenceAnagrams(sentence)             //> res6: List[forcomp.Anagrams.Sentence] = List(List(rulez, Linux), List(Rex, L
                                                  //| in, Zulu), List(Rex, nil, Zulu), List(Rex, Uzi, null), List(Rex, null, Uzi),
                                                  //|  List(Rex, Zulu, Lin), List(Rex, Zulu, nil), List(Lin, Rex, Zulu), List(Lin,
                                                  //|  Zulu, Rex), List(nil, Rex, Zulu), List(nil, Zulu, Rex), List(Linux, rulez),
                                                  //|  List(Uzi, Rex, null), List(Uzi, null, Rex), List(null, Rex, Uzi), List(null
                                                  //| , Uzi, Rex), List(Zulu, Rex, Lin), List(Zulu, Rex, nil), List(Zulu, Lin, Rex
                                                  //| ), List(Zulu, nil, Rex))
}
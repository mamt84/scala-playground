import patmat._

object test {
  
  Huffman.times(List('c', 'a', 'a', 'c', 'a', 'b', 'a'))
                                                  //> res0: List[(Char, Int)] = List((a,4), (c,1), (c,1), (b,1))
}
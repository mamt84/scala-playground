import patmat._

object test {

  val times = Huffman.times(List('c', 'a', 'b', 'a', 'a', 'c', 'a', 'c', 'a', 'b', 'a'))
                                                  //> times  : List[(Char, Int)] = List((a,6), (b,2), (c,3))
  val ordered = Huffman.makeOrderedLeafList(times)//> ordered  : List[patmat.Huffman.Leaf] = List(Leaf(b,2), Leaf(c,3), Leaf(a,6))
                                                  //| 
  val combined = Huffman.combine(ordered)         //> combined  : List[patmat.Huffman.CodeTree] = List(Fork(Leaf(b,2),Leaf(c,3),Li
                                                  //| st(b, c),5), Leaf(a,6))
  val until = Huffman.until(Huffman.singleton, Huffman.combine)(ordered)
                                                  //> until  : List[patmat.Huffman.CodeTree] = List(Fork(Fork(Leaf(b,2),Leaf(c,3),
                                                  //| List(b, c),5),Leaf(a,6),List(b, c, a),11))
	val decodedSecret = Huffman.decodedSecret //> decodedSecret  : List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
                                                  //| 
	
	val encodedSecret = Huffman.encode(Huffman.frenchCode)(decodedSecret)
                                                  //> encodedSecret  : List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1, 0, 1, 
                                                  //| 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1
                                                  //| , 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0,
                                                  //|  1, 0, 1)
                                                  
  val enfficientEncoded = Huffman.quickEncode(Huffman.frenchCode)(decodedSecret)
                                                  //> enfficientEncoded  : List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1, 0,
                                                  //|  1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 
                                                  //| 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0
                                                  //| , 0, 1, 0, 1)
}
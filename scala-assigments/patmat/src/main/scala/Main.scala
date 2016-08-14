import patmat.Huffman

object Main {
  def main(args: Array[String]): Unit = {
    val times = Huffman.times(List('c', 'a', 'b', 'a', 'a', 'c', 'a', 'c', 'a', 'b', 'a'))
    val ordered = Huffman.makeOrderedLeafList(times)
    val combined = Huffman.combine(ordered)
  }
}
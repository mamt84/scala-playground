import patmat.Huffman

object Main {
  def main(args: Array[String]): Unit = {
    val enfficientEncoded = Huffman.quickEncode(Huffman.frenchCode)(Huffman.decodedSecret)
  }
}
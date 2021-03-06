package excercises.week6

object Lecture6_2 {
  
	def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)
                                                  //> isPrime: (n: Int)Boolean
	
	val n = 7                                 //> n  : Int = 7
	
	val sequence = (1 until n) map (i => (1 until i) map (j => (i, j)))
                                                  //> sequence  : scala.collection.immutable.IndexedSeq[scala.collection.immutable
                                                  //| .IndexedSeq[(Int, Int)]] = Vector(Vector(), Vector((2,1)), Vector((3,1), (3,
                                                  //| 2)), Vector((4,1), (4,2), (4,3)), Vector((5,1), (5,2), (5,3), (5,4)), Vector
                                                  //| ((6,1), (6,2), (6,3), (6,4), (6,5)))
	(sequence foldRight Seq[Any]()) (_ ++ _)  //> res0: Seq[Any] = Vector((2,1), (3,1), (3,2), (4,1), (4,2), (4,3), (5,1), (5,
                                                  //| 2), (5,3), (5,4), (6,1), (6,2), (6,3), (6,4), (6,5))
	sequence.flatten filter { case (x, y) => isPrime(x + y) }
                                                  //> res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
	val flatSequence = (1 until n) flatMap (i => (1 until i) map (j => (i, j))) filter { case (x, y) => isPrime(x + y) }
                                                  //> flatSequence  : scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((
                                                  //| 2,1), (3,2), (4,1), (4,3), (5,2), (6,1), (6,5))
                                                  
	for {
		i <- 1 until n
		j <- 1 until i
		if (isPrime(i+j))
	} yield (i, j)                            //> res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
  
  def scalarProduct(xs: Vector[Double], ys: Vector[Double]) =
  	(for ( (x,y) <- xs zip ys ) yield x*y).sum//> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double
  
  scalarProduct(Vector(1, 2, 3), Vector(4, 5, 6)) //> res3: Double = 32.0
}
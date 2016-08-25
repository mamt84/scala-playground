package excercises.week6

object Lecture6_1 {
  val xs = Array(1, 2, 3, 44)                     //> xs  : Array[Int] = Array(1, 2, 3, 44)
  xs map (x => x*2)                               //> res0: Array[Int] = Array(2, 4, 6, 88)
  
  val s = "Hello World"                           //> s  : String = Hello World
  s filter (c => c.isUpper)                       //> res1: String = HW
  
  val r1: Range = 1 to 5                          //> r1  : Range = Range(1, 2, 3, 4, 5)
  val r2: Range = 1 until 5                       //> r2  : Range = Range(1, 2, 3, 4)
  1 to 10 by 3                                    //> res2: scala.collection.immutable.Range = Range(1, 4, 7, 10)
  6 to 1 by -1                                    //> res3: scala.collection.immutable.Range = Range(6, 5, 4, 3, 2, 1)
  
  //List all conbinations of numbers x and y where x goes from 1 to M and y goes from 1 to N
  val M = 7                                       //> M  : Int = 7
  val N = 13                                      //> N  : Int = 13
  
  (1 to M) flatMap (x => (1 to N) map (y => (x, y)))
                                                  //> res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2
                                                  //| ), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9), (1,10), (1,11), (1,12), 
                                                  //| (1,13), (2,1), (2,2), (2,3), (2,4), (2,5), (2,6), (2,7), (2,8), (2,9), (2,10
                                                  //| ), (2,11), (2,12), (2,13), (3,1), (3,2), (3,3), (3,4), (3,5), (3,6), (3,7), 
                                                  //| (3,8), (3,9), (3,10), (3,11), (3,12), (3,13), (4,1), (4,2), (4,3), (4,4), (4
                                                  //| ,5), (4,6), (4,7), (4,8), (4,9), (4,10), (4,11), (4,12), (4,13), (5,1), (5,2
                                                  //| ), (5,3), (5,4), (5,5), (5,6), (5,7), (5,8), (5,9), (5,10), (5,11), (5,12), 
                                                  //| (5,13), (6,1), (6,2), (6,3), (6,4), (6,5), (6,6), (6,7), (6,8), (6,9), (6,10
                                                  //| ), (6,11), (6,12), (6,13), (7,1), (7,2), (7,3), (7,4), (7,5), (7,6), (7,7), 
                                                  //| (7,8), (7,9), (7,10), (7,11), (7,12), (7,13))
  def scalarProduct1(xs: Vector[Double], ys: Vector[Double]) =
  	(xs zip ys).map { xy => xy._1 * xy._2 }.sum
                                                  //> scalarProduct1: (xs: Vector[Double], ys: Vector[Double])Double
  
  def scalarProduct2(xs: Vector[Double], ys: Vector[Double]) =
  	(xs zip ys).map { case (x, y) => x * y }.sum
                                                  //> scalarProduct2: (xs: Vector[Double], ys: Vector[Double])Double
  
  scalarProduct2(Vector(1, 2, 3), Vector(4, 5, 6))//> res5: Double = 32.0
  
  1 to 3                                          //> res6: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3)
  
  def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)
                                                  //> isPrime: (n: Int)Boolean
 
 	isPrime(1234567)                          //> res7: Boolean = false
}
package excercises

object Lecture2_1 {
  
  def product(f: Int => Int) (a: Int, b: Int): Int = {
		if (a > b) 1 else f(a) * product(f)(a+1, b)
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int
  
  def binaryOperation(f: (Int, Int) => Int) (g: Int => Int) (a: Int, b: Int): Int = {
		if (a > b) 1 else f(g(a),binaryOperation(f)(g)(a+1, b))
  }                                               //> binaryOperation: (f: (Int, Int) => Int)(g: Int => Int)(a: Int, b: Int)Int
  
  product(x => x) (1, 5)                          //> res0: Int = 120
  
  def factorial (n: Int) = product(x => x)(1, n)  //> factorial: (n: Int)Int
  factorial(5)                                    //> res1: Int = 120
  
  binaryOperation((x, y) => x*y)(x => x)(1,5)     //> res2: Int = 120
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
  	if (a > b) zero
  	else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
  }                                               //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
                                                  
	def product2(f: Int => Int)(a: Int, b: Int) = mapReduce(f, (x, y) => x * y, 1)(a, b)
                                                  //> product2: (f: Int => Int)(a: Int, b: Int)Int
	
	product2(x => x)(1, 5)                    //> res3: Int = 120
}
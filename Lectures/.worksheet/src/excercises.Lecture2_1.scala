package excercises

object Lecture2_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(147); 
  
  def product(f: Int => Int) (a: Int, b: Int): Int = {
		if (a > b) 1 else f(a) * product(f)(a+1, b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(151); 
  
  def binaryOperation(f: (Int, Int) => Int) (g: Int => Int) (a: Int, b: Int): Int = {
		if (a > b) 1 else f(g(a),binaryOperation(f)(g)(a+1, b))
  };System.out.println("""binaryOperation: (f: (Int, Int) => Int)(g: Int => Int)(a: Int, b: Int)Int""");$skip(28); val res$0 = 
  
  product(x => x) (1, 5);System.out.println("""res0: Int = """ + $show(res$0));$skip(52); 
  
  def factorial (n: Int) = product(x => x)(1, n);System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$1 = 
  factorial(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(50); val res$2 = 
  
  binaryOperation((x, y) => x*y)(x => x)(1,5);System.out.println("""res2: Int = """ + $show(res$2));$skip(180); 
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
  	if (a > b) zero
  	else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
  };System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(137); 
                                                  
	def product2(f: Int => Int)(a: Int, b: Int) = mapReduce(f, (x, y) => x * y, 1)(a, b);System.out.println("""product2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(26); val res$3 = 
	
	product2(x => x)(1, 5);System.out.println("""res3: Int = """ + $show(res$3))}
}

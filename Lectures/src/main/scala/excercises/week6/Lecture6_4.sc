package excercises.week6

object Lecture6_4 {
  
	class Poly (termsParam: Map[Int, Double]){
		
		val terms = termsParam withDefaultValue 0.0
		
		def this (bindings: (Int, Double)*) = this (bindings.toMap)
		
		def + (other: Poly) = new Poly (terms ++ (other.terms map adjust))
		
		def sum (other: Poly) = new Poly ((other.terms foldLeft terms)(addTerm))
		
		def addTerm (terms: Map[Int, Double], term: (Int, Double)): Map[Int, Double] = {
			val (exp, coeff) = term
			terms + (exp -> (coeff + terms(exp)))
		}
		
		def adjust (term: (Int, Double)): (Int, Double) = {
			val (exp, coeff) = term
			exp -> (coeff + terms(exp))
		}
		
		override def toString =
			(for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp) mkString " + "
		
	}
	
	val p1 = new Poly(1->2.0, 3->4.0, 5->6.2) //> p1  : excercises.week6.Lecture6_4.Poly = 6.2x^5 + 4.0x^3 + 2.0x^1
	val p2 = new Poly(Map(0->3.0, 3->7.0))    //> p2  : excercises.week6.Lecture6_4.Poly = 7.0x^3 + 3.0x^0
	
	p1 + p2                                   //> res0: excercises.week6.Lecture6_4.Poly = 6.2x^5 + 11.0x^3 + 2.0x^1 + 3.0x^0
                                                  //| 
	p1 sum p2                                 //> res1: excercises.week6.Lecture6_4.Poly = 6.2x^5 + 11.0x^3 + 2.0x^1 + 3.0x^0
                                                  //| 
}
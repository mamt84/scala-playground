package excercises.week4

object Lecture4_5 {
  Sum(Prod(Number(2), Var("x")), Var("y")).show   //> res0: String = 2 * x + y
  Prod(Sum(Number(2), Var("x")), Var("y")).show   //> res1: String = (2 + x) * y
  
  Sum(Prod(Sum(Number(2), Var("x")), Var("y")), Number(10)).show
                                                  //> res2: String = (2 + x) * y + 10
	Prod(Sum(Number(2), Var("x")), Sum(Var("y"), Number(10))).show
                                                  //> res3: String = (2 + x) * (y + 10)
}
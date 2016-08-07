package excercises

import excercises.rationals.Rational

object Lecture2_5 {
  val r1 = new Rational(1, 2)                     //> r1  : excercises.rationals.Rational = 1/2
  
  val r2 = r1.add(new Rational(1,2))              //> r2  : excercises.rationals.Rational = 1/1
  
  r1.neg                                          //> res0: excercises.rationals.Rational = 1/-2
  
  val x = new Rational(1,3)                       //> x  : excercises.rationals.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : excercises.rationals.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : excercises.rationals.Rational = 3/2
  
  y + y                                           //> res1: excercises.rationals.Rational = 10/7
  
  val u = x.sub(y).sub(z)                         //> u  : excercises.rationals.Rational = -79/42
  
  val o = y.add(y)                                //> o  : excercises.rationals.Rational = 10/7
  y.add(y)                                        //> res2: excercises.rationals.Rational = 10/7
  
  val m = new Rational(2000000000, 1000000000)    //> m  : excercises.rationals.Rational = 2/1
	
	m + m                                     //> res3: excercises.rationals.Rational = 4/1
	-m                                        //> res4: excercises.rationals.Rational = -2/1
}
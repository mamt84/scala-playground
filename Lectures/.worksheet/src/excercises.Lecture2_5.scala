package excercises

import excercises.rationals.Rational

object Lecture2_5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(107); 
  val r1 = new Rational(1, 2);System.out.println("""r1  : excercises.rationals.Rational = """ + $show(r1 ));$skip(40); 
  
  val r2 = r1.add(new Rational(1,2));System.out.println("""r2  : excercises.rationals.Rational = """ + $show(r2 ));$skip(12); val res$0 = 
  
  r1.neg;System.out.println("""res0: excercises.rationals.Rational = """ + $show(res$0));$skip(31); 
  
  val x = new Rational(1,3);System.out.println("""x  : excercises.rationals.Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : excercises.rationals.Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : excercises.rationals.Rational = """ + $show(z ));$skip(11); val res$1 = 
  
  y + y;System.out.println("""res1: excercises.rationals.Rational = """ + $show(res$1));$skip(29); 
  
  val u = x.sub(y).sub(z);System.out.println("""u  : excercises.rationals.Rational = """ + $show(u ));$skip(22); 
  
  val o = y.add(y);System.out.println("""o  : excercises.rationals.Rational = """ + $show(o ));$skip(11); val res$2 = 
  y.add(y);System.out.println("""res2: excercises.rationals.Rational = """ + $show(res$2));$skip(50); 
  
  val m = new Rational(2000000000, 1000000000);System.out.println("""m  : excercises.rationals.Rational = """ + $show(m ));$skip(9); val res$3 = 
	
	m + m;System.out.println("""res3: excercises.rationals.Rational = """ + $show(res$3));$skip(4); val res$4 = 
	-m;System.out.println("""res4: excercises.rationals.Rational = """ + $show(res$4))}
}

package excercises.week2

class Rational(x: Int, y: Int) {

  require(y != 0, () => "Denominator must be nonzero");
  
  def this(x: Int) = this(x, 1);
  
  private val g = gcd(x, y);
  val num = x / g;
  val den = y / g;

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0)
      a
    else
      gcd(b, a % b)
  }
  
  def neg = new Rational(-x, y)
  
  def add(that: Rational) = {
    new Rational(num * that.den + that.num * den, den * that.den)
  }
  
  def +(that: Rational)= add(that)
  
  def unary_- = neg
  
  def sub(that: Rational) = -that + this
  
  def -(that: Rational) = sub(that)

  def simplify() = {
    new Rational(num / g, den / g)
  }
  
  def less(that: Rational) = num * that.den < that.num * den
  
  def max (that: Rational) = {
    if (this.less(that))
      that
    else
      this
  }

  override def toString = {
    num + "/" + den
  }
}
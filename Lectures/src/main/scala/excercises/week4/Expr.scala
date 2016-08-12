package excercises.week4

trait Expr {
  def eval: Int = this match{
    case Number(n) => n
    case Sum(left, right) => left.eval + right.eval
  }
  
  def show: String = this match{
    case Number(x) => x.toString
    case Prod(Sum(a, b), Sum(x, y)) => "(" + Sum(a, b).show + ")" + " * " + "(" + Sum(x, y).show + ")"
    case Prod(Sum(x, y), r) => "(" + Sum(x, y).show + ")" + " * " + r.show
    case Prod(l, Sum(x, y)) => l.show + " * " + "(" + Sum(x, y).show + ")"    
    case Sum(l, r) => l.show + " + " + r.show
    case Prod(l, r) => l.show + " * " + r.show
    case Var(x) => x
  }
}

case class Number(n: Int) extends Expr

case class Sum(left: Expr, right: Expr) extends Expr

case class Var(x: String) extends Expr

case class Prod(left: Expr, right: Expr) extends Expr
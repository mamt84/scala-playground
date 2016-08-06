package excercises.week3

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  def contains(x: Int): Boolean = {
    if (x < elem)
      left contains x
    else if (x > elem)
      right contains x
    else
      true
  }

  def add(x: Int): IntSet = {
    if (x < elem)
      new NonEmpty(elem, left add x, right)
    else if (x > elem)
      new NonEmpty(elem, left, right add x)
    else
      this
  }
  
  def union(other: IntSet): IntSet = ((left union right) union other) add elem

  override def toString = "{" + left + elem + right + "}"
}
package excercises.week3

object Empty extends IntSet{
	
	def contains(x: Int): Boolean = false
	
	def add(x: Int): IntSet = {
		new NonEmpty(x, Empty, Empty)
	}
	
	def union(other: IntSet): IntSet = other
	
	override def toString = "."
}
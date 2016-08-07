package excercises.week3

abstract class IntSet {
  def add(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}
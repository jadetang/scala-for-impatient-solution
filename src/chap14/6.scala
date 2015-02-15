package chap14

sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree


object main6 {
  def main(args: Array[String]) {

    def sum(tree: BinaryTree): Int = {
      tree match {
        case Leaf(x) => x
        case Node(left,right) => sum(left)+sum(right)
      }
    }
    val x = Node(Node(Leaf(3), Leaf(8)), Leaf(5))
    println(x)
    println(sum(x))
  }


}
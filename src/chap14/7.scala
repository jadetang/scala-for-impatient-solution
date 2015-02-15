package chap7
sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(nodes:BinaryTree*) extends BinaryTree


object main7{
  def main(args: Array[String]) {
    def leafSum(tree:BinaryTree): Int ={
      tree match {
        case Leaf(x) =>x
        case Node(lst @ _*)=> lst.map(leafSum(_)).sum
      }
    }
    val x = Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
    println(x)
    println(leafSum(x))

  }

}




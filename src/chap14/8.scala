package chap14.exercise8

sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node (opt:String,nodes:Node*) extends BinaryTree

object main8{
  def main(args: Array[String]) {
    def eval(tree:BinaryTree): Int ={
      tree match {
        case Leaf(x) =>x
        case Node(opt,lst @_*)=> {
          opt match {
            case "+" =>lst.map(eval(_)).sum
            case "*" =>lst.map(eval(_)).product
            case "-" => -lst.map(eval(_)).sum
            case _=>throw new Exception
          }
        }
      }
    }
  }
}
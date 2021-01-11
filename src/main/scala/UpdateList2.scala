object UpdateList2 extends App {

  val n = io.Source.stdin.getLines
  println("n="+n)
  println("n.toList="+n.toList)
    val n1 = n.toList.map(_.trim).map(_.toInt)
  println("n1="+n1)
  println(f(n1).map(_.toString).mkString("\n"))


  def f(arr:List[Int]):List[Int] = {
    var result: List[Int] = Nil
    var these = arr
    while (!these.isEmpty) {
      if(these.head<0) result = (these.head * -1)::result
      else result=these.head::result
      these = these.tail
    }
    result.reverse
  }

}


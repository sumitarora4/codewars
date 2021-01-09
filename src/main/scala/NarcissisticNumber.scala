import java.util.Scanner

object NarcissisticNumber {

  def main(args: Array[String]): Unit = {

    val s = new Scanner(System.in)
    val n = s.nextInt()

    println(narcissistic(n))

  }

  def narcissistic(n: Int): Boolean = {

    /*val len = n.toString.length
    var sum = 0.0

    for (i <- n.toString) {

//      val intValue = i.toString.toInt
      val intValue = i.asDigit

      val powResult = scala.math.pow(intValue, len)

      sum = sum + powResult
    }
*/


    // with out using mutable var variable
    val d = n.toString.map{ i =>

      scala.math.pow(i.asDigit, n.toString.length)}.sum

    if (d == n) true else false




  }


}

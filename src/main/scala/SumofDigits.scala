/*
import java.util.Scanner


object SumofDigits {

  def main( args: Array[String]): Unit ={

    val s = new Scanner(System.in)
    val n = s.nextInt()

   println(digitalRoot(n))
  }

  def digitalRoot(n: Int): Int = {

    var sum = 0

    for(i <- n.toString){

      sum = sum + i.asDigit;

      println("sum="+sum)

      if(sum.toString.length > 1){

        var totalSum = 0
        for(j <- sum.toString){

          println("j="+j)

          println("totalSum="+totalSum)

          totalSum = totalSum + j.asDigit

          println("totalSum="+totalSum)
        }
        totalSum

      }
      else{

        sum
      }
    }

  }

}
*/

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object Main {

  //day1

  def main(args: Array[String]): Unit = {
    val lines = Source.fromFile("C:\\Users\\aikins.dwamena\\Documents\\TLC5\\Springboot\\Advent Of Code\\src\\AdventOfCodeFiles\\day1input.txt").getLines.toArray
    val maxValues =  ArrayBuffer[Int]();
    var maxValue:Int = 0;
    for(line <- lines) {
      if(line == ""){
        maxValues += maxValue
        maxValue= 0
      }else{
        maxValue = maxValue + line.toInt;
      }
    }
      println(maxValues.sorted(Ordering.Int.reverse))
    }
}
object MinMax {
    def minmax(arr: Array[Int]) : (Int,Int) = {
        var maximum=arr.max
        var minimum=arr.min
        return (minimum,maximum)
    }
    def main(args: Array[String]) : Unit = {
        var arr = (for(i <- 1 to 10) yield scala.util.Random.nextInt(100)).toArray
        val (min,max)=minmax(arr)
        println("Array : "+arr.mkString(" "))
        println("Minimum = "+min+"\nMaximum = "+max)
    }
}
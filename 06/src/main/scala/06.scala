object MinMax {
    def minmax(arr: Array[Int]) : (Int,Int) = {
        var maximum=arr.max
        var minimum=arr.min
        return (minimum,maximum)
    }
    def main(args: Array[String]) : Unit = {
        var arr=Array(3,4,6,2,7,9,8,90,34,-34)
        val (min,max)=minmax(arr)
        println("Minimum = "+min+"\nMaximum = "+max)
    }
}
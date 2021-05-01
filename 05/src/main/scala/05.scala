import scala.io.Source
object WordCount {
    def main(args:Array[String]) : Unit = {
        //val wordlist = List("name", "char", "str", "str", "str", "kl")
        val filename = args(0)
        var wordCount = scala.collection.mutable.Map[String,Int] ()
        for (line<-Source.fromFile(filename).getLines)
            for(word<-line.split(" "))
                wordCount(word) = if(wordCount.contains(word)) wordCount(word)+1 else 1
        println(wordCount)
    }
}
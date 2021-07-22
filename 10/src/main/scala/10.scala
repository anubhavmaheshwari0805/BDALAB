import org.apache.spark._
import org.apache.spark.{SparkContext, SparkConf}
import org.apache.spark.rdd.RDD
import com.google.gson._

object TweetUtils {
    case class Tweet (
        id : String,
        user : String,
		userName : String,
		text : String,
		place : String,
		country : String,
        lang : String
	)
    def parseFromJson(lines:Iterator[String]):Iterator[Tweet] = {
        val gson = new Gson
        lines.map(line => gson.fromJson(line, classOf[Tweet]))
	}
}
object tweetmining {
    def main(args: Array[String]) {
        val conf = new SparkConf().setAppName("User mining").setMaster("local[*]")
        val sc = new SparkContext(conf)
        var path = ""
        if (args.length != 1) {
            println()
            println("ERROR!!! : You Entered " + args.length +" argument(s). Enter only 1 argument.")
            System.exit(1)
        }
        path = args(0)
        val tweets = sc.textFile(path).mapPartitions(TweetUtils.parseFromJson(_))
        val tweetsByUser = tweets.map(x=>(x.user,x)).groupByKey()
        val numTweetsByUser = tweetsByUser.map(x=>(x._1,x._2.size))
        val sortedUsersByNumTweets = numTweetsByUser.sortBy(_._2, ascending=false)
        sortedUsersByNumTweets.take(10).foreach(println)
        val selectedTweets=sc.parallelize(sortedUsersByNumTweets.take(10))
        selectedTweets.saveAsTextFile("TweetsDirectory")
    }
}

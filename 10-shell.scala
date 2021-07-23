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
var path="/home/anubhav/BDTLAB/10/rt.json"
val tweets = sc.textFile(path).mapPartitions(TweetUtils.parseFromJson(_)) 
val tweetsByUser = tweets.map(x=>(x.user,x)).groupByKey()
val numTweetsByUser = tweetsByUser.map(x=>(x._1,x._2.size))
val sortedUsersByNumTweets = numTweetsByUser.sortBy(_._2, ascending=false)
sortedUsersByNumTweets.take(10).foreach(println)

val matches = spark.read.format("csv").option("sep" , "," ).option("inferSchema" , "true").option("header", "true").load("/home/anubhav/BDTLAB/IPL/Match.csv")
matches.createOrReplaceTempView("matches")
println("Matches in which toss winner also wins the match : ")
spark.sql("select Match_Id, Match_Date, Team_Name_Id, Opponent_Team_Id, Match_Winner_Id as Winner_Id from matches where Match_Winner_Id=Toss_Winner_Id").show()
val m=spark.sql("select count(*) from matches where Match_Winner_Id=Toss_Winner_Id").first()(0).toString.toDouble
val n=spark.sql("select count(*) from matches").first()(0).toString.toDouble
val anspercentage=(m*100)/n
println("The percentage of matches where toss was won by team and also won the match = "+anspercentage+"%")

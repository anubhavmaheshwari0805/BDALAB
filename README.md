# BDALAB

## Part A

### Implement the following exercises using R
1.  a. Create three different variables, one that is numeric type and other two are vector of characters. Use these to create  data frame of student.(USN, Name, Marks)
    b. Add a new numeric data column to the existing data frame (Age). Provide summary of the data
    c. Display the list of students whose Age is less than 20 and Marks greater than 25.
2.	Write a program to create the csv file for storing Employee data, containing the fields  (EmpID, EmpName, DOJ,Dept, Desig.)
    a.	Read the suitable number of employee details from the user.
    b.	Create a dataframe of Employee
    c.	Store the dataframe in the csv file
    d.	Read the data from csv and Display the contents
    e.  Append a new row into the csv file
3.	Exploring Dataset 
  a. List the data set available in your system using suitable command
  b. Select “mtcars” data set, find and display the number of rows and columns in that data set
  c. Find are there more automatic (0) or manual (1) transmission-type cars in the dataset?   Hint: 9th column indicates the transmission type
  d. Get a scatter plot of ‘hp’ vs ‘weight’.
  e. Change ‘am’, ‘cyl’ and ‘vs’ to integer and store the new dataset as ‘newmtc’.
  f. Extract the cases where cylinder is less than 5
4.	Consider “Airquality” dataset
  a.	Display the dimension ofthe dataset
  b.	Display the class of each fields in the data set
  c.	Test the missing values
  d.	Recode the missing values, as mean ofthe column values
  e.	Exclude the missing values

### Implement the following exercises using Scala
5.	Write a program that reads words from a file. Use a mutable map to count how often each word appears.
6.	Write a function minmax (values: Array[Int]) that returns a pair containing thesmallest and largest values in the array.
7.	Write the menu driven program to implement quick sort algorithm using imperative style and functional style.
8.	Write the program to illustrate the use of pattern matching in scala, for the following
  Matching on case classes. Define two case classes as below:
  abstractclassNotification
  caseclassEmail(sender: String, title: String, body: String) extendsNotification
  caseclassSMS(caller: String, message: String) extendsNotification
  Define a function showNotification which takes as a parameter the abstract type Notification and matches on the type of Notification (i.e. it figures out whether it’s an Email or SMS). 
  In the case it’s an Email(email, title, _) return the string: s"You got an email from $email with title: $title“
  In the case it’s an SMS return the String:  s"You got an SMS from $number! Message: $message“

## Part B

### Implement the following exercises using Spark
		For running the program :
		. Go to dir where src dir is child dir.
		. Check your dependencies in build.sbt file
		. open terminal
		. sbt package
		. sbt compile
		. sbt run
9.	WordCount: Here the goal is to count how many times each word appears in a file and write out a list ofwords whose count is strictly greater than 4.
  Use the file log.txt accompanying this assignment to count the words.Save the wordcounts in text form in the "wordcountsDir" using the saveAsTextFile RDD method.Examine the contents ofthe above directory, andthe contents ofthe files ofthe directory.
		Note:  Output is stored in wordsdir directory. (Delete this dir before running the pgm, otherwise error comes)
10.	Tweet Mining: A dataset with the 8198 reduced tweets, reduced-tweets.json will be provided.The data contains reduced tweets as in the sample below:
{"id":"572692378957430785",
"user":"Srkian_nishu :)",
"text":"@always_nidhi @YouTube no idnt understand bti loved of this mve is rocking",
"place":"Orissa",
"country":"India"}
A function to parse the tweets into an RDD will be provided. The task is to print the top 10 tweeters.
		Note: Spark-shell version of the same pgm is stored in 10/10-shell.scala file and output ss is 10.png.
## Self Demonstartion of the below programs
1.	IPLTossWinStats: You will be provided with a dataset from the Indian Premier League containing the following files:
  Ball_by_Ball.csv, Match.csv, Player.csv, Player_Match.csv, Season.csv, Team.csv.
  We want to find the percentage of game wins by teams which win the toss.Solets say N games have been played. Let us say there are M games where the team which has won the toss has also won the game. So we are looking for the percentage (M * 100 / N).Perform the task using SQL code only.
		Note: Spark-shell version of the same pgm is stored in IPL/ipl-shell.scala file and output is ipl.png.
2.	Streaming Rainfall Averages: Consider the scenario that there are three weather stations in Bangalore which report the rainfall at the respective locations once every 15 minutes. You have to write a Spark Streaming application which will gather the rainfall data from the three stations and print the average rainfall, also once every 15 minutes.
  You will be provided with a scala program, generate Events, which can simulate generation of the rainfall data from the three stations in JSON format  as shown below to a folder:{"Creation_Time": 1.53633593969400013E18,"Station":  "Bengaluru-1","Rainfall": 100.0} Write a Spark streaming application which reads the files written to the above folder and updates the average rainfall value every 15 minutes and prints the averages to the console.

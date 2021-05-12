abstract class Notification
case class Email(sender: String, title: String, body: String) extends Notification 
case class SMS(caller: String, message: String) extends Notification

object Pattern {
    def showNotification (noti : Notification) : String = {
        noti match {
            case Email(sender, title, _) =>
                s"You got an email from '$sender' with Title: '$title'"
            case SMS(caller, msg) =>
                s"You got an SMS from '$caller' with Message: '$msg'"
        }
    }
    def main(args: Array[String]): Unit = {
        var email=Email("abcde@nmit.ac.in","Big Data Analysis Lab Programs Brief","4 R Programs, 4 Scala Programs and 2 Spark Programs")
        var sms=SMS("+915746516985","Hello, How are You?")
        println(showNotification(email))
        println(showNotification(sms))
    }
}
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun main() {
    println(displayAlertMessage(emailId = "user@example.com"))
}

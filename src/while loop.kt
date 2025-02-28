fun main() {
    val balance = readln().toInt()                      // Read the initial balance
    val purchases = readln().split(" ").map { it.toInt() } // Read purchases as a list of integers
    var currentBalance = balance                        // Variable to keep track of the balance

    for (purchase in purchases) {                       // Loop through each purchase
        if (currentBalance >= purchase) {               // Check if balance is enough for this purchase
            currentBalance -= purchase                  // Deduct the purchase from balance
        } else {
            // If balance is insufficient, print error message and exit
            println("Error, insufficient funds for the purchase. Your balance is $currentBalance, but you need $purchase.")
            return
        }
    }

    // If all purchases are successful, print the final balance
    println("Thank you for choosing us to manage your account! Your balance is $currentBalance.")
}

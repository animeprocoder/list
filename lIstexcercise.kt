fun main(){
    val winners = listOf("usain", "JOHN", "MICHAEL", "ALEX", "BOB")
    println(winners.indexOf("MICHAEL"))

    // 2
    val requiredcolORs = listOf("red", "green", "blue")
    val availablecolors = listOf("red", "blue")
    println(availablecolors.containsAll(requiredcolORs))

    // 3
    val funcingredients = arrayListOf("Chicken", "Egg" , "Mozzarella", "Pepper")
    funcingredients[funcingredients.indexOf("Mozzarella")] = "blue cheese"
}
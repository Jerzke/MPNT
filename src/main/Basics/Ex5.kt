import kotlin.random.Random

fun main(args: Array<String>) {
    val names = arrayOf<String>("Jouni", "Jukka","Janne", "Kaisa","Lasse");
    val winner = Random.nextInt(0, 4);
    for (i in names) {
    println(i)
    }
    for (winner in names){
        println("The winner is $winner");
        break
    }



}
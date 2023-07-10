import kotlin.random.Random

fun main(args: Array<String>) {

    val number = Random.nextInt(-10, 10)

    if(number != 0 && number > 0){
        println("Positive $number")
    }else if(number != 0 && number < 0){
        println("Negative $number")
    }else {
        println("Zero $number");
    }
}


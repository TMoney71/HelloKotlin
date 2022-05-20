import java.math.BigDecimal

//This is one a function starts with fun then the name and the return
//fun getGreeting() : String {
//    return "Hello Kotlin"
//}

//These are the same

//fun getGreeting() : String = "Hello Kotlin"
////Unit means that it will not return anything useful exp (fun sayHello() : Unit {}


//fun sayHello() {
//    println(getGreeting())
//}


// This was the tutorial of array
//fun main() {
//  val interestingthings = arrayOf("Kotlin", "programming", "python", "games")
//    println(interestingthings.size)
//         println(interestingthings[0])
//    println(interestingthings.get(0))
//    interestingthings.forEach {
//        println(it)
//    interestingthings.forEachIndexed { index, s ->
//        println("$s is at $index")
//    }
//    interestingthings.forEach {interestingthing ->
//        println(interestingthing)
//    }
//}

//Val can not be changes but Var can be changed
//val name = "Tyson"
//var greeting: String? = "Hello"

//fun main() {
////    val greetingToBe = if(greeting != null) greeting else "Hi"
//    val greetingToBe = when (greeting) {
//        null -> "Hi"
//        else -> greeting
//    }
//    if(greetingToBe != null) {
//        println(greetingToBe)
//    }
//    else{
//        println("Hi")
//    }
//    println(name)
//
//}
//fun main() {
//    when(greeting){
//        null -> println("Hi")
//        else -> println(greeting)
//    }
//    println(name)
//}

// I really like this that you can set a sting
//fun sayHello(greeting : String, itemsToGreet : List<String>) {
//    itemsToGreet.forEach { itemsToGreet ->
//        println("$greeting $itemsToGreet")
//    }
////    val msg = "$greeting $itemsToGreet"
////    println(msg)
//}
//fun main() {
//    val interestingThings = mutableListOf("Kotlin", "Java", "other")
//    interestingThings.add("Dogs")
//
////    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
////    map.put(4, "d")
////
////    map.forEach { (key, value) -> println("$key -> $value") }
//
//    }

val bag = mutableListOf<String>()
var firstName = "Tyson"
var lastName = "Mergel"
var lock = mutableMapOf(1 to "a", 2 to "b", 3 to "c", 4 to "d")
val unlock = mutableMapOf(1 to "c", 2 to "a", 3 to "d", 4 to "b")
public var name = "doug"
fun main() {
    println("Welcome $firstName $lastName to a stroll in the park, this name does not fit you...")
    var firstName = "Big"
    var lastName = "Kahuna"
    println("I feel like the $firstName $lastName would fit you so much better.")
    println("Okay $firstName $lastName your task today is to go and find some things")
    println("For example this Key that I have here all you need to do is walk past it and you will collect it")
    walk().key()
    println("Lets look in your bag $bag")
    println("Well you won't be needing that")
    bag.remove("key")
    println("Well first we need to get outside to get this walk started. To bad your parents locked you inside")
    Door().unlock()
    println("Looks like I was right we need to get this unlock what is the code")
    lock.forEach {(key, value) -> println("$key -> $value")}
    println("Lets see if we switch the letter around maybe they were lazy")
    lock.replace(1 , "a", "c" )
    lock.replace(2 , "b", "a" )
    lock.replace(3 , "c", "d" )
    lock.replace(4 , "d", "b" )
    lock.forEach {(key, value) -> println("$key -> $value")}
    Door().unlock()
    println("Now it is time for the walk")
    println("Hey look theres a tree and looks like theres an apple")
    walk().apple()
    println("This is a really nice day and look we have an apple -> $bag")
    println("There is a pen on the ground as well you may")
    walk().pen()
    println("Now why is there a random chest in the middle of the sidewalk")
    walk().chest()
    println("Well it looks like this one we can not pick up, looks like that key that we had earlier would have helped" +
            "Don't look at me I don't have it any more!")
    println("You seem hungry, you should eat that apple $bag")
    Use().eat()
    println("I guess you were hungry, at least you didn't eat the seeds let go the the trash can to through it away $bag")

}


class walk() {
    fun apple(){
        println("You found an apple")
        bag.add("apple")
    }
    fun pen(){
        println("You found a pen")
        bag.add("pen") or bag.add("Broken Pen")
    }
    fun key(){
        println("YOU FOUND A KEY")
        println("I wonder what it is used for")
        bag.add("key")

    }
    fun chest(){
        when (bag.contains("key")) {
            true -> bag.add("Map") and bag.add("Gold")
            else -> println("You don't have a key for this item and it is to heavy to carry")

        }
    }

    }

class Use() {
    fun eat() {
        bag.remove("apple")
        bag.add("apple core")
    }
}

class Door(){
    fun unlock() {
        if (lock == unlock){
            println("Hey it looks like we got it open")
        } else {
            println("Looks like we need to try again")
        }

    }
}

class Animal(var name : String = "Doug"){
    fun Dog(){
        println("Hey look its the street dog $name" +
                "Isn't it hostel?" +
                "Oh no here he comes")
        println("Don't let him get your bag")
//        bag.removeAll()
    }
}

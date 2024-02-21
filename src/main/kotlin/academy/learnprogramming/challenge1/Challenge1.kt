package academy.learnprogramming.challenge1

fun main(){

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 and hello2 are referentially equal: ${hello1 === hello2}")
    println("hello1 and hello2 are structurally equal: ${hello1 == hello2}")

    var i = 2988

    var anyVar: Any = "The Any type is the root of Kotlin class hierarchy"
    if(anyVar is String) {
        println(anyVar.uppercase())
    }

    println("""   1
        |  11
        | 111
        |1111
    """.trimMargin())

    println("""1   1
        1  11
        1 111
        11111
    """.trimMargin("1"))

}

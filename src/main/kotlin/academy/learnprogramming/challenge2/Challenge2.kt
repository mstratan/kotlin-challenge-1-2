package academy.learnprogramming.challenge2

fun main() {

    //1
    var float1 = -3847.384F
    var float2: Float = -3847.384.toFloat()

    //2
    var float3: Float? = -3847.384F
    var float4: Float? = -3847.384.toFloat()

    //3
    val arrShort: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    //4
    val arrInt = Array<Int?>(40) {i -> 5*(i+1)}

    //5
    var arrChar = charArrayOf('a', 'b', 'c')
    Util().method1(arrChar)

    //6
    val x: String? = "I AM IN UPPERCASE"
    val y = x?.lowercase() ?: "I give up!"

    //7
    val z: String
    x?.let { z = x.lowercase().replace("am", "am not") }

    //8
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}
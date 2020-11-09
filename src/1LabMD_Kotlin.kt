import java.math.BigInteger

fun booleanExpression(a: Boolean, b: Boolean, c: Boolean, d:Boolean): Boolean {
    return ((a xor b) and (c xor d)) or ((a xor c) and (b xor d)) or ((a xor d) and (b xor c))
}

fun leapYearCount(Year: Int): Int {
    return Year/4 - Year/100 + Year/400
}

fun flipBit( Value: Int, bitIndex: Int): Int {
    return Value xor (1 shl bitIndex - 1)
}

fun isPowerOfTwo(Value: Int): Boolean {
    val begin = Math.log(Math.abs(Value).toDouble()) / Math.log(2.0)
    val result = begin.toInt()
    val double_result = begin - result
    return double_result == 0.0
}

fun isPalindrome(Text: String): Boolean{
    var Text = Text.replace("[^a-zA-Z0-9]".toRegex(), "")
    val sbtext = StringBuilder(Text)
    val rtext = sbtext.reverse().toString()
    return Text.equals(rtext)
}
fun factorial( Value: Int): BigInteger {
    var answ = BigInteger.ONE
    if (Value === 1) {
        return answ
    }
    if (Value <= 0) {
        answ = BigInteger.ZERO
        return answ
    }
    answ = BigInteger.valueOf(Value.toLong())
    return answ.multiply(factorial(Value - 1))
}
fun mergeArrays(a1: IntArray, a2: IntArray): IntArray {
    if (a1 == null) return a2
    if (a2 == null) return a1
    var SizeRes = IntArray(a1.size + a2.size)
    var j1 = 0
    var j2 = 0
    for (i in 0 until SizeRes.size) {
        if (j1 < a1.size && j2 < a2.size) {
            if (a1[j1] < a2[j2]) {
                SizeRes[i] = a1[j1]
                j1++
            } else {
                SizeRes[i] = a2[j2]
                j2++
            }
        } else if (j1 < a1.size) {
            SizeRes[i] = a1[j1]
            j1++
        } else if (j2 < a2.size) {
            SizeRes[i] = a2[j2]
            j2++
        }
    }
    return SizeRes
}

    fun main(args: Array<String>){
        var a = true
        var b = false
        var c = true
        var d = true
        var Year = 2000
        var bitIndex = 10
        var a1: IntArray = intArrayOf(0,2,2)
        var a2: IntArray = intArrayOf(1,3)
        var Res = mergeArrays(a1, a2)

        println(leapYearCount(Year))

        println(booleanExpression(a, b, c, d))

        println(flipBit(Year, bitIndex))

        println(isPowerOfTwo(8))

        println(isPalindrome("asd12^/%$21dsa"))

        println(factorial(5))
        for (i in 0 until Res.size){
            println(Res[i])
        }
}
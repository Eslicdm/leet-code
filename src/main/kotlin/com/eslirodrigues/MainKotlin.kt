package com.eslirodrigues

fun main() {
    println(gcdOfStrings("ABABAB", "ABAB"))
}

fun gcdOfStrings(str1: String, str2: String): String {
    if ((str1 + str2) != (str2 + str1)) {
        return ""
    }
    val gcdVal = gcd(str1.length, str2.length)
    return str1.substring(0, gcdVal)
}

fun gcd(p: Int, q: Int): Int {
    if (q == 0) return p
    return gcd(q, p % q)
}
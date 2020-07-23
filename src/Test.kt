package intro

import intro.color.*

enum class color{
    BLUE, RED, GREEN, YELLOW

}

fun main(args: Array<String>){
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    val a = 10
    val b = 12
    var res = if(a<b) a+b else false
    val test = mutableListOf<String>("test2")
    test.add("test1")
    println(name + " " + res)
    println(max(a,b))
    display()
    println(dispColor(color.BLUE))
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_name1234"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))
}

fun max(a: Int, b: Int): Int = if(a>b) a else b
fun display( character: Char = '*', size: Int =10 ){
  repeat(size){
      print(character)
  }
}
fun dispColor(color: color) : String =
    when(color){
        BLUE -> "My Fav"
        RED ->"Ughhhh"
        GREEN -> "ewww"
        else -> "Donno"
    }
fun setDisp(c1: color, c2: color) =
    when(setOf<color>(c1,c2)){
        setOf(BLUE, GREEN) -> YELLOW
        else -> "Unkown"
    }
fun isValidIdentifier(s: String): Boolean {

     var returnVal = false
    if (s.isNullOrEmpty() || s in "0".."9" ) returnVal = false
     else {

         for (i in  0 .. s.length-1 ){

              if(s[i]>= 'a' && s[i]>='b' || s[i] >='0' && s[i]<='9'|| s[i]=='_' ) returnVal = true
              else  returnVal = false

         }

     }
    return returnVal
}

fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

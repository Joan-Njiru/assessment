fun main() {
    val longer =stringLength("Joan","Wanjiru")
    println(longer)
    takeString("I, am, a, student")
    val result = joinArray(arrayOf("Angela","Adisa","Mwongela"))
    println(result)

    val calc = Calculator()
    calc.sum

}


//1. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun stringLength(string1:String,string2:String):Char{
if(string1.length>string2.length) {
    return string1[0]
}
    else if (string2.length>string1.length){
        return string2[0]
    }
    else{
        return string1[0]

}

}
//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements

//fun takesArrays(num1:Array<Int>, num2:Array<Int>, num3:Array<Int>):Int{
//    var one = num1.size
//    var two = num2.size
//    var three = num3.size
//

//}

//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output. (3 pts)

fun takeString(word:String){
    println(word.split(","))
}
//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun joinArray(name1:Array<String>,name2:Array<String>,name3:Array<String>):String{
    val join = arrayOf(name1).plus(arrayOf(name2)).plus(arrayOf(name3)).contentToString()
    return join
}

//5. Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions

class Calculator(var sum:Int),var{
    fun addition(){
        sum = number1.plus(number2)
    }
    fun subtraction()
}
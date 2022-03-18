fun main(){
    var x=arrays(arrayOf(50,15,30,25))
    println(x)
var w=mixedtypes(arrayOf("Naomi",456,98.4,67.8,true))
    println(w)
    var n=characters(arrayOf('e','s','r','u','a','w','i'))
    println(n)

    }

fun arrays(numbers:Array<Int>): Int{
    var product=1
    numbers.forEach { number->
        product*=number
    }
    return product
}
fun mixedtypes(digits:Array<Any>) :Double{
    var sum=0.0
    digits.forEach { number->
        if (number is Int|| number is Double)
    sum+=number.toString().toDouble()

        }
     return sum
    }
fun characters(chars:Array<Char>): Int {
    var vowels=0
    chars.forEach { r->
        if (r=='a'||r=='e'||r=='i' ||r=='o'||r=='u'){
          vowels++
             }
         }
        return vowels

     }


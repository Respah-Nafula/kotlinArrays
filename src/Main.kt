fun main(){
siblings(arrayOf("Leah","Rebeccah","Respah","Eunice"))
city(arrayOf())
    numbers(arrayOf())
   var all =names("Naomi","Sharon","Pauline")
    println(all)

}
fun siblings(sib:Array<String>){
println(sib.contentToString())
}
fun city(places:Array<String>){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    for (d in cities)
        println(d.capitalize())
}
fun numbers(nums:Array<String>){
    var digits= arrayOf(32,17,4,213,78,43,90,31,373,11,158,62)
    println(digits[1]+digits[4])
    println(digits.indexOf(158))
    println(digits.sorted())
}

fun names(c: String,d:String,e:String):String{
    var texts= arrayOf(c,d,e)
    var friends=texts.contentToString()
    return friends
     }


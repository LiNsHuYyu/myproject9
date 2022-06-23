package fju.edu.course_study

class PersonKotlin {
    fun greeting(){
        println("Hello Kotlin!")
    }
}

//Top-level
fun main() {
    val p = PersonKotlin()
    p.greeting()
    //val unalterable
    val num = 123
    //var changeable
    var number = 123
    number = 321
}
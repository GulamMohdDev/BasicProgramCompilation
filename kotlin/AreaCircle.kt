import java.util.Scanner

//Program for Area of circle
fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter radius of circle : ")
    var area:Int = scanner.nextInt()
    val pi = 3.14
    val circle = pi*area*area
    println("Area of circle is: $circle")
}
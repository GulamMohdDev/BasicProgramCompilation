import java.util.Scanner
import kotlin.math.sqrt

/*
* Program for Area of Triangle
*/
fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter 3 side of triangle: ")
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val s = (a+b+c)/2
    val area = sqrt((s*(s-a)*(s-b)*(s-c)).toDouble())
    println("Area of Triangle is : $area")
}
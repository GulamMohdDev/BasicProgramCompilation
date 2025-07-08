import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)
    print("Enter Rupees : ")
    val rs = s.nextInt()
    println("Rs. $rs -> Paisa. ${rs*100} ")
}
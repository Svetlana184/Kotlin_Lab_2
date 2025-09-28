//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("введите число от 1 до 9")
    var n = readLine()!!.toInt()
    val array = numOrder(n)
    for (i in array) {
        println(i)}
}
fun numOrder(n:Int = 4): IntArray{
    fun modifyNum(number:Int, n: Int): Int {
        var counter = Math.pow(10.0, n - 1.toDouble())
        var modifyNumber = 0.0
        for (j in number..9) {
            if (counter < 1.0) break
            else {
                modifyNumber += j * counter
                counter /= 10

            }
        }
        return modifyNumber.toInt()
    }
    var array = IntArray(10-n)
    for(i in 1..10-n){
        var element = modifyNum(i, n)
        array.set(i-1,element);
    }
    return array

}

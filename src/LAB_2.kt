fun main() {
    println("введите число от 1 до 9")
    var n = readLine()!!.toInt()
    val array = numOrder(n)
    for (i in array) {
        println(i)}
}
fun numOrder(n:Int = 4): IntArray{
    fun checkNum(n:Int): Boolean{
        if(n in 1..9) return true
        else return  false
    }
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
    if(checkNum(n)){
        var array = IntArray(10-n)
        for(i in 1..10-n){
            var element = modifyNum(i, n)
            array.set(i-1,element);
        }
        return array
    }
    else{
        println("ошибка при вводе числа")
        val array = IntArray(1)
        array.set(0,0)
        return array
    }
}
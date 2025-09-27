//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("введите число от 1 до 9")
    var n = readLine()!!.toInt()
    val array = numOrder(n)
    for (i in array) {
        println(i)}
}
fun numOrder(n:Int = 4):IntArray{
    var array = IntArray(10-n)
    for(i in 1..<10-n){
        var count = Math.pow(10.0, n.toDouble());
        var number = i*count;
        for(j in i..9){
            number+=count*j;
            count/=10;
        }
        array.set(i,number.toInt());
    }
    return array
}
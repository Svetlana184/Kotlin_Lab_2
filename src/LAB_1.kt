import kotlin.random.Random


fun main() {


    //11.59 Определить частное от деления суммы положительных элементов массива
    //на модуль суммы отрицательных элементов
    var  myArray = Array(10) { _ -> Random.nextInt(-100,100)}
    myArray.forEach { print("$it ") }
    println()
    var sumPlus = myArray.filter{ it > 0 }.sum()
    println("сумма всех положительных элементов: $sumPlus")
    var sumMinus = myArray.filter{ it < 0 }.sum() * (-1)
    println("сумма всех отрицательных элементов: $sumMinus")
    println(sumPlus  / sumMinus)
    println()


    //Дан двумерный массив. Определить:
    //а) сумму всех элементов массива;
    //б) сумму квадратов всех элементов массива;
    //в) среднее арифметическое всех элементов массива
    var myArray2 = arrayOf<Array<Int>>()
    for(i in 0..2) {
        var array = arrayOf<Int>()
        for(j in 0..2) {
            array += Random.nextInt(20)
        }
        myArray2+=array
    }
    for(array in myArray2) {
        for(value in array){
            print("$value ")
        }
        println()
    }

    var sum = 0;
    var sqrtSum = 0;
    var avArr =  emptyArray<Int>()
    for(arr in myArray2) {
        for(value in arr) {
            sum += value
            sqrtSum += value * value
        }
        var temp = (arr.average().toInt())
        avArr+=temp
        println()
    }
    var av = avArr.average()
    println("сумма всех элементов массива: $sum")
    println("сумма квадратов всех элементов массива: $sqrtSum")
    println("среднее арифметическое всех элементов массива: ${String.format("%.2f", av)}")

}
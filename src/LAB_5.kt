//Известно, что на доске 8×8 можно расставить 8 ферзей так, чтобы они не били друг друга.
// Вам дана расстановка 8 ферзей на доске, определите, есть ли среди них пара бьющих друг друга.
// Программа получает на вход восемь пар чисел, каждое число от 1 до 8 — координаты 8 ферзей.
// Если ферзи не бьют друг друга, выведите слово NO, иначе выведите YES.

//Дан список чисел, который могут содержать до 10000 чисел каждый.
// Определите, сколько в нем встречается различных чисел.

//Даны два списка одинаковой длины.
// Необходимо создать из них словарь таким образом, чтобы элементы первого списка были ключами,
// а элементы второго — соответственно значениями нашего словаря.



fun main(){
    //1
    var chest_list = mutableListOf<Chest>()
    for (i in 0..7){
        println("введите строку $i ферзя")
        var x = readln().toInt()
        println("введите столбец $i ферзя")
        var y = readln().toInt()
        chest_list.set(i, Chest(x,y))
    }

    val set_chest = chest_list.toSet()
    if (set_chest.count() != chest_list.count())
        println("NO")
    else{
        println("YES")
    }

    //2
    var list_random : MutableList<Int> = mutableListOf()
    for(i in 10.. Math.round(Math.random()*100)){
        list_random.add((Math.random()*10).toInt())
    }
    for( item in list_random) print("${item} ")
    println()
    val set = list_random.toSet()
    println(set)
    println()

    //3
    val list_keys = mutableListOf<Int>(1,2,3,4,5)
    val list_values = mutableListOf<String>("bob", "alex", "mari", "ann", "karen")
    var people : MutableMap<Int, String> = mutableMapOf()
    for(i in 1..list_keys.count()){
        people.set(list_keys.get(i-1), list_values.get(i-1))
    }
    println(people)
}

data class Chest(val x:Int, val y:Int)
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
    var rezult = "yes"
    var chest_list = mutableListOf<Chest>()
    for (i in 0..7){
        println("введите строку ${i+1} ферзя")
        var x = readln().toInt()
        println("введите столбец ${i+1} ферзя")
        var y = readln().toInt()
        chest_list.add(i, Chest(x,y))
    }

    val set_chest = chest_list.toSet()
    if (set_chest.count() != chest_list.count())
        rezult = "no"
    else{
        for(chest_piece in chest_list) {
            var cancel_list = mutableListOf<Chest>()
            var x = chest_piece.x
            var y = chest_piece.y
            while (x > 2 && x < 7 && y > 2 && y < 7) {
                x -= 1
                y -= 1
                cancel_list.add(Chest(x, y))
            }
            x = chest_piece.x
            y = chest_piece.y
            while (x > 2 && x < 7 && y > 2 && y < 7) {
                x += 1
                y += 1
                cancel_list.add(Chest(x, y))
            }
            x = chest_piece.x
            y = chest_piece.y
            while (x > 2 && x < 7 && y > 2 && y < 7) {
                x += 1
                y -= 1
                cancel_list.add(Chest(x, y))
            }
            x = chest_piece.x
            y = chest_piece.y
            while (x > 2 && x < 7 && y > 2 && y < 7) {
                x -= 1
                y += 1
                cancel_list.add(Chest(x, y))
            }
            x = chest_piece.x
            y = chest_piece.y
            for (i in 0..7) {
                cancel_list.add(Chest(x, i))
                cancel_list.add(Chest(i, y))
            }
            for (chest_check in chest_list) {
                if (chest_check != chest_piece) {
                    if (cancel_list.contains(chest_check)) {
                        rezult = "no"
                        break;
                    }
                }
            }
        }
    }
    println(rezult)



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
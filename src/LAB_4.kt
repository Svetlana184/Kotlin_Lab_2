//Создайте обобщенный класс Container<T>, который может хранить один объект.
// Реализуйте методы:
//  - put(item: T) - сохранить объект
//  - get(): T? - получить объект
//  - clear() - очистить контейнер
//  - isEmpty(): Boolean - проверка на пустоту

fun main() {
    var item1 = Container<Int>(33)
    item1.getItem()
    item1.putItem(22)
    item1.getItem()
    println(item1.isEmpty())
    item1.clearItem()
    println(item1.isEmpty())

    println()

    var item2 = Container<String>("bob")
    item2.getItem()
    item2.putItem("alex")
    item2.getItem()
    println(item2.isEmpty())
    item2.clearItem()
    println(item2.isEmpty())
}



class Container<T>(var item:T){
    fun putItem(item_:T){
        item = item_
    }
    fun getItem() {
        println(item)
    }
    fun clearItem(){
        item = "" as T
    }
    fun isEmpty(): Boolean{
        if(item == "" as T) return true
        return false
    }
}
//Создайте обобщенный класс Container<T>, который может хранить один объект.
// Реализуйте методы:
//  - put(item: T) - сохранить объект
//  - get(): T? - получить объект
//  - clear() - очистить контейнер
//  - isEmpty(): Boolean - проверка на пустоту

class Container<T>(var item:T){

    fun getItem() {
        println(item)
    }
//    fun clearItem(){
//        item = <T>();
//    }


}
fun main() {
    var tom = Employee("Ivanov", 100000, 2015)
    println(tom.DaysExpirience())
    println(tom.Experience())
}

open class Employee{
    constructor(surname:String, salary:Int, year:Int) {
        this.surname = surname
        this.salary = salary
        this.year = year
    }
    private var surname:String = "Noname"
        set(value) {
           field = value
        }
        get() = field
    private var salary:Int = 1
        set(value) {
            if((value > 0) and (value < 100)) field = value
        }
        get() = field
    private var year:Int = 1
        set(value) {
            if((value > 0) and (value < 100)) field = value
        }
        get() = field
    fun Experience():Int{
        return  2025-year
    }
    fun DaysExpirience():Int{
        return (2025-year)*365
    }
}
class DopEmployee(surname: String, salary: Int, year: Int, yearOfBirth: Int) : Employee(surname, salary, year) {
    private var yearOfBirth:Int = 18
        set(value) {
            if(value > 0) field = value
        }
        get() = field
    fun yearsToWork(){
        if(yearOfBirth>60) println("${yearOfBirth - 60} лет работает после 60")
        else println("${60 - yearOfBirth} лет осталось работать до 60")
    }
}
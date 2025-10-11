import java.time.LocalDate

fun main() {
    var tom = Employee("Ivanov", 100000, 2015)
    println(tom.DaysExpirience())
    println(tom.Experience())

    var alice = DopEmployee("Alice", 100000, 2015, 1998)
    alice.yearsToWork()

    var firstCar = Car("BMW", 230.0, 3)
    println(firstCar.Quantity())
    var secondCar = SuperCar("Michael", 230.0, 3, 2000)
    println(secondCar.Quantity())
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
            if(value > 0) field = value
        }
        get() = field
    private var year:Int = LocalDate.now().year
        set(value) {
            if((value > 0) and (value <= LocalDate.now().year)) field = value
        }
        get() = field
    fun Experience():Int{
        return  LocalDate.now().year-year
    }
    fun DaysExpirience():Int{
        return (LocalDate.now().year-year)*365
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

open class Car{
    constructor(mark:String, power:Double, countPlaces:Int) {
        this.mark = mark
        this.power = power
        this.countPlaces = countPlaces
    }
    private var mark:String = "Noname"
        set(value) {
            field = value
        }
        get() = field
    private var power:Double = 1.0
        set(value) {
            if(value > 0.0) field = value
        }
        get() = field
    private var countPlaces:Int = 1
        set(value) {
            if(value > 0) field = value
        }
        get() = field
    open fun Quantity():Double{
        return 0.1 * countPlaces.toDouble() * power
    }
}

class SuperCar(mark: String, power: Double, countPlaces: Int, year:Int) : Car(mark, power, countPlaces){
    private var year:Int = 1
        set(value) {
            if(value > 0) field = value
        }
        get() = field
    override fun Quantity():Double{
        return super.Quantity() - 1.5 * (LocalDate.now().year - year)
    }
}
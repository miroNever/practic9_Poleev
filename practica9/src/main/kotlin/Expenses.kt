import Cimenas.*
class Expenses(var rate: Double,var rentonehall: Double,var total:Double, name: String, session: String, price: Double, hall: Int, audience: Int, type: String) : Cinema(name,session, price,hall, audience, type) {

    public fun ElectricEnergy() {

        println("Введите сколько сеансов фильма $name было сегодня:")
        var count = readln()!!.toInt()
        while (count < 0)
        {
            println("Введите положительное число:")
            count = readln()!!.toInt()
        }
        var timecinema: Int = 2
        println("Тариф за час $rate руб.")
        var pay : Double = (count * timecinema) * rate
        println("Расход електричества за день фильма $name составил: $pay руб.")
        total += pay
    }
    public fun Rent() {

        println("Сколько кинозалов было задействовано за день?")
        var involved = readln()!!.toInt()
        while (involved < 0) {
            println("Введите положительное число:")
            involved = readln()!!.toInt()
        }
        println("Аренда за 1 кинозал состовляет: $rentonehall руб.")
        var sum = involved * rentonehall
        println("Для оплаты за $involved кинозалов потребуется: $sum руб.")
        total+= sum
    }
    public fun TotalCosts(){
        println("Общая сумма затрат за день составляет: $total")
    }

}
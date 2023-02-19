import Cimenas.*
class Profit (var pricepopcorn: Double, var total:Double, name: String, session: String, price: Double, hall: Int, audience: Int, type: String) : Cinema(name,session, price,hall, audience, type){

    public fun TicketSales(){

        println("Введите примерное число посетителей на фильме $name за этот день:")
        var visitors = readln()!!.toInt()
        while (visitors < 0){
            println("Введите положительное число:")
            visitors = readln()!!.toInt()
        }
        var sales = visitors * price
        println("На продаже билетов на фильм $name кинотеатр заработал: $sales руб.")
        total +=sales
    }
    public fun PopcornSales(){
       println("Введите сколько людей купило поп-корн за день")
       var people = readln()!!.toInt()
        while (people < 0){
            println("Введите положительное число:")
            people= readln()!!.toInt()
        }
        var pay = pricepopcorn * people
        println("Кинотеатр заработал на продаже попкорна: $pay руб.")
        total += pay
    }
    public fun TotalProfit(){
        println("Общая прибль за день составила: $total руб.")
    }
}
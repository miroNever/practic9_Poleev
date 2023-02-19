import Products.*
class Bread (var bestbeforedate: Int, var weight: Double, name: String, price: Double, unit: String, view: String, quantity: Double ) : Product(name, quantity){

    public fun Info() {
        println("Едя $name ты больше наедаешься")
    }
    public  fun NameBread() {
        var can = 250
        var forwarehouse = 250 * quantity
        println("Нужно $forwarehouse колосков для того чтобы сдлеать $quantity булок хлеба хранящихся на складе")
    }
    public  fun GetInfo() {
        try {
            println("Сколько на складе $name?")
            quantity = readLine()!!.toDouble()
        }
        catch (e: Exception)
        {
            println("Вы ввели не число")
            quantity = readLine()!!.toDouble()
        }
        println("На складе $name $quantity")
    }
}
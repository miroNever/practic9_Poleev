import Products.*
class Sausage(var bestbeforedate: Int, var weight: Double, name: String, price: Double, unit: String, view: String, quantity: Double ) : Product(name, quantity) {
    public fun Usage(){
        println("$name можно много где использовать в готовке")
    }
    public  fun Nutrients() {
        var calories = 10 * 301
        println("В одном кг колбасы $calories калорий")
        var proteins = (0.3 * calories) / 4
        var fats = (0.3 * calories) / 9
        var carbohydrates = (0.4 * calories) / 4
        println("В 1кг колбасы $proteins белков, $fats жиров, $carbohydrates углеводов")
    }
    public  fun GetInfo() {
        println("Сколько на складе $name?")
        quantity = readLine()!!.toDouble()
        while (quantity < 0)
        {
            println("Вы ввели не число")
            quantity = readLine()!!.toDouble()
        }
        println("На складе $name $quantity")
    }
}
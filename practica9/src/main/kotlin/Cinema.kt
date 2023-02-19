package Cimenas
open class Cinema ( var name: String, var session: String, var price: Double, var hall: Int, var audience: Int, var type: String) {

    open fun GetInfo() {
        println("Введите название фильма:")
        name = readln()!!.toString()
        when (name) {
            "Чебурашка" -> println("$name: Комедия")
            "Аватар 2" -> println("$name: Фэнтази")
            "Трансформеры" -> println("$name: Боевик")
            else -> {
                println("Незнаю такого попробуйте ещё раз:")
                name = readln()!!.toString()
            }
        }
    }

    open fun Info() {
        println("Фильм: $name")
        println("Сеанс: $session")
        println("Цена билета: $price")
        println("Номер кинозала: $hall")
    }

    open fun GetPrice() {
        try {
            println("Сколько билетов хотите купить?")
            var count: Int = readln()!!.toInt()
            while (true)
            {
                if(count > 0) break
                else{
                    println("Введите число больше 0")
                    count = readln()!!.toInt()
                }
            }
            var sum: Double = count * price
            println("Сумма к оплате: $sum руб.")
        } catch (e: Exception) {
            println("Вы ввели не число")
        }
    }
}
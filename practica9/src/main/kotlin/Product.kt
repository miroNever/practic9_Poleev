package Products
open class Product(_name: String)
{
    var name = _name
    var price = 0.0
    var unit = "Undefined"
    var view = "Undefined"
    var quantity = 0.0
    constructor(_name: String, _prace: Double) : this(_name){
        name = _name
        price = _prace
    }
    constructor(_name: String, _price : Double, _unit : String, _view : String, _quantity : Double) : this(_name){
        price = _price
        unit = _unit
        view = _view
        quantity = _quantity
    }
    open fun Name()
    {
        try{
            println("Введите продукт:")
            name = readLine()!!.toString()
            when(name) {
                "Молоко" -> println("$name продаётся в молочном отделе.")
                "Творог" -> println("$name продаётся в молочном отделе.")
                "Колбаса" -> println("$name продаётся в мясном отделе.")
                "Вырезка" -> println("$name продаётся в мясном отделе.")
                "Хлеб" -> println("$name продаётся в хлебобулочном отделе.")
                else -> println("Такого продукта не знаю.")
            }
        }
        catch (e: Exception)
        {
            println(e.message)
        }
    }
    open fun Calories()
    {
        try {
            println("Введите продукт:")
            name = readLine()!!.toString()
            when (name) {
                "Молоко" -> println("Выпив $name (100мл) вы получите 42кал.")
                "Творог" -> println("Съев $name (100г) вы получите 232кал.")
                "Колбаса" -> println("Съев $name (100г) вы получите 301кал.")
                "Филе куриное" -> println("$name (100г) содержит 290кал.")
                "Хлеб" -> println("Съев $name (100г) вы получите 265кал")
                else -> println("Такого продукта не знаю.")
            }
        }
        catch (e: Exception) {
            println(e.message)
        }
    }
    open fun Price() {
        println("$name стоит $price руб.")
    }
}
import Cimenas.Cinema
import Products.Product

fun main()
{
    println("С каким классом хотите работать(product/cinema)")
    var vibor: String = readLine()!!.toString()
    while (vibor != "product" && vibor != "cinema")
    {
        println("С каким классом хотите работать(product/cinema)")
        vibor = readLine()!!.toString()
    }
    when
    {
        (vibor == "product") ->
        {
            var BreadOne = Bread(5, 250.0, "пшеничный хлеб", 30.0, "булок", "Хлебо булочный", 300.0 )
            BreadOne.Info()
            BreadOne.GetInfo()
            BreadOne.NameBread()
            BreadOne.Name()
            BreadOne.Calories()
            BreadOne.Price()
            var SausageOne = Sausage(2, 950.0, "колбаса домашняя", 199.99, "шт", "Мясной отдел", 200.0)
            SausageOne.Usage()
            SausageOne.Nutrients()
            SausageOne.GetInfo()
        }
        (vibor == "cinema") ->
        {
            var kino1 = Cinema("Чебурашка", "14:30", 150.5, 4, 150, "")
            kino1.GetInfo()
            kino1.Info()
            kino1.GetPrice()
            println()
            var kino2 = Expenses(5.84, 500.0, 0.0, "Аватав 2", "15:15", 200.0, 5, 200, "")
            kino2.Info()
            kino2.ElectricEnergy()
            kino2.Rent()
            kino2.TotalCosts()
            println()
            var kino3 = Profit(150.0, 0.0, "Tрансформеры", "7:05", 175.0, 9, 300, "")
            kino3.Info()
            kino3.TicketSales()
            kino3.PopcornSales()
            kino3.TotalProfit()
        }
    }
}
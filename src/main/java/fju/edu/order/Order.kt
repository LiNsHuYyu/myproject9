package fju.edu.fju.edu.order

class Order(var amount:Int, var delivery:Delivery) {
    var shipFee:Int = 0//?????????//
    fun total():Int = amount+shipFee
    fun print(){
        println("$amount\t$delivery.name\t$shipFee\t${total()}")
    }
}

fun main(){
    val Emily = Order(700, Seven11Delivery())
    val Jason = Order(250, FamilyDelivery())
    val Bruce = Order(550, HiLifeDelivery())
    val Timmy = Order(220, ShopeeDelivery())
    Emily.print()
    Jason.print()
    Bruce.print()
    Timmy.print()
}


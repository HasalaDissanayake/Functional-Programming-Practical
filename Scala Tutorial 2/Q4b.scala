object Tutorial01 {

    def attendees(price:Int):Int = 120 + ((15 - price)/5)*20;

    def revenue(price:Int):Int = price * attendees(price);

    def cost(price:Int):Int = 500 + 3*attendees(price);

    def profit(price:Int):Int = revenue(price) - cost(price);

    def main(args: Array[String]): Unit ={

        println(profit(5));         //-180
        println(profit(10));        //480
        println(profit(15));        //940
        println(profit(20));        //1200
        println(profit(25));        //1260  This is most profitted ticket price
        println(profit(30));        //1120
        println(profit(35));        //780
        println(profit(40));        //240
        println(profit(45));        //-500
        println(profit(50));        //-1440

    }
}
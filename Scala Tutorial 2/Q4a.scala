object Tutorial01 {

    def payForNormalHour(normalHours:Int):Int = 250*normalHours;

    def payForOtHour(otHours:Int):Int = 85*otHours;

    def total(normalHours:Int,otHours:Int):Int = payForNormalHour(normalHours) + payForOtHour(otHours);
    
    def tax(normalHours:Int,otHours:Int):Double = total(normalHours,otHours)*0.12;

    def salary(normalHours:Int,otHours:Int): Double = total(normalHours,otHours) - tax(normalHours,otHours);

    def main(args: Array[String]): Unit ={

        println(salary(40,30));

    }
}
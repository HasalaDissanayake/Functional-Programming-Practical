object tutorial_04 extends App{

    def interest(deposit:Double):Double= deposit match{
        case deposit if (deposit <20000) => deposit*0.02;
        case deposit if (deposit <200000) => deposit*0.04;
        case deposit if (deposit <2000000) => deposit*0.035 + deposit*0.065;
        case deposit if (deposit >= 2000000) => deposit*0.065;
    }

    println("Interest is: " + interest(10000))

}
object tutorial05 extends App{

    def isEven(n:Int):Boolean= n match{
        case 0 => true;
        case _ => isOdd(n-1);
    }

    def isOdd(n:Int):Boolean = !(isEven(n));

    def sum(n:Int):Int = n match{
        case n if (n==0) => return 0;
        case n if (isOdd(n)) => return sum(n-1);
        case n if (isEven(n)) => return n+sum(n-1); 
    }

    println(sum(9));

}   
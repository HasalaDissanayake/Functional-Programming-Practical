object tutorial_04 extends App{

    print("Enter a Integer: ");
    var value = scala.io.StdIn.readInt();

    def PatternMatching(input:Int): Unit = input match{
        case input if (input <= 0) => println("Negative/Zero is input")
        case input if (input%2 == 0) => println("Even number is given")
        case input if (input%2 == 1) => println("Odd number is given")
    }

    PatternMatching(value);

}
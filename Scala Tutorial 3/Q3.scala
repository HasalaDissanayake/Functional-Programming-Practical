object Tutorial03{

    def volume(radius:Double):Double = math.Pi*math.pow(radius,3)*4/3;

    def main(args: Array[String]): Unit ={

        println(volume(5));

    }
}
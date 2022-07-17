object Tutorial03{

    def tempConverter(celsius:Double): Double = celsius*1.8 + 32;

    def main(args: Array[String]): Unit = {

        println(tempConverter(35));

    }
}
object Tutorial03{

    def easyPace(distance:Int):Int = 8*distance;
    def TempoPace(distance:Int):Int = 7*distance;

    def main(args: Array[String]): Unit= {

        println("Total time: "+(easyPace(4)+TempoPace(3))+" Minutes");
    }
}
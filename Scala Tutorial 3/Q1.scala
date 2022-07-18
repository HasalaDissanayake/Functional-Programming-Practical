object Tutorial03 {

    def area(radius:Double):Double = math.Pi*math.pow(radius,2);

    def main(args:Array[String]):Unit ={

        printf("Area is: %.2f",area(5));

    }
}

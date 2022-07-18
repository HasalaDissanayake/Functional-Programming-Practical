object Tutorial03{

    def bookPrice(copies:Int):Double = copies*24.95;

    def discount(value:Double):Double = value*0.4;

// assumed that first 50 cost 3 per each and each additional cost 0.75
    def shippingCost(copies: Int):Double = copies match{
        case copies if copies <= 50 => copies*3;
        case copies if copies > 50 => 50*3 + (copies-50)*0.75;
    }
    
    def totalCost(copies:Int): Double = bookPrice(copies)-discount(bookPrice(copies))+shippingCost(copies);

    def main(args: Array[String]): Unit= {

        printf("Total wholesale cost is: Rs. %.2f",totalCost(60));
    }
}
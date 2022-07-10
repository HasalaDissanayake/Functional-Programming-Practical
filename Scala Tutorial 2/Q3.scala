object Tutorial01{

    def main(args: Array[String]): Unit ={

        //Compare Java and Scala Lang

        var (a,b,c,d) = (2,3,4,5);
        var (k,g) = (4.3f,4.0f);

        // println( --b * a + c *d--);   //-- operator is not valid in Scala
        
        // println(a++);                 //++ operator is not valid in Scala
        
        println (-2 * ( g - k ) +c);     //4.6000004
        
        // println (c=c++);              //++ operator is not valid in Scala
        
        // println (c=++c*a++);          //++ operator is not valid in Scala

    }
} 
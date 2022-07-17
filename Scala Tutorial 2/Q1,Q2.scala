object  Tutorial01 {

    def main(args: Array[String]): Unit = {

        //Q1 and Q2
        var i,j,k = 2;
        var m,n = 5;
        var f = 12.0f;
        var g = 4.0f;
        var c = 'X';

        //Q3
        println(k + 12*m);          //62
        println(m/j);               //2 (integer division)
        println(n%j);               //1
        println(m/j*j);             //4 [ (m/j)* j ]
        println(f + 10*5 + g);      //66.0
        //println(++i*n);             //scala doesn't support ++ or --

    }
}
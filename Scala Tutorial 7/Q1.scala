object Q1 extends App {

    val x = new Rational(1,3)
    val y = new Rational(2,5)

    println(x.neg)

}

class Rational(x:Int, y:Int) {

    //precondition
    require(denom > 0, "Denominator must be positive")

    //abstracted methods
    def numer = x
    def denom = y

    def neg = new Rational(-this.numer, this.denom)

    //string interpolation used as deprecation warning occurs
    override def toString = (s"$numer/$denom")

}
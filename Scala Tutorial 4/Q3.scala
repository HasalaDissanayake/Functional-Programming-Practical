object tutorial_04 extends App{

    def toUpper(word:String):String={
        return word.toUpperCase();
    }
    def toLower(word:String):String={
        return word.toLowerCase();
    }
    def formatNames(name:String)(f:(String) => String):String={
        return f(name);
    }

    println(formatNames("Benny")(toUpper));
    println(formatNames("Niroshan".substring(0,2))(toUpper) + formatNames("Niroshan".substring(2))(toLower));
    println(formatNames("Saman")(toLower));
    println(formatNames("Kumara".substring(0,1))(toUpper) + formatNames("Kumara".substring(1,5))(toLower) + formatNames("Kumara".substring(5))(toUpper));

}
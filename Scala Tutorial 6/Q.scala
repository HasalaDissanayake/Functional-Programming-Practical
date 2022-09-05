object Tutorial06 extends App {
    
    val alphabetCapital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val alphabetSimple = "abcdefghijklmnopqrstuvwxyz"

    val encrypt = (character:Char, shift:Int, alphabetCapital:String, alphabetSimple:String) => character match {
        case  character if(character.toInt >= 65 && character.toInt <= 90)  => alphabetCapital((alphabetCapital.indexOf(character) + shift)%alphabetCapital.size)
        case character if(character.toInt >= 97 && character.toInt <= 122)  => alphabetSimple((alphabetSimple.indexOf(character) + shift)%alphabetSimple.size)
    }

    val decrypt = (character:Char, shift:Int, alphabetCapital:String, alphabetSimple:String) => character match {
        case chatacter if(character.toInt >= 65 && character.toInt <= 90) => alphabetCapital((alphabetCapital.indexOf(character) - shift + alphabetCapital.size)%alphabetCapital.size)
        case chatacter if(character.toInt >= 97 && character.toInt <= 122) => alphabetSimple((alphabetSimple.indexOf(character) - shift + alphabetSimple.size)%alphabetSimple.size)
    }

    val cipher = (f:(Char, Int, String, String) => Char, text:String, shift:Int, alphabetCapital:String, alphabetSimple:String) => text.map(f(_, shift, alphabetCapital, alphabetSimple))

    val key = scala.io.StdIn.readLine("Shift by: ").toInt
    val message = scala.io.StdIn.readLine("Message to encrypt: ")

    val encryptedTxt = cipher(encrypt, message, key, alphabetCapital, alphabetSimple)
    val decryptedTxt = cipher(decrypt, encryptedTxt, key, alphabetCapital, alphabetSimple)

    printf("\nEncrypted message: %s\n",encryptedTxt)
    printf("Decrypted message: %s\n",decryptedTxt)

}
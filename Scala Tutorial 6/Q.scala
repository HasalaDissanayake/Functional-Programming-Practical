object Tutorial06 extends App {
    
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val encrypt = (character:Char, shift:Int, alphabet:String) => alphabet((alphabet.indexOf(character.toUpper) + shift)%alphabet.size)
    val decrypt = (character:Char, shift:Int, alphabet:String) => alphabet((alphabet.indexOf(character.toUpper) - shift + alphabet.size)%alphabet.size)


    val cipher = (f:(Char, Int, String) => Char, text:String, shift:Int, alphabet:String) => text.map(f(_, shift, alphabet))

    val key = scala.io.StdIn.readLine("Shift by: ").toInt
    val message = scala.io.StdIn.readLine("Message to encrypt: ")

    val encryptedTxt = cipher(encrypt, message, key, alphabet)
    val decryptedTxt = cipher(decrypt, encryptedTxt, key, alphabet)

    printf("Encrypted message: %s\n",encryptedTxt)
    printf("Decrypted message: %s\n",decryptedTxt)

}
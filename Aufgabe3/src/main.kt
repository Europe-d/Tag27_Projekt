import kotlin.contracts.contract

fun main() {


    var hund1 = Hund("Goufi", "Deutscher Pinscher", 13)
    var hund2 = Hund("Goufi", "Deutscher Pinscher", 12)
    var hund3 = Hund("Vili")

    println("heist ${hund1.name} ist ${hund1.rasse} und  ist ${hund1.age}jahr ")

    hund1.alter()
    println("heist ${hund1.name} ist ${hund1.rasse} und  ist ${hund1.age}jahr ")
}


import classes.Animal
import classes.Insect
import classes.Mammal


fun main(args: Array<String>) {
 var goat : Mammal = Mammal("brown", true)
    var gorrilla : Mammal = Mammal("black", false)
var mosquito: Animal = Insect(noOfWings = 2, skinColor = "brown")

    //println(goat.noOfLegs)
    //println(goat.hasTail)
    //println(mosquito.noOfLegs)

    //println(mosquito.eat())
    //println(goat.eat())

    mosquito.eat()
    gorrilla.eat()
}
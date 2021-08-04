package classes

class Mammal(
    var color: String,
    var tail: Boolean)
    : Animal(4, color, tail) {
        override fun toString(): String{
            return "Mammal has $noOfLegs legs, it is $skinColor in color"
        }
}
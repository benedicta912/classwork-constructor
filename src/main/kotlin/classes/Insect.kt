package classes

class Insect(override var skinColor: String, noOfWings: Int) :
    Animal(6,skinColor, false) {
       override fun eat(){
            println("Insect is eating")
        }
}
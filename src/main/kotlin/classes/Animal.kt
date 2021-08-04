package classes

open class Animal {
    var noOfLegs: Int
   open var skinColor: String
    var hasTail: Boolean

    constructor(noOfLegs: Int, skinColor: String, hasTail: Boolean){
        this.noOfLegs = noOfLegs
        this.skinColor = skinColor
        this.hasTail = hasTail
    }
    open fun eat(){
        println("eating")
    }
}
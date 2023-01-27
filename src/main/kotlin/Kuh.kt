open class Kuh(name:String,gewichte:Double,alter:Int,geschlecht:String,var gibtMilch :Boolean) :Tier(name,gewichte,alter,geschlecht) {





    fun gerauscht(besucher: Besucher){

        println("Muuuh")
        println("${besucher.name} möchte frage ob die Miclh geben kann " )
        if (alter >= 3 && geschlecht == "w"){
            gibtMilch = true
            println("$name hat uns Milch gegeben")
        } else {
            println("$name leider gibt uns keine milch weil noch klein ist.")
        }
    }
}
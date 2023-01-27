open class Pony(name: String, gewichte: Double, alter: Int, geschlecht: String, var geschwindigkeit: Double) :
    Tier(name, gewichte, alter, geschlecht) {


   override fun gerauscht() {
        println("Wiehiehie")
    }


    fun reiten(besucher: Besucher) {


        println("${besucher.name} fragt ob  reiten darf ? ")
        if (alter >= 1 && besucher.alter >= 6) {
            println("du kannst ..reiten ")

        } else {
            println("leider du darfst nicht.")
        }
    }
}

open class Tier(var name: String, var gewicht: Double, val alter: Int, var geschlecht: String) {


   open fun bewegen() {

        println("unsere tiere heist :  $name  das gewicht ist  $gewicht kg und ist $geschlecht aber $alter jahr alt ... die bewegen gerade ")
    }

   open fun gerauscht1() {

        println("unsere $name hat geräuscht Muuuuuhhh")

    }


    open fun gerauscht() {

        println("Muuuuuhhh")

    }

    open fun gestreichlt(besucher: Besucher) {

        println("unsere besuch ${besucher.name}  hat unser tiere $name gestreichlt ")

    }

    open fun feuttern(besucher: Besucher){
        this.gewicht += (gewicht * 0.02)
        println("unsere tiere mit name $name ist von unsere besuch ${besucher.name} gefütert und jetzt das gewicht ist $gewicht kg")
    }
}
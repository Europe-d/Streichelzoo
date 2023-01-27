open class Streichelzoo(var alleTiere: MutableList<Tier>) {

    open fun alleGerauscht() {
        for (i in this.alleTiere) {
            i.gerauscht()
        }

    }
open fun allessen(besucher: Besucher){

    for (essen in this.alleTiere){
      essen.feuttern(besucher)
    }
}

}



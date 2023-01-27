fun main() {

    println("Aufgaben 1,2")
    var besucher = Besucher("Franz", 35)
    var besucher2 = Besucher("Maria", 15)
    var besucher3 = Besucher("Nikos", 20)
    var besucher4 = Besucher("Sissi", 4)

    besucher.besucher()
    besucher2.besucher()
    besucher3.besucher()
    println("welcome unsere besuchen, Ich infomieren über unsere Tiere.. ")


    println("Aufgaben 3")
    println("hier sehen Sie")
    var ersteTiere = Tier("Helga", 35.3, 12, "w")
    var zweiteTiere = Tier("Helgo", 47.5, 8, "m")

    ersteTiere.bewegen()
    zweiteTiere.bewegen()
    ersteTiere.gerauscht()




    println("aufgaben 4")
    ersteTiere.gestreichlt(besucher2)
    zweiteTiere.gestreichlt(besucher)


    println("Aufgaben 5")
    ersteTiere.gerauscht1()
    zweiteTiere.gerauscht1()

    ersteTiere.feuttern(besucher)
    zweiteTiere.feuttern(besucher2)

    println("Aufgaben 5")
    var ersteSchaf = Schaf("Shawn", 23.4, 5, "w")
    var ersteSchaf2 = Schaf("Sahi", 21.4, 6, "w")
    ersteSchaf.gerauscht()
    ersteSchaf2.gerauscht()


    println("Aufgaben 6")
    var ersteHuhn = Huhn("kikeri", 2.5, 2, "weiblich", 2)
    var ersteHuhn1 = Huhn("koki", 2.5, 1, "weiblich", 4)

    ersteHuhn.ProTag()
    ersteHuhn.gerauscht()
    ersteHuhn1.gerauscht()


    println("Aufgaben 7")
    var kuh1 = Kuh("Berta", 525.0, 7, "w", true)
    var kuh2 = Kuh("Gigia", 580.0, 2, "w", false)

    kuh1.gerauscht(besucher)
    kuh2.gerauscht(besucher3)


    println("Aufgaben 8")
    var pony1 = Pony("Gustav", 315.0, 3, "m", 30.5)
    var pony2 = Pony("Gustav", 410.0, 1, "m", 20.4)

    pony2.gerauscht()
    pony1.gerauscht()
    pony1.reiten(besucher)
    pony1.reiten(besucher2)
    pony1.reiten(besucher3)
    pony1.reiten(besucher4)



    println("Aufgaben 9")
    val streichelzoo =
        Streichelzoo(mutableListOf(ersteHuhn, ersteHuhn1, ersteSchaf, ersteSchaf2, kuh1, kuh2, pony1, pony2))
    streichelzoo.alleGerauscht()


    println("Aufgaben 10")
    var seb = Besucher("Seb", 15)
    var boris = Besucher("Boris", 4)

    println("wir haben zwei neue besucher :")
    seb.besucher()
    boris.besucher()
    ersteHuhn.gerauscht()
    println("jetzt die besucher dürfen fütter unsere tiere")
    ersteHuhn.feuttern(seb)
    pony1.feuttern(boris)
    println("viele dank.. ")
    println("Die möchten unsere pony reiten")
    pony1.reiten(seb)
    pony2.reiten(boris)
    ersteHuhn1.bewegen()
    println("hier sind die Schaf")
    ersteSchaf.gerauscht()
    ersteSchaf2.gerauscht()
    println("möchten sie unsere tiere streichelt?")
    pony1.gestreichlt(seb)
    pony2.gestreichlt(boris)
    println("versuchen sie von unsere kuhl milch zu nehmen")
    kuh2.gerauscht(seb)

    streichelzoo.alleGerauscht()
    streichelzoo.allessen(seb)
}


class Huhn(name:String,gewichte:Double,alter:Int,geschlecht:String,var eierProTag :Int) :Tier(name,gewichte,alter,geschlecht)  {



    override fun gerauscht(){
        println("ga-gackr")

    }

   open fun ProTag(){
        println("ga-gack und macht pro tag : $eierProTag Eier")

    }
}
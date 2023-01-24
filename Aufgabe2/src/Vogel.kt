
class Vogel {

    var vogelTypen: String
    var futterTypen: String
    var age: Int

    fun zwitschern(){

        println("zwitscher")
    }

    //var vogelTypen = listOf<String>("Amsel", "Drossel")
    //var futterTypen = listOf<String>("Ameisen", "Beeren")
    //var alter : Int = 0

    constructor(vogelTypen: String, futterTypen: String, age: Int) {
        this.vogelTypen = vogelTypen
        this.futterTypen = futterTypen
        this.age = age

    }

}


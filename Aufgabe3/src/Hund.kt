class Hund {


    var name: String
    var rasse: String
    var age: Int = 0


    fun belle(){

        println("woof")
    }


    fun alter(){

        age = age+1
    }
    constructor(name: String, rasse: String = "", age: Int= 0) {
        this.name = name
        this.age = age
        this.rasse = rasse

    }
}


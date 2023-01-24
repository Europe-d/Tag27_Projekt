import java.awt.Color

class Car {


    var color: String = ""
    var ps: Int = 0

    var seats: Int = 4
    var freeSeats: Int = 0

constructor(color:String,ps:Int,seats:Int,freeSeats:Int){
    if(seats < 0){
        println("fehler")
        this.seats= 0
    }else {
        this.seats = seats
    }
    this.color = color
    this.ps = ps
    this.freeSeats = freeSeats
}
    fun getIn() {
        if (freeSeats >= 4) {
            println(color)
        } else {
            println(true)
        }

    }

    fun getOut() {
        freeSeats = freeSeats + 1
    }


    fun startEngine() {
        if (freeSeats <= 4) {
            println("wroom wroom")
        } else {
            println("Fehlermeldung ")


        }

    }
}
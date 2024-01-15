package Model

import Util.NumCheck
import View.Print

class CarList(private var cars : MutableList<Car>, private var count : Int){

    fun setCount(count : Int){
        this.count = count
    }

    fun getCars() = cars

    fun addCar(name : String){
        cars.add(Car(name,0,""))
    }

    fun carSimul(){

        repeat(count){
            execute()
            Print.printCarState()
            println()//한줄 내리기

        }

        println()

    }

    private fun execute(){

        cars.forEach { car ->

            if(NumCheck.randomCheck()){
                forward(car)
            }

        }

    }

    private fun forward(car : Car){
        car.forwardCount++
        car.path += "-"
    }




}

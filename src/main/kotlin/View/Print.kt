package View

import Constant.ConstantGuide.PRINT_FINAL_WINNER_GUIDE
import Constant.ConstantNumbers.MULTI_WINNER_NUMBER
import Controller.Game

object Print {

    fun printWinner(winners: MutableList<String>) {

        print(PRINT_FINAL_WINNER_GUIDE)

        if(checkMultiWinner(winners)){
            multiPrintWinner(winners)
        }else{
            print(winners[0])
        }

    }

    private fun multiPrintWinner(winners: MutableList<String>){

        val result = StringBuilder()

        for ((index, item) in winners.withIndex()) {

            result.append(item)

            if (index < winners.size - 1) {
                result.append(", ")
            }

        }

        println(result.toString())

    }

    private fun checkMultiWinner(winners: MutableList<String>) = winners.size >= MULTI_WINNER_NUMBER

    fun printCarState() {

        Game.carList.getCars().forEach { car ->

            val carName = car.carName
            val carPath = car.path

            println("$carName : $carPath")

        }

    }



}
object Print {

    fun printWinner(winners: MutableList<String>) {

        print("최종 우승자 : ")

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

    private fun checkMultiWinner(winners: MutableList<String>) = winners.size >= 2

    fun printCarState() {

        Game.carList.getCars().forEach { car ->
            println("$car.carName : $car.path")
        }

    }



}
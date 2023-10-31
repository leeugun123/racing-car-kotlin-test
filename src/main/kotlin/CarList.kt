data class CarList(private var cars : MutableList<Car>, private var count : Int){

    fun setCount(count: Int){
        this.count = count
    }

    fun addCar(name : String){
        cars.add(Car(name,0,""))
    }

    fun carSimul(){

        for (i in 0..< count) {

            execute()

            printCarState()

            println()//한줄 내리기

        }

    }

    private fun execute(){

        for(car in cars){

            if(NumCheck.randomCheck()){
                forward(car)
            }

        }

    }


    private fun forward(car : Car){
        car.addForwardCount()
    }

    private fun printCarState() {

        for(car in cars){

            val carName = car.carName
            val path = car.path

            println("$carName : $path")

        }


    }

    fun selectWinner() : MutableList<String>{

        val winner  = mutableListOf<String>()

        val maxNum = findMax()

        for(car in cars){

            if(maxNum == car.forwardCount)
                winner.add(car.carName)


        }

        return winner

    }

    private fun findMax(): Int {

        var max = 0


        for(car in cars){

            if(max < car.forwardCount)
                max = car.forwardCount

        }


        return max

    }


}

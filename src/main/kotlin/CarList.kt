import camp.nextstep.edu.missionutils.Randoms

data class CarList(private var cars : MutableList<Car> , private var count : Int){

    fun setCount(count : Int){
        this.count = count
    }

    fun addCar(name : String){
        cars.add(Car(name))
    }

    fun carSimul(){

        for (i in 0..< count) {
            execute()
        }

    }

    private fun execute(){

        for(car in cars){

            if(randomCheck()){

            }

        }

    }


    private fun randomCheck() : Boolean{

        return if(4 <= Randoms.pickNumberInRange(0,9)){
            true
        } else {
            false
        }

    }









}

data class CarList(var cars : MutableList<Car> , var count : Int){

    fun setCount(count : Int){
        this.count = count
    }

    fun addCar(name : String){
        cars.add(Car(name))
    }





}

data class Car(private var carName: String , var forwardCount : Int = 0, var path : String = ""){


    fun addForwardCount(){
        forwardCount++
        addPath()
    }

    private fun addPath() {
        path += "-"
    }

    fun getCarName() : String{
        return carName
    }

    fun printAddPath(){
        println(path)
    }



}





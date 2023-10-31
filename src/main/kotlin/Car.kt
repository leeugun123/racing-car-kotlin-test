data class Car(var carName: String , var forwardCount : Int, var path : String){


    fun addForwardCount(){
        forwardCount++
        addPath()
    }

    private fun addPath() {
        path += "-"
    }







}





data class Car(var name: String = "", var forwardCount : Int = 0, var path : String = ""){


    fun setName(name : String){
        this.name = name
    }

    fun addForwardCount(){
        forwardCount++
        addPath()
    }

    private fun addPath() {
        path += "-"
    }



}





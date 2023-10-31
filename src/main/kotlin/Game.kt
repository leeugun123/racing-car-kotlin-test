import camp.nextstep.edu.missionutils.Console

class Game {

    var carList : CarList = CarList(mutableListOf<Car>() , 0)

    fun start(){

        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")

        val names  = Console.readLine()


    }

    private fun setCarList(names: String?) {

        val nameList = names!!.split(",").map { it.trim() }

        for (name in nameList) {

            if(checkName(name)){

            }
            else
                throwException()

        }


    }

    private fun checkName(name: String): Boolean {

        return name.length <= 5
    }

    private fun throwException(){

        throw IllegalArgumentException("올바른 형식으로 이름을 입력해주세요.")

    }






}
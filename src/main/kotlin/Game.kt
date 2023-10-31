import camp.nextstep.edu.missionutils.Console

class Game {

    var carList : CarList = CarList(mutableListOf<Car>() , 0)

    fun start(){

        //1. 초기 안내문
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")


        //2. 초기 설정
        val names  = Console.readLine()

        if (names == null || "," !in names) {
            throwException()
        }//쉼표가 없을 경우
        else
            setCarList(names)

        println("시도할 횟수는 몇 회인가요?")

        val count = Console.readLine()

        if(count == null || count.toIntOrNull() == null)
            throwException()
        else
            carList.setCount(count.toInt())


        //3. 카 시뮬레이션 실행
        carList.carSimul()





    }

    private fun setCarList(names: String?) {

        val nameList = names!!.split(",").map { it.trim() }

        for (name in nameList) {

            if(checkName(name)){
                carList.addCar(name)
            }
            else
                throwException()

        }
        //5자 이하가 아닌 경우 예외처리

    }

    private fun checkName(name: String): Boolean {

        return name.length <= 5

    }

    private fun throwException(){

        throw IllegalArgumentException("")

    }






}
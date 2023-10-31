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
        println()


        //4. 우승자 선정
        val winners = carList.selectWinner()

        //5. 우승자 출력
        print("최종 우승자 : ")
        printWinner(winners)



    }

    private fun printWinner(winners: MutableList<String>) {

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

    private fun checkMultiWinner(winners: MutableList<String>) : Boolean{

        return if(winners.size == 1)
            false
        else
            true

    }






}
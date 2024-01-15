package View

import Controller.Game
import Exception.ExceptionCheck.checkCountInt
import Exception.ExceptionCheck.checkNameComma
import Exception.ExceptionCheck.checkNameLength
import Exception.ExceptionCheck.nullCheck
import camp.nextstep.edu.missionutils.Console

object InitSetting {

    fun initSet(){

        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")

        //2. 초기 설정
        val names  = Console.readLine()

        if (nullCheck(names) || checkNameComma(names)) {
            throwException()
        } //쉼표가 없을 경우
        else
            setCarList(names)

        println("시도할 횟수는 몇 회인가요?")

        val count = Console.readLine()

        if(nullCheck(count) || checkCountInt(count))
            throwException()
        else
            Game.carList.setCount(count.toInt())


    }


    private fun setCarList(names : String) {

        val nameList = names.split(",").map { it.trim() }

        nameList.forEach { name ->

            if(nullCheck(name) && checkNameLength(name)){
                Game.carList.addCar(name)
            }
            else
                throwException()

        }

    }// 5자 이하가 아닌 경우 예외 처리

    private fun throwException(){
        throw IllegalArgumentException("")
    }


}
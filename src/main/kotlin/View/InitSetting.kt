package View

import ConstantGuide.INPUT_GUIDE
import ConstantGuide.TRY_COUNT
import Controller.Game
import Exception.ExceptionCheck.checkCountInt
import Exception.ExceptionCheck.checkNameComma
import Exception.ExceptionCheck.checkNameLength
import Exception.ExceptionCheck.nullCheck
import camp.nextstep.edu.missionutils.Console

object InitSetting {

    fun initSet(){

        println(INPUT_GUIDE)

        //2. 초기 설정
        val names = Console.readLine()

        if (nullCheck(names) || checkNameComma(names)) {
            throwException()
        } //쉼표가 없을 경우
        else
            setCarList(names)

        println(TRY_COUNT)

        val count = Console.readLine()

        if(nullCheck(count) || checkCountInt(count))
            throwException()
        else
            Game.carList.setCount(count.toInt())


    }


    private fun setCarList(names : String) {

        val nameList = names.split(",").map { it.trim() }

        nameList.forEach { name ->

            if(nullCheck(name) || checkNameLength(name)){
                throwException()
            }
            else
                Game.carList.addCar(name)

        }

    }// 5자 이하가 아닌 경우 예외 처리

    private fun throwException(){
        throw IllegalArgumentException("")
    }


}
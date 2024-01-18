package View

import Constant.ConstantGuide.INPUT_GUIDE
import Constant.ConstantGuide.TRY_COUNT
import Controller.Game
import Exception.ExceptionCheck.checkCountInt
import Exception.ExceptionCheck.checkMinus
import Exception.ExceptionCheck.checkNameComma
import Exception.ExceptionCheck.checkNameLength
import Exception.ExceptionCheck.containsNumber
import Exception.ExceptionCheck.hasWhiteSpace
import Exception.ExceptionCheck.nullCheck
import camp.nextstep.edu.missionutils.Console

object InitSetting {

    fun initSet(){

        println(INPUT_GUIDE)

        inputName()

        println(TRY_COUNT)

        inputCount()

    }

    private fun inputCount() {

        val count = Console.readLine()

        if(checkCountRight(count))
            throwException()

        Game.carList.setCount(count.toInt())

    }

    private fun inputName() {

        val names = Console.readLine()

        if (checkNamesRight(names))
            throwException()

        setCarList(names)

    }

    private fun checkNamesRight(names : String) = nullCheck(names) || checkNameComma(names)

    private fun checkCountRight(count : String) = nullCheck(count) || checkCountInt(count) || checkMinus(count)


    private fun setCarList(names : String) {

        val nameList = names.split(",").map { it.trim() }

        nameList.forEach { name ->

            if(nullCheck(name) || checkNameLength(name) || hasWhiteSpace(name) || containsNumber(name)){
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
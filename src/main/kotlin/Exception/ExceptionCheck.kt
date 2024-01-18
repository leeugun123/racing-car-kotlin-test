package Exception

import Constant.ConstantNumbers.CAR_NAME_LIMIT_LENGTH

object ExceptionCheck {

    fun nullCheck(input : String) = input.trim().isEmpty()

    fun checkNameComma(names : String) = "," !in names

    fun checkCountInt(count : String) = count.toIntOrNull() == null

    fun checkMinus(count : String) = count.toInt() < 0

    fun checkNameLength(name : String) = name.length > CAR_NAME_LIMIT_LENGTH

    fun hasWhiteSpace(name : String) = name.contains(" ")

    fun containsNumber(input: String) = input.any { it.isDigit() }

}
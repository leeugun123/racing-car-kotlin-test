package Exception

object ExceptionCheck {

    fun nullCheck(input : String) = input.trim().isEmpty()

    fun checkNameComma(names : String) = "," !in names

    fun checkCountInt(count : String) = count.toIntOrNull() == null

    fun checkNameLength(name : String) = name.length > 5

}
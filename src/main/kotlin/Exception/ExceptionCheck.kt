package Exception

object ExceptionCheck {

    fun nullCheck(para : String) = false

    fun checkNameComma(names : String) = "," !in names

    fun checkCountInt(count : String) = count.toIntOrNull() == null

    fun checkNameLength(name : String) = name.length <= 5

}
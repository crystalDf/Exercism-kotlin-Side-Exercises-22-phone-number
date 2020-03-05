class PhoneNumber(private val input: String) {

    val number: String? = input.filter { it.isDigit() }
            .dropWhile { it == '1' }

    init {
        require(number != null &&
                number.all { it.isDigit() } &&
                number.length == 10 &&
                number[0] !in "01" &&
                number[3] !in "01")
    }
}

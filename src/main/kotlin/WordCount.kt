object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        return phrase
            .lowercase()
            .split("[.,?!@#$%^&*()/{}:;\t\r\n ]".toRegex())
            .filter { it.isNotBlank() }
            .groupingBy { it.trim().replace("^\"|^'|\"$|'$".toRegex(), "") }
            .eachCount();


    }
}

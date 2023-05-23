class Dictionary {
    private val words = mutableMapOf<String, String>()

    fun addWord(word: String, definition: String) {
        words[word] = definition
    }

    fun getDefinition(word: String): String? {
        return words[word]
    }
}

fun main() {
    val dictionary = Dictionary()

    dictionary.addWord("apple", "A fruit with a red or green skin and a crisp flesh.")
    dictionary.addWord("cat", "A small domesticated carnivorous mammal.")

    val word1 = "apple"
    val definition1 = dictionary.getDefinition(word1)
    println("Definition of '$word1': $definition1")

    val word2 = "cat"
    val definition2 = dictionary.getDefinition(word2)
    println("Definition of '$word2': $definition2")

    // Try getting definition for a non-existent word
    val word3 = "dog"
    val definition3 = dictionary.getDefinition(word3)
    println("Definition of '$word3': $definition3")
}

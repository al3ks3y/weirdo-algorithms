package medium

private const val DOT = '.'

class WordDictionary {
    fun addWord(word: String) {
        if (word.isNotEmpty()) {
            if (wordsLengthMap[word.length] != null) {
                wordsLengthMap[word.length]?.add(word)
            } else {
                wordsLengthMap[word.length] = mutableSetOf(word)
            }
        }
    }

    fun search(word: String): Boolean {
        if (word.isEmpty()) {
                return true
            }
        val lengthSet = wordsLengthMap[word.length]
        if (lengthSet != null && word.toCharArray().all { c -> c == DOT }) {
            return true
        }
        val dotsPositions = mutableSetOf<Int>()
        word.forEachIndexed { index, char ->
            if (char == DOT) {
                dotsPositions.add(index)
            }
        }
        val allWordsWithoutDots = lengthSet?.map { getWordWithoutDots(it, dotsPositions.toSet()) }
            ?.toHashSet()
        if (allWordsWithoutDots != null) {
            if (allWordsWithoutDots.contains(getWordWithoutDots(word, dotsPositions))) {
                return true
            }
        }
        return false
    }

    private val wordsLengthMap = HashMap<Int, MutableSet<String>>()

    private fun getWordWithoutDots(word: String, indices: Set<Int>): String {
        val result = StringBuilder()
        word.forEachIndexed { index, char ->
            if (!indices.contains(index)) {
                result.append(char)
            }
        }
        return result.toString()
    }
}
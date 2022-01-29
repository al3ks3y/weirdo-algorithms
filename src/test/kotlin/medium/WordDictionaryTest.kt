package medium

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WordDictionaryTest {

    @Test
    fun test() {
        val wordDictionary=WordDictionary()
        wordDictionary.addWord("bad")
        wordDictionary.addWord("dad")
        wordDictionary.addWord("mad")
        assertFalse{  wordDictionary.search("pad")} // return False

        assertTrue {  wordDictionary.search("bad")} // return True

        assertTrue {  wordDictionary.search(".ad")} // return True

        assertTrue {  wordDictionary.search("b..")} // return True

    }
    @Test
    fun test2(){
        val wordDictionary=WordDictionary()
        wordDictionary.addWord("at")
        wordDictionary.addWord("and")
        wordDictionary.addWord("an")
        wordDictionary.addWord("add")
        assertFalse {  wordDictionary.search("a")}
        wordDictionary.search(".at")
        wordDictionary.addWord("bat")
        assertFalse {  wordDictionary.search(".")}
    }
}
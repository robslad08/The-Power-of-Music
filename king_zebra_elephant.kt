import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    println("Please enter any statement about the power of music:")
    val input = reader.readLine()

    val words = input.split("\\s".toRegex())
    val uniqueWords = ArrayList<String>()

    for (word in words) {
        if (!uniqueWords.contains(word)) {
            uniqueWords.add(word)
        }
    }

    println("Unique words used in statement:" + uniqueWords)
    println("------------------------------")
    println("The Power of Music")

    //Line 1
    println("Music can have the power to move us, to inspire us and to bring us together.")

    //Line 2
    println("It acts as a form of expression that can be shared among individuals of all different backgrounds, ages, and cultures.")

    //Line 3
    println("Music has the ability to evoke strong emotions in people and invoke an array of memories and feelings.")

    //Line 4
    println("Music can provide an escape, a way to process strong feelings, a way to release emotions, and a way to connect with the world.")

    //Line5
    println("It has the power to bridge cultural gaps, eliminate feeling of being alone, and bring a sense of purpose and joy to our lives.")

    //Line 6
    println("Music is capable of touching our hearts and minds in ways that no other medium can.")

    //Line 7
    println("It has been able to stand the test of time and will continue to do so for years to come.")

    //Line 8
    println("The power of music is unending and it can take us on a journey and help us make sense of the world that we live in.")

    //Line 9
    println("At its best, is can spark creative energy and bring unity and peace to those who embrace it.")

    //Line 10
    println("It is a language of its own and can be used to communicate feelings and ideas without passing judgement.")

    //Line 11
    println("The power of music is something to be celebrated and shared with the world.")

    //Line 12
    println("It has the power to heal, to bring hope, and to help us find our true purpose in life.")

    //Line 13
    println("Music has the power to make us feel alive, to give us strength, and to make us believe in ourselves.")

    //Line 14
    println("It can give us a sense of freedom and provide a platform to express our ideas and beliefs.")

    //Line 15
    println("Music has the power to unite us, to bring joy, and to make the impossible seem possible.")

    //Line 16
    println("It is a powerful force that has the power to make our lives better and to make a positive impact on the world around us.")

    //Line 17
    println("Music has the power to create a unique experience that can never be replicated and it can help us find our place in the world.")

    //Line 18
    println("It has the power to bring us together and to help us discover more about ourselves and our potential.")

    //Line 19
    println("Music is an essential part of life and it possesses the power to bring peace and harmony to the world.")

    //Line 20
    println("The power of music is undeniable and it can be used to inspire us, to connect us, and to bring us joy, hope, and unity.")

}
val n:Int = 10
val half =
    if (n % 2 == 0)
        n/2
    else
        throw new RuntimeException("n must be even")

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
try {
    val f = new FileReader("input.txt")
    // Use and close file
} catch {
    case ex: FileNotFoundException => // Handle missing file
    case ex: IOException => // Handle other I/O error
}
finally {
    println("Closing the file")  // Be sure to close the file
}

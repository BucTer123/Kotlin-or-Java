fun main() {
    println("Welcome!\n")
    println("> ")
    var cmd = readLine()

    if (cmd == "help") {
       helpfunction()
    }

    else if (cmd == "exit") {
        exit(0)
    }

    else if (cmd == "minus") {
        minusfunction()
    }

    else if (cmd == "plus") {
       plusfunction()
    }

    else if (cmd == "draw") {
        for (i in 1..10) {
            println("<>\n")
        }
    }
}
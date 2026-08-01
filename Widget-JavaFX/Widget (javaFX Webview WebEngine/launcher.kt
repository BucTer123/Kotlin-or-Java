fun main() {
    println("Welcome!\n");
    print("Do you want to start the JavaFX Widget? (y/n) :")
    String c = readLine()

    if (c == "y" || c == "Y") {
        println("Starting!")
        classmainuiwidget.main()
        classmainuiwidget.funcstartuiwidget()
    } else {
        println("Bye!")
    }
}

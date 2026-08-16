fun main() {
    mygameengine.output_console("Welcome!")
    mygameengine.output_console("Choice your country")
    String choice = readLine()

    choicecountry(choice)

    if (choicecountry() == "Albania") {
        countries_list.albania()
    }
    else if (choicecountry() == "Afganistan") {
        countries_list.afganistan()
    }
    else if (choicecountry() == "Andorra") {
        countries_list.andorra()
    }
}

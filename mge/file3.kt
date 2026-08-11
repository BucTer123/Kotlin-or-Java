public class countries_list {
    fun albania() {
        Int time_albania = 0
        while (true) {
            time_albania += 1
        }
        Int money_albania = 800
        Int army_albania = 30000
        Int economy_albania = 300
        Boolean country_albania_europe = true 
        Boolean country_exitsts = true 
        Boolean albania_peaceful = true
        
        mygameengine.output_console("> ")
        String cmd_albania = readLine()

        if (cmd_albania == "Info >> peaceful") {
            println(albania_peaceful)
        }
        else if (cmd_albania == "Info >> Europe") {
            println(country_albania_europe)
        }
        else if (cmd_albania == "Info >> Economy") {
            println(economy_albania)
        }
        else if (cmd_albania == "Info >> Army") {
            println(army_albania)
        }
        else if (cmd_albania == "Info >> Money") {
            println(money_albania)
        }
        else if (cmd_albania == "War >> Country") {
            mygameengine.output_console("Choice country :")
            String choicecountry_albaniaatack = readLine()
            
            if (choicecountry_albaniaatack == "War >> List") {
                mygameengine.output_list_countries("TRUE")
            }
        }
    }
    fun afganistan()
    fun andorra()
}
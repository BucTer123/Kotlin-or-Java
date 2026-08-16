public class countries_list {
    fun albania() {
        Int time_albania = 0
        Int money_albania = 300
        while (true) {
            time_albania += 1
            money_albania += 3
        }
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
            } else {
                String atacked = choicecountry(choicecountry_albaniaatack);
                String army = mygameengine.getArmy(atacked)

                if (army <= army_albania) {
                    mygameengine.output_console("You lose!")
                    army_albania = 0
                } else {
                    mygameengine.output_console("You won!");
                    army = 0
                }
            }
        }
    }
    fun afganistan() {
        Int time_afganistan = 0
        Int money_afganistan = 10

        while (true) {
            time_afganistan += 1
            money_afganistan += 1
        }
        
    }
    fun andorra()
}

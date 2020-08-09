package JavaRushLect8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections {
/*. HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.

    public static void main(String[] args)
    {
        Set<String> setOfVet = new HashSet<>();
        setOfVet.add("Арбуз");
        setOfVet.add("Банан");
        setOfVet.add("Вишня");
        setOfVet.add("Груша");
        setOfVet.add("Дыня");
        setOfVet.add("Ежевика");
        setOfVet.add("жень-шень");
        setOfVet.add("Земляника");
        setOfVet.add("Ирис");
        setOfVet.add("картофель");

        for (String vet : setOfVet){System.out.println(vet);}
    }*/
/*2. HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст,
жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – клубень
    public static void main(String[] args){
        Map<String, String> plants = new HashMap<>();
        plants.put("арбуз","ягода");
        plants.put("банан","трава");
        plants.put("вишея","ягода");
        plants.put("груша","фрукт");
        plants.put("дыня","овощ");
        plants.put("ежевика","куст");
        plants.put("жеь-шень","корень");
        plants.put("земляника","ягода");
        plants.put("ирис","цаеток");
        plants.put("картофель","клубень");

        for(Map.Entry<String,String> pair : plants.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " : " + value);
        }
    }*/


}

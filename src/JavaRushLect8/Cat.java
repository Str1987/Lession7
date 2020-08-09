package JavaRushLect8;

import java.util.HashMap;
import java.util.Map;

public class Cat {
/*3. Коллекция HashMap из котов
Есть класс Cat, с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.*/

    public String name;

    public Cat (String name)
    {
        this.name = name;
    }

    public static void main(String[] args){

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Фуфел");
        Cat cat3 = new Cat("Дрбфел");
        Cat cat4 = new Cat("Васька");
        Cat cat5 = new Cat("Котопес");
        Cat cat6 = new Cat("Самсон");
        Cat cat7 = new Cat("Ликер");
        Cat cat8 = new Cat("Упырь");
        Cat cat9 = new Cat("толстый");
        Cat cat10 = new Cat("Пушыстый");

        Map<String, Object> catMap = new HashMap<>();

        catMap.put(cat1.name,cat1);
        catMap.put(cat2.name,cat2);
        catMap.put(cat3.name,cat3);
        catMap.put(cat4.name,cat4);
        catMap.put(cat5.name,cat5);
        catMap.put(cat6.name,cat6);
        catMap.put(cat7.name,cat7);
        catMap.put(cat8.name,cat8);
        catMap.put(cat9.name,cat9);
        catMap.put(cat10.name,cat10);

        for(Map.Entry<String, Object> pair : catMap.entrySet())
        {
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + ":" + value);
        }

    }

}

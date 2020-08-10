package JavaRushLect8;

import java.util.*;

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
/*1. Создать два списка LinkedList & ArrayList.

Нужно создать два списка – LinkedList и ArrayList.
2. Провести 10 тысяч вставок, удалений

Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
3. Измерить сколько времени занимает 10 тысяч вставок для каждого списка

Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
4. Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка

Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet должен вернуть время его исполнения в миллисекундах.
5. Четыре метода

Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций
(быстрее всего справится с большим количеством операций). Ничего измерять не нужно.*/
    // Метод добавляет 1 000 000 строк в список
    public static Long addItemAndMeasureTimeOfArrList(ArrayList<String> stringArrayList)
    {
        Date currentTime = new Date();
        for(int i = 0; i < 1000000; i++)
        {
            String iToStr = Integer.toString(i);
            stringArrayList.add("xzxz" + iToStr);
        }
        Date currentTime2 = new Date();
        //System.out.println(stringArrayList);
        return currentTime2.getTime() - currentTime.getTime();
    }
    // Метод добавляет 1 000 000 строк в ссылочный список
    public static Long addItemAndMeasureTimeOfLinkedList(LinkedList<String> linkedList)
    {
        Date currentTime3 = new Date();
        for(int i = 0; i < 1000000; i++)
        {
            String iToStr = Integer.toString(i);
            linkedList.add("xzxz" + iToStr);
        }
        Date currentTime4 = new Date();
        //System.out.println(linkedList);
        return currentTime4.getTime() - currentTime3.getTime();
    }

    // Метод добавляет 10000 строк в список  обратом порядке
    public static Long addAtBeginItemAndMeasureTimeOfArrList(ArrayList<String> stringArrayList)
    {
        Date currentTime = new Date();
        for(int i = 0; i < 10000; i++)
        {
            //String iToStr = Integer.toString(i);
            stringArrayList.add(i, "xzxz");
        }
        Date currentTime2 = new Date();
        //System.out.println(stringArrayList);
        return currentTime2.getTime() - currentTime.getTime();
    }

    // Метод добавляет 10000 строк в ссылочный список в обратом порядке
    public static Long addAtBeginItemAndMeasureTimeOfLinkedList(LinkedList<String> linkedList)
    {
        Date currentTime3 = new Date();
        for(int i = 0; i < 10000; i++)
        {
            linkedList.add(i, "xzxz");
        }
        Date currentTime4 = new Date();
        //System.out.println(linkedList);
        return currentTime4.getTime() - currentTime3.getTime();
    }

    public static void main(String[] args){

        ArrayList<String> arrayListTest = new ArrayList<>();
        LinkedList<String> linkedListTest = new LinkedList<>();

        System.out.println("В ArrayList добавленно 1 000 000 строк за " + addItemAndMeasureTimeOfArrList(arrayListTest));
        System.out.println("В LinkedList список добавленно 1 000 000 строк за " + addItemAndMeasureTimeOfLinkedList(linkedListTest) + "/n");
        System.out.println("В ArrayList добавленно в обравтом порядке (add(i,str)) 10000 строк за " + addAtBeginItemAndMeasureTimeOfArrList(arrayListTest));
        System.out.println("В LinkedList список добавленно в обравтом порядке (add(i,str)) 10000 строк за " + addAtBeginItemAndMeasureTimeOfLinkedList(linkedListTest));
        }

        /*Аналогичные действия с set get и remove суь ясна вообщем*/
}


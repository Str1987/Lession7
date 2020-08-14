package JavaRushLect8;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.MonthDay;
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
(быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
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

        Аналогичные действия с set get и remove суь ясна вообщем*/
/*1. 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».

    public static void main(String[] args){

        Set<String> setWithL = new HashSet<>();
        setWithL.add("Лента");
        setWithL.add("Лента1");
        setWithL.add("Лента2");
        setWithL.add("Лента3");
        setWithL.add("Лента4");
        setWithL.add("Лента5");
        setWithL.add("Лента6");
        setWithL.add("Лента7");
        setWithL.add("Лента8");
        setWithL.add("Лента9");

        System.out.println(setWithL);
    }*/
/*2. Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

    public static void randomInsert (Set<Integer> setInt, int amountOfElements, int maxOfRage) throws InterruptedException
    {
        System.out.println("Генерация коллекии сет");
        Thread.sleep(1000);

        while (setInt.size() < amountOfElements)
        {
            Random rdn = new Random();
            setInt.add(rdn.nextInt(maxOfRage));
        }
        System.out.println(setInt);
    }

    public static void main(String[] args) throws InterruptedException {

        Set<Integer> setOfInteger = new HashSet<>();
        randomInsert(setOfInteger, 20, 100);
        Iterator<Integer> itr = setOfInteger.iterator();

        while(itr.hasNext())
        {
            if (itr.next() > 20)
            {
                itr.remove();
            }
        }
        System.out.println(setOfInteger);
    }*/
/*3. Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.

    public static void main(String[] args) throws IOException {

        Map<String,String> nameSoname = new HashMap<>();
        Map<String,String> resultOfSearch = new HashMap<>();

        nameSoname.put("Иван","Сидоров");
        nameSoname.put("Николай","Петров");
        nameSoname.put("Станислав","Сидоров");
        nameSoname.put("Илья","Смирнов");
        nameSoname.put("Виктор","Кузнецов");
        nameSoname.put("Константин","Смирнов");
        nameSoname.put("Семен","Микрюков");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите фамилию");
        String str = reader.readLine();
        System.out.println(nameSoname);

        int countDuplicate = 0;

        for (Map.Entry<String, String> pair : nameSoname.entrySet()) {
            String value = pair.getValue();
            if (value.equals(str)) {
                countDuplicate++;
            }
        }
        System.out.println(countDuplicate);
    }*/
/*4. Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу:
 «фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом.

    // Метод генерации даты рождения
    public static Calendar randDateBirthday()
    {
        int randomMonth = (int) (Math.random() * 12) + 1;
        int randomDay = (int) (Math.random() * 27) + 1;
        int randomYear = (int) (Math.random() * 31) + 1970;

        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, randomYear);
        calendar.set(Calendar.MONTH, randomMonth);
        calendar.set(Calendar.DAY_OF_MONTH, randomDay);

        return calendar;
    }
    // Метод проверяет является ли дата рождения в интервале между 31.05.гг 23:59:59 и 31.08.гг 23:59:59
    // Год берется из даты, которая генериции randDateBirthday()
    public static boolean isTimeAtRangeOfSummer(Calendar calendar)
    {
        Calendar untilSummer = new GregorianCalendar();
        untilSummer.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        untilSummer.set(Calendar.MONTH, 4);
        untilSummer.set(Calendar.DAY_OF_MONTH, 31);
        untilSummer.set(Calendar.HOUR_OF_DAY, 23);
        untilSummer.set(Calendar.MINUTE, 59);
        untilSummer.set(Calendar.SECOND, 59);
        Date untilSummerDate = untilSummer.getTime();
        // Для проверки System.out.println("Время До" + untilSummer.getTime());
        Calendar afterSummer = new GregorianCalendar();
        afterSummer.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        afterSummer.set(Calendar.MONTH, 7);
        afterSummer.set(Calendar.DAY_OF_MONTH, 31);
        untilSummer.set(Calendar.HOUR_OF_DAY, 23);
        untilSummer.set(Calendar.MINUTE, 59);
        untilSummer.set(Calendar.SECOND, 59);
        Date afterSummerDate = afterSummer.getTime();
        // Для проверки System.out.println("Врем после " + afterSummer.getTime());
        Date currentTime = calendar.getTime();
        // Для проверки System.out.println("Текущее время" + calendar.getTime());
        boolean isTrue = true;
        if (currentTime.after(untilSummerDate) && currentTime.before(afterSummerDate))
        {
           isTrue = false;
        }
        return isTrue;
    }

    public static void main(String[] args)
    {
        Map<String,Calendar> dateOfBirthday = new HashMap<>();
        Map<String,Calendar> dateOfBirthdaySorted = new HashMap<>();
        //Создаем МАР Ключ - значение
        dateOfBirthday.put("Смирнов",randDateBirthday());
        dateOfBirthday.put("Иванов",randDateBirthday());
        dateOfBirthday.put("Сидоров",randDateBirthday());
        dateOfBirthday.put("Петров",randDateBirthday());
        dateOfBirthday.put("Южаков",randDateBirthday());
        dateOfBirthday.put("Меренков",randDateBirthday());
        dateOfBirthday.put("Юмаев",randDateBirthday());
        dateOfBirthday.put("Валимухаметов",randDateBirthday());
        dateOfBirthday.put("Кречев",randDateBirthday());
        dateOfBirthday.put("Финцеров",randDateBirthday());

        System.out.println("Неотсортитованный список");
        int i = 1;
        for (Map.Entry<String,Calendar> pair : dateOfBirthday.entrySet())
        {
            String key = pair.getKey();
            Date value = pair.getValue().getTime();
            DateFormat df = new SimpleDateFormat("dd MMM yyyy");
            System.out.println(i +" - " + key + " : " + df.format(value));
            i++;
        }

        //System.out.println(dateOfBirthday);

        for (Map.Entry<String,Calendar> pair : dateOfBirthday.entrySet())
        {
            String key = pair.getKey();
            Calendar value = pair.getValue();
            if (isTimeAtRangeOfSummer(value))
            {
                dateOfBirthdaySorted.put(key,value);
            }
        }
        System.out.println("Отсортитованный список");
        int j = 1;
        for (Map.Entry<String,Calendar> pair : dateOfBirthdaySorted.entrySet())
        {
            String key = pair.getKey();
            Date value = pair.getValue().getTime();
            DateFormat df = new SimpleDateFormat("dd MMM yyyy");
            System.out.println(j +" - " + key + " : " + df.format(value));
            j++;
        }
    }*/
/*5. Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.*/


    //Удаление элементов MAP по value
    static public Map<String, String> deleteNamesake (Map<String,String> mapSonameName)
    {
        Map<String,String> mapSoNameNameSorted = new HashMap<>();
        for(Map.Entry<String,String> pairString : mapSonameName.entrySet())
        {
            String key = pairString.getKey();
            String value = pairString.getValue();
            Map<String, String> mapOfSoNameNameClone = new HashMap<>(mapSonameName);
            mapOfSoNameNameClone.remove(key, value);
         /* СЛОЖНЫЙ ВАРИАНТ С ЦИКЛОМ
           boolean hasNamesake = false;
            Iterator <Map.Entry<String,String>> itr = mapOfSoNameNameClone.entrySet().iterator();
            while(itr.hasNext())
            {
                Map.Entry<String,String> entry = itr.next();
                if(value.equals(entry.getValue()))
                {
                    hasNamesake = true;
                    break;
                }
            }
            if (!hasNamesake)
            {
                mapOfSoNameNameSorted.put(key,value);
            }*/
            /* для проверки
            System.out.println(i + " Изначальный список -  " + mapOfSoNameName);        //Для проверки
            System.out.println(i + " Клон  Изначального -  " + mapOfSoNameNameClone);   //Для проверки
            System.out.println(i + " Отсортированный   -   " + mapOfSoNameNameSorted);  // Для проверки
            i++; // для проверки
            mapOfSoNameNameClone.clear(); */
            //Вариант попроще
            if (!mapOfSoNameNameClone.containsValue(value))
            {
                mapSoNameNameSorted.put(key, value);
            }
            mapOfSoNameNameClone.clear();
        }
        return mapSoNameNameSorted;
    }

    public static void main(String[] args)
    {
        Map<String,String> mapOfSoNameName = new HashMap<>();
        mapOfSoNameName.put("Петров","Иван");
        mapOfSoNameName.put("Иванов","Иван");
        mapOfSoNameName.put("Анисимов","Николай");
        mapOfSoNameName.put("Баширов","Азамат");
        mapOfSoNameName.put("Викулов","Сергей");
        mapOfSoNameName.put("Мешников","Степан");
        mapOfSoNameName.put("Мясников","Борис");
        mapOfSoNameName.put("Каспаров","Гари");
        mapOfSoNameName.put("Златин","Гари");
        mapOfSoNameName.put("Южаков","Ярослав");

        System.out.println(deleteNamesake(mapOfSoNameName));
    }
}


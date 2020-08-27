package JavaRushLect9;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestExceptions {
/*1. Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
    public static void main(String[] args){
        try {
            int a = 43 / 0;
            System.out.println(a);
        } catch (Exception ex) {
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
        }
    }*/
/*2. Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();

    public static void main(String[] args){
        try{
            String s = null;
            String s2 = s.toLowerCase();
        } catch (Exception ex){
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
        }
    }*/
/*3. Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
    public static void main(String[] args){
        try{
            int[] m = new int[2];
            m[8] = 10;
        } catch (Exception ex){
            System.out.println(ex.getClass());
        }
    }*/
/*4. Исключение при работе с коллекциями List

Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
    public static void main(String[] args){
        try {
            ArrayList<String> list = new ArrayList<>();
            String str = list.get(18);
        } catch (Exception ex){
            System.out.println(ex.getClass());
        }
    }*/
/*5. Исключение при работе с коллекциями Map
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);

    public static void main(String[] args){
        try {
            HashMap<String, String> map = new HashMap<>(null);
            map.put(null, null);
        } catch (Exception ex){
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
        }
    }*/
/*1. Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()

    public static void main(String[] args){
        try {
            divisionByZero(4);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    public static void divisionByZero(int i){
        System.out.println(i / 0);
    }*/
/*2. Обратный отсчёт от 10 до 0
Написать в цикле обратный отсчёт от 10 до 0. Для задержки иcпользовать Thread.sleep(100);
Обернуть вызов sleep в try..catch.

    public static void main(String[] args){

        int[] intArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        try {
            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
                Thread.sleep(500);
            }
        } catch (Exception ex){
           System.out.println(ex.getMessage());
        }
    }*/
/*Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader - а) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода

    public static void main(String[] args) {
        readData();
    }

    public static  void readData() {
        ArrayList<Integer> intArrayList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Вводите цифры, как только вы введете что либо кроме цифр программа прекратит работу");
            boolean isTrue = true;
            while (isTrue) {
                String str = reader.readLine();
                int strToInt = Integer.parseInt(str);
                intArrayList.add(strToInt);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Введеная строка должна состоять только из цифр");
            System.out.println(ex.getMessage());
            for (Integer i : intArrayList) {
                System.out.println(i);
            }
        } catch (IOException ex) {
            System.out.println("Ошиббка при вводе строки");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Произошла какая то другая ошибка");
            System.out.println(ex.getMessage());
        }
    }*/
/*Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.

    public static void main(String[] args){
        System.out.println("Введите с клавиатуры дату в флормате МЕСЯЦ/ЧИСЛО/ГОД, например 08/18/2008");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = reader.readLine().replace("/", " ");
            Date date = new SimpleDateFormat("M d y").parse(str);
            String pattern = "MMM d, yyyy";
            System.out.println(new SimpleDateFormat(pattern).format(date));
        } catch (Exception ex){
            System.out.println("Возможно вы ввели не верный формат даты");
            System.out.println(ex.getMessage());
        }
    }*/
/*5. Гласные и согласные буквы

Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1) первая строка содержит только гласные буквы
2) вторая - только согласные буквы и знаки препинания из введённой строки.
Символы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку на русском");
        try {
            String str = reader.readLine();
            sepVowelsAndConsonants(str);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void sepVowelsAndConsonants(String str){
        String vowels = "аеёиоуыэюя";
        String consonants = "бвгджзйклмнпрстфхцчшщ,.?-'@!%№_";
        String vowelsForPrint = "";
        String consonantsForPrint = "";

        for(int i = 0; i < str.length(); i++){
            if (vowels.indexOf(str.charAt(i)) != -1){
                vowelsForPrint += str.charAt(i) + " ";
            } else if (consonants.indexOf(str.charAt(i)) != -1){
                consonantsForPrint += str.charAt(i) + " ";
            }
        }
        System.out.println(vowelsForPrint);
        System.out.println(consonantsForPrint);
    }*/
/*8. Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять
объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.

    public static void main(String[] args){
        ArrayList<int[]> arrayListOfArrays = new ArrayList<>();
        int[] forArrayList = {5, 2, 4, 7, 0};

        for (int i = 0; i < 5; i++){
            int[] z = new int[forArrayList[i]];
            arrayListOfArrays.add(z);
        }
        //System.out.println(arrayListOfArrays);

        for (int[] i : arrayListOfArrays){
            for (int j = 0; j < i.length; j++) {
                i[j] = (int) (Math.random() * 100);
            }
        }

        for(int[] i : arrayListOfArrays){
            System.out.println(Arrays.toString(i));
        }
    }*/
/*Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.*/

    public static void main(String[] args){

    }
}



package JavarushLect7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.lang.InterruptedException;

public class ArrayListExamples {
    /*Задача 1. 5 различных строчек в списке

    1. Создай список строк.
    2. Добавь в него 5 различных строчек.
    3. Выведи его размер на экран.
    4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки.

        public static void main(String[] args){
            ArrayList listStr = new ArrayList();
            listStr.add("1");
            listStr.add("2");
            listStr.add("3");
            listStr.add("4");
            listStr.add("5");

            System.out.println(listStr.size());

            for (Object i : listStr){
                System.out.println(i);
            }
        }*/
/*Задача 2. Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

    public static void main(String[] args) throws IOException {

        ArrayList <String> arrayList = new ArrayList();
        ArrayList <String> arrayListCount = new ArrayList();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 строк");

        for (int i = 0; i < 5; i++)
        {
            String str = reader.readLine();
            arrayList.add(str);
        }
        // Сначла находим максимальную длину строку в списке строк
        int maxStrLength = arrayList.get(0).length();
        for (String j : arrayList) {
            if (j.length() > maxStrLength) {
                maxStrLength = j.length();
            }
        }
        // Затем проверяем каждую строку на максимальную длину и если совпадает то записываем вновый список
        for (String j : arrayList)
        {
            if (j.length() == maxStrLength){
                arrayListCount.add(j);
            }
        }
        // Выводим полученный список
        for (String s : arrayListCount) {
            System.out.println(s);
        }
    }*/
/*Задача 3. Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
    public static void main(String[] args) throws IOException {

        ArrayList<String> arrayList = new ArrayList();
        ArrayList<String> arrayListCount = new ArrayList();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 строк");

        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            arrayList.add(str);
        }
        // Сначла находим максимальную длину строку в списке строк
        int minStrLength = arrayList.get(0).length();
        for (String j : arrayList) {
            if (j.length() < minStrLength) {
                minStrLength = j.length();
            }
        }
        // Затем проверяем каждую строку на максимальную длину и если совпадает то записываем вновый список
        for (String j : arrayList) {
            if (j.length() == minStrLength) {
                arrayListCount.add(j);
            }
        }
        // Выводим полученный список
        for (String s : arrayListCount) {
            System.out.println(s);
        }
    }*/
/*Задача 4. 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.

    public static void main(String[] args) throws IOException
    {
        ArrayList <String> strList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите с клавиатуры 10 строк, черех Enter");

        for (int i = 0; i < 10; i++)
        {
            String str = reader.readLine();
            strList.add(0,str); //strList.add(str) - доавляе в конец, (0,str); - добавляет в начало
        }

        for (String s : strList){System.out.println(s);}
    }*/
/*Задача 5. Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки

    public static void main(String[] args) throws IOException
    {
        ArrayList <String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 строк, через Enter");

        for (int i = 0; i < 5; i++)
        {
            String str = reader.readLine();
            arrayList.add(str);
        }

        for (int i = 0; i < 13; i++)
        {
            String str = arrayList.get(4);
            arrayList.remove(4);
            arrayList.add(0,str);
        }

        for (String j : arrayList){
            System.out.println(j);
        }
    }*/
/*1. Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList, выведи эти три списка на экран. Сначала тот, который для x%3,
потом тот, который для x%2, потом последний.

    public static ArrayList<Integer> printList (ArrayList<Integer> arrayList) { //  функция возвращения список...
        return arrayList;
    }

    public static void main(String[] args) throws IOException
    {

        ArrayList<Integer> arrayInt = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите 20 чисел");
        // читаем данные от пользователя
        for (int i = 0; i < 10; i++)
        {
            String str = reader.readLine();
            int strToInt = Integer.parseInt(str);// из строки в числа
            arrayInt.add(strToInt); // Записываем в массив
        }
        //Создаем списки для сортировки
        ArrayList<Integer> arrayEven = new ArrayList<>();
        ArrayList<Integer> arrayDivBy3 = new ArrayList<>();
        ArrayList<Integer> arrayOther = new ArrayList<>();
        //Сортируем каждый элемент
        for (int j : arrayInt)
        {
            if(j % 2 == 0) arrayEven.add(j); // без остатка на 2 Четные
            else if (j % 3 == 0) arrayDivBy3.add(j); // без остатка на 3
            else arrayOther.add(j); // Остальные
        }

        System.out.println(printList(arrayEven));
        System.out.println(printList(arrayDivBy3));
        System.out.println(printList(arrayOther));
    }*/
/*2. Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

    // Метод возвращет список. Если четное колво элементов то возвращает полностью, если не четное то удалает средний элемент
    public static ArrayList<String> deleteMidStrAndPrint (ArrayList<String> arrayForUse){
        if (arrayForUse.size() % 2 == 0)
        {
            return arrayForUse;
        } else
            {
                arrayForUse.remove((arrayForUse.size() -1)  / 2);
                return arrayForUse;
            }
    }
    public static void main(String[] args) throws IOException {

        ArrayList<String> testArrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 5 строк");

        for (int i = 0; i < 5; i++)
        {
            String str = reader.readLine();
            testArrayList.add(str);
        }
        System.out.println(deleteMidStrAndPrint(testArrayList));
    }*/
/*3. Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for, вывести результат на экран. Каждый элемент списка с новой строки.

    public static void main(String[] args) throws IOException {

        ArrayList<String> testArrayList = new ArrayList<>();
        testArrayList.add("Мама");
        testArrayList.add("Мыла");
        testArrayList.add("Раму");

        for (int i = 0; i < testArrayList.size(); i ++)
        {
            if (testArrayList.get(i) != "именно" )
            {
                testArrayList.add(i + 1, "именно");
            }

        }
        System.out.println(testArrayList);
    }*/
/*1. Создай список слов, заполни его самостоятельно.
2. Метод fix() должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза

    // Метод находит заданный чар в строке хотя есть встроенный String.Contains();
    public static boolean findChar(String str, char ch)
    {
        boolean isCharAt = false;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch)
            {
                isCharAt = true;
                break;
            }
        }
        return isCharAt;
    }

    public static void main(String[] args)
    {
        String[] forTestListArray = {"роза","топол","огонь"," листва","снег","прапрщик","лес"};
        ArrayList<String> testListArray = new ArrayList<>();

        Collections.addAll(testListArray, forTestListArray); // Объеденят массивыв один
        for(int i = 0; i < testListArray.size(); i++)
        {
            if (findChar(testListArray.get(i), 'р'))
            {
                testListArray.remove(i);
            }
        }
        System.out.println(testListArray);
    }*/
/*5. Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c → a,a,b,b,c,c.
3. Используя цикл for, выведи результат на экран, каждое значение с новой строки

    // Метод добавляет копию текущего элемента списка и возвращает , т.е.12345 -> 1122334455
    public static  ArrayList<String> doubleValues(ArrayList<String> arrayListDoubled)
    {
        for(int i = 0; i < arrayListDoubled.size(); i += 2)
        {
                arrayListDoubled.add(i, arrayListDoubled.get(i));
        }
        return arrayListDoubled;
    }

    public static void main(String[] args) throws IOException
    {
        ArrayList<String> arrayListStr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 10 строк");

        for(int i = 0; i < 10; i++)
        {
            String str = reader.readLine();
            arrayListStr.add(str);
        }
        System.out.println(doubleValues(arrayListStr));
    }*/
/*1. Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Используя цикл for вывести их в обратном порядке.

    public static void main(String[] args) throws IOException
    {
        ArrayList<String> arrayListStr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 10 строк");

        for (int i = 0; i < 10; i++)
        {
            String str = reader.readLine();
            arrayListStr.add(str);
        }

        for (int i = arrayListStr.size() - 1; i <= arrayListStr.size() - 1; i--)
        {
            System.out.println(arrayListStr.get(i));
            if (i == 0) break;
        }
    }*/
/*2. Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N и M
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

    // Переставлает указанное колв-во элемнтов в списке первые указнные в конец, напрмер 123456 -> 456123
    public static ArrayList<String> transpositionOfElements(ArrayList<String> arrayForTran, int numOfElem)
    {
        // Созлдаем временные списки для разделения списка переданного для метода
        ArrayList<String> tempArray1 = new ArrayList<>();
        ArrayList<String> tempArray2 = new ArrayList<>();
        // Делим на 2 временных списка
        for (int i = 0; i <= arrayForTran.size()-1; i ++)
        {
            if (i <= numOfElem -1)
            tempArray1.add(arrayForTran.get(i));
            if (i > numOfElem -1){
                tempArray2.add(arrayForTran.get(i));
            }
        }
        tempArray2.addAll(tempArray1); // объединяем в нужном порядке
        return tempArray2;// возвращаем
    }

    public static void main(String[] args) throws IOException {

        ArrayList<String> arrayListStr = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1) Введите кол-во строк, которые необходимо заполнить");
        String nStr = reader.readLine();
        int nStrToInt = Integer.parseInt(nStr);
        System.out.println("2) Введите " + nStrToInt + " строк(и), через Enter");
        for (int i = 0; i < nStrToInt; i++)
        {
            String strInArray = reader.readLine();
            arrayListStr.add(strInArray);
        }
        System.out.println("3) Введите кол-во элементов которые необходимо переставить в конец списка");
        String numOfElemForTran = reader.readLine();
        int numOfElemForTranToInt = Integer.parseInt(numOfElemForTran);

        System.out.println(transpositionOfElements(arrayListStr, numOfElemForTranToInt));
    }*/
/*3. Максимальное и минимальное числа в массиве
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
    // Метод ввода массива с клавиатуры через переданноре знавченеи amountElements
    public static int[] enterArrayInt(int amountElements) throws IOException
    {
        int[] arrayInt = new int[amountElements];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введиет " + amountElements + " чисел с клавиатуры через Enter");

        for (int i = 0; i < amountElements; i++) {
            String str = reader.readLine();
            int strToInt = Integer.parseInt(str);
            arrayInt[i] = strToInt;
        }
        return arrayInt;
    }
    // Метода возвращает максимальное значение в массиве
    public static int maxValue(int[] arrayOfInt)
    {
        int maxInt = arrayOfInt[0];
        for (int i = 0; i < arrayOfInt.length; i++)
        {
            if (arrayOfInt[i] > maxInt)
            {
                maxInt = arrayOfInt[i];
            }
        }
        return maxInt;
    }
    // Метод возвращает минимальное значение в массиве
    public static int minValue(int[] arrayOfInt)
    {
        int minInt = arrayOfInt[0];
        for (int i = 0; i < arrayOfInt.length; i++)
        {
            if (arrayOfInt[i] < minInt)
            {
                minInt = arrayOfInt[i];
            }
        }
        return minInt;
    }

    public static void main(String[] args) throws IOException
    {
        int[] xz = enterArrayInt(10);
        System.out.println("Максимальное значеие в массиве - " + maxValue(xz) + ", минимальное значение в массиве - " + minValue(xz));
    }*/
/*4. Вводить с клавиатуры строки, пока пользователь не введёт строку “end
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку “end”. “end” не учитывать.
Вывести строки на экран, каждую с новой строки.

    public static void main(String[] args) throws IOException
    {
        ArrayList<String> arrayListStr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("водите строки черех Enter, для тогоч что бы закончить введите 'end'");

        while (true)
        {
            String str = reader.readLine();
            if (str.equals("end")) break;
            arrayListStr.add(str);
        }
        System.out.println(arrayListStr);
    }*/
/*5. Бум

Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!».
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.
Пример:
30
29
…
1
0
Бум!
    // Метод создает лист который будет отчитываться
    public static ArrayList<String> createArray() throws IOException {
        ArrayList<String> newArray = new ArrayList<>();

        for (int i = 0; i <30; i++)
        {
            newArray.add(0, Integer.toString(i + 1));
            if (i == 29){
                newArray.add("0");
                newArray.add("БУМ!");
            }
        }
        return newArray;
    }

    public static void main(String[] args) throws IOException, InterruptedException
    {
        ArrayList<String> arrayListStr = new ArrayList<>();
        arrayListStr = createArray(); // Создаем массив

        for(String str : arrayListStr)
        {
            System.out.println(str);
            Thread.sleep(1000); // задержка по времени в исполнени программы
        }
    }*/
}


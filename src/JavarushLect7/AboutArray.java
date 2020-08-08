package JavarushLect7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class AboutArray {
/*1. Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива

    public static int[] initializeArray() throws IOException
    {
        int[] arrayInt = new int[5];

        BufferedReader readerFromUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 20 чисел. Ввели число -> ENTER, Ввели число -> ENTER и т.д.");
        for (int i = 0; i < arrayInt.length; i++ ) {
            String strFromUser = readerFromUser.readLine();
            int strToInt = Integer.parseInt(strFromUser);
            arrayInt[i] = strToInt;
        }
        return arrayInt;
    }

    public static int max(int[] array)
    {
        int max = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > 0)
            {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args) throws IOException {

        int[] xz = initializeArray();
        System.out.println(max(xz));

    }*/
/*2. Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки

    public static void main(String[] args) throws IOException
    {
        String[] strArray = new String[10];

        BufferedReader readerFromUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 8 чисел... Число -> Enter, Число -> Enter и т.д.");
        for (int i =0; i < strArray.length - 2; i++)
        {
            String strFromUser = readerFromUser.readLine();
            strArray[i] = strFromUser;
        }

        for (int i = 9; i <= strArray.length; i--)
        {
            System.out.println(strArray[i]);
            if (i == 0){
                break;
            }
        }
    }*/
/*3. 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

    public static void main(String[] args) throws IOException
    {
        int[] numArray = new int[10];
        String[] strArray = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 10 строк, в конце каждой строки нажимите ENTER");
        for (int i =0; i < strArray.length; i++)
        {
            String str = reader.readLine();
            strArray[i] = str;
        }

        for (int i = 0; i < numArray.length; i++)
        {
            numArray[i] = strArray[i].length();
        }

        for (int i = 0; i < numArray.length; i++)
        {
            System.out.println(numArray[i]);
        }
    }*/
/*4. Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.

    public static void  main(String[] args) throws IOException
    {
        int[] arrayInt = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа...");
        for(int i = 9; i <= arrayInt.length; i--)
        {
            String str = reader.readLine();
            int strToInt = Integer.parseInt(str.trim());
            arrayInt[i] = strToInt;
            if(i == 0){break;}
        }

        for (int i = 0; i < arrayInt.length; i++) {System.out.println(arrayInt[i]);}
    }*/
/*5. Один большой массив и два маленьких

1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

    public static void main(String[] args) throws IOException{

        int[] arrayInt20 = new int[20];
        int[] arrayInt10_1 = new int[10];
        int[] arrayInt10_2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введиет 20 числе через Enter");
        for (int i = 0; i < arrayInt20.length; i++)
        {
            String str = reader.readLine();
            int strToInt = Integer.parseInt(str.trim());
            arrayInt20[i] = strToInt;
        }
        System.arraycopy(arrayInt20,0,arrayInt10_1,0,10);
        /*for (int i = 0; i < arrayInt10_1.length; i++)
        {
            arrayInt10_1[i] = arrayInt20[i];
        }
        System.arraycopy(arrayInt20,10,arrayInt10_2,0,10);
        /*for (int i = 10; i < arrayInt20.length; i++)
        {
            if (i > arrayInt20.length){break;}
            arrayInt10_2[i] = arrayInt20[i];
        }

        for (int j : arrayInt10_2) { //заменяет (int i = 0; i < arrayInt10_2.length; i++)
            System.out.println(j);
        }
    }
*/
}

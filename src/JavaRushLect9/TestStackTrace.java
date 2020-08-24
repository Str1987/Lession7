package JavaRushLect9;

public class TestStackTrace {
/*1. Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.

    public static void main(String[] args)
    {
        method1();
    }

    public static StackTraceElement method1()
    {
        StackTraceElement elem = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            if (element.getMethodName().equals("method1"))
            {
                elem = element;
                System.out.println(element.getMethodName());
            }
        }
        method2();
        return elem;
    }

    public static StackTraceElement method2()
    {
        StackTraceElement elem = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            if (element.getMethodName().equals("method2"))
            {
                elem = element;
                System.out.println(element.getMethodName());
            }
        }
        method3();
        return elem;
    }
    public static StackTraceElement method3()
    {
        StackTraceElement elem = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            if (element.getMethodName().equals("method3"))
            {
                elem = element;
                System.out.println(element.getMethodName());
            }
        }
        method4();
        return elem;
    }

    public static StackTraceElement method4()
    {
        StackTraceElement elem = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            if (element.getMethodName().equals("method4"))
            {
                elem = element;
                System.out.println(element.getMethodName());
            }
        }
        method5();
        return elem;
    }

    public static StackTraceElement method5()
    {
        StackTraceElement elem = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            if (element.getMethodName().equals("method5"))
            {
                elem = element;
                System.out.println(element.getMethodName());
            }
        }
        return elem;
    }

    =========================================================================
    Второй вариант задачи №1
    =========================================================================

    public static void main(String[] args) {
    method1();
}

public static StackTraceElement method1() {
    method2();
    return Thread.currentThread().getStackTrace()[1];
}

public static StackTraceElement method2() {
    method3();
    return Thread.currentThread().getStackTrace()[1];
}

public static StackTraceElement method3() {
    method4();
    return Thread.currentThread().getStackTrace()[1];
}

public static StackTraceElement method4() {
    method5();
    return Thread.currentThread().getStackTrace()[1];
}

public static StackTraceElement method5() {
    return Thread.currentThread().getStackTrace()[1];
}*/
/*2. И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его,
 полученное с помощью StackTrace.

    public static void main(String[] args)
    {
        method1();
    }

    public static StackTraceElement method1()
    {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        method2();
        return Thread.currentThread().getStackTrace()[2];
    }

    public static StackTraceElement method2()
    {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        method3();
        return Thread.currentThread().getStackTrace()[2];
    }
    public static StackTraceElement method3()
    {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        method4();
        return Thread.currentThread().getStackTrace()[2];
    }

    public static StackTraceElement method4()
    {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        method5();
        return Thread.currentThread().getStackTrace()[2];
    }

    public static StackTraceElement method5()
    {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        return Thread.currentThread().getStackTrace()[2];
    }*/
/*3. Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
    public static void main(String[] args) {
        method1();
    }

        public static int method1() {
            method2();
            System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());
            return Thread.currentThread().getStackTrace()[1].getLineNumber();
        }

        public static int method2() {
            method3();
            System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());
            return Thread.currentThread().getStackTrace()[1].getLineNumber();
        }

        public static int method3() {
            method4();
            System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());
            return Thread.currentThread().getStackTrace()[1].getLineNumber();
        }

        public static int method4() {
            method5();
            System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());
            return Thread.currentThread().getStackTrace()[1].getLineNumber();
        }

        public static int method5() {
            System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());
            return Thread.currentThread().getStackTrace()[1].getLineNumber();
        }*/
/*4. Стек-трейс длиной 10 вызовов
Напиши код, чтобы получить стек-трейс длиной 10 вызовов
public static void main(String[] args)
{
    method1();
}

    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }

    public static void method3()
    {
        method4();
    }
    public static void method4()
    {
        method5();
    }
    public static void method5()
    {
        method6();
    }
    public static void method6()
    {
        method7();
    }
    public static void method7()
    {
        method8();
    }
    public static void method8()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        System.out.println("</-------------------------------------------------/>");
    }*/
/*5. Метод должен возвращать результат – глубину её стек-трейса
Написать метод,
который возвращает результат – глубину его стек трейса – количество методов в нем
(количество элементов в списке). Это же число метод должен выводить на экран.
    public static void main(String[] args)
    {
        method1();
    }

    public static void method1()
    {
        method2();
        System.out.println(returnDeepOfStackTrace());
    }

    public static void method2()
    {
        method3();
    }

    public static void method3()
    {
        method4();
    }
    public static void method4()
    {

    }

    public static int returnDeepOfStackTrace()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        int numOfStackTrace = 0;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
        {
            numOfStackTrace ++ ;
        }

        return numOfStackTrace;
    }*/
}
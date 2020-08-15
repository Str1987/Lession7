package JavaRushLect8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Solution {

/*1. Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него три кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.

    public static class Cat2
    {
        public String name;

        Cat2 (String name)
        {
            this.name = name;
        }
    }

    public static void createCats(Set<Cat2> setOfCats2)
    {
        Cat2 cat1 = new Cat2("Барсик");
        Cat2 cat2 = new Cat2("Барсик1");
        Cat2 cat3 = new Cat2("Барсик2");

        setOfCats2.add(cat1);
        setOfCats2.add(cat2);
        setOfCats2.add(cat3);
    }

    public static void main(String[] args)
    {
        Set<Cat2> setOfCats = new HashSet<>();
        createCats(setOfCats);
        for (Cat2 obj : setOfCats)
        {
            setOfCats.remove(obj);
            break;
        }
        for (Cat2 obj_forPrint : setOfCats) {
            System.out.println(obj_forPrint.name);
        }
    }*/
/*2. Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки*/

   public static class Cats
   {}
   public static class Dogs
   {}
    public static Cats createCats(){
        Set<Cats> setOfCats  = new HashSet<>();
        for(int i = 0; i < 4; i++)
        {
            Cats cat = new Cats();
            setOfCats.add(cat);
        }
        return (Cats) setOfCats;
    }

    public static Dogs createDogs(){
        Set<Dogs> setOfDogs  = new HashSet<>();
        for(int i = 0; i < 3; i++)
        {
            Dogs dog = new Dogs();
            setOfDogs.add(dog);
        }
        return (Dogs) setOfDogs;
    }

    public static Set<Object> join (Set<Cats> setOfCats, Set<Dogs> setOfDogs){
       Set<Object> pets = new HashSet<>();
       pets.addAll(setOfCats);
       pets.addAll(setOfDogs);
       return pets;
    }

    public static Set<Object> deleteCats(Set<Object> setPets, Set<Cats> setCats)
    {
        setPets.removeAll(setCats);
        return setPets;
    }

    public static void printPets(Set<Object> pets){

        Iterator <Object> itr = pets.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args)
    {
    }

}

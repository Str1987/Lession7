package JavarushLect7;

public class Human {
    /*6. Семья

    Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
    Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
    Примечание:
    Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
    Пример вывода:
    Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
    Имя: Катя, пол: женский, возраст: 55
    Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня*/
    /*public static void main(String[] args) {

        Human grandMa1 = new Human("Сидорова Натлья Николаевна", "Женский", 65);
        Human grandPa1 = new Human("Сидоров Иван Михайлович", "Мужской", 67);

        Human grandMa2 = new Human("Микрюкова Ксения Викторовна", "Женский", 63);
        Human grandPa2 = new Human("Микрюков Геннадий Альбертович", "Мужской", 68);

        Human father1 = new Human("Сидоров Анатолий Иванович", "Мужской", 41, grandMa1, grandPa1);
        Human mother1 = new Human("Сидорова Елена Геннадьевна", "Женский", 36, grandMa2, grandPa2);

        Human child1 = new Human("Сидоров Илья Анатольевич", "Мужской", 17, father1, mother1);
        Human child2 = new Human("Сидоров Василий Анатольевич", "Мужской", 15, father1, mother1);
        Human child3 = new Human("Сидорова Юлия Анатольевна", "Мужской", 12, father1, mother1);
        System.out.println(returnToString(father1));

    }*/

    private String name;
    private String sex;
    private int age;
    private Human father;
    private Human mother;

    public Human ( String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human ( String name, String sex, int age, Human mother, Human father)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }
   static public String returnToString(Human objectToStr){
        String str = "";
        if (objectToStr.mother == null)
        {
            str = "Имя: " + objectToStr.name + ", пол: " + objectToStr.sex + ", возраст: " + objectToStr.age;
        } else
        {
            str = "Имя: " + objectToStr.name + ", пол: " + objectToStr.sex + ", возраст: " + objectToStr.age +
                        ", Мама: " + objectToStr.mother.name + ", Папа: " + objectToStr.father.name;
        }
        return str;
    }

    public void setName(String name)
    {
        this.name = name;
    }

} // public static void main в main.java







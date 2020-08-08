package JavarushLect7;

public class Main {

    public static void main(String[] args) {

        Human grandMa1 = new Human("Сидорова Натлья Николаевна", "Женский", 65);
        Human grandPa1 = new Human("Сидоров Иван Михайлович", "Мужской", 67);

        Human grandMa2 = new Human("Микрюкова Ксения Викторовна", "Женский", 63);
        Human grandPa2 = new Human("Микрюков Геннадий Альбертович", "Мужской", 68);

        Human father1 = new Human("Сидоров Анатолий Иванович", "Мужской", 41, grandMa1, grandPa1);
        Human mother1 = new Human("Сидорова Елена Геннадьевна", "Женский", 36, grandMa2, grandPa2);

        Human child1 = new Human("Сидоров Илья Анатольевич", "Мужской", 17, father1, mother1);
        Human child2 = new Human("Сидоров Василий Анатольевич", "Мужской", 15, father1, mother1);
        Human child3 = new Human("Сидорова Юлия Анатольевна", "Мужской", 12, father1, mother1);
        System.out.println(Human.returnToString(father1));

    }

}

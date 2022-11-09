import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person fedya = new Person("Федя", "Сумкн из рода сумчатых", 18);
        Person senya = new Person("Сеня", "Семен Семенович Ганж", 17);
        Person agronom = new Person("Агроном", "Бомж Сын Агропрома", 36);
        Person logovaz = new Person("Логоваз", "Эльф Безотцовщина Трандуил", 265);
        Person pendal = new Person("Пендальф", "Серый Майер", 126);
        Person givi = new Person("Гиви", "Зурабович Церетели спустившийся с гор", 54);

        List<Person> people = new ArrayList<>();
        people.add(fedya);
        people.add(senya);
        people.add(agronom);
        people.add(logovaz);
        people.add(pendal);
        people.add(givi);

        Comparator<Person> comparatorSurname = (o1, o2) -> {
            if (o1.getSurname().equals(o2.getSurname())) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return Integer.compare(o1.countWordsSurname(o1.getSurname()), o2.countWordsSurname(o2.getSurname()));
        };

        people.sort(comparatorSurname);
        System.out.println(people);

    }
}


//import java.util.Comparator;
//
//public class PersonsSurnameLenthComparator implements Comparator<Person> {
//
//    @Override
//    public int compare(Person o1, Person o2) {
//        if (o1.getSurname().equals(o2.getSurname())) {
//            return Integer.compare(o1.getAge(), o2.getAge());
//        }
//        return Integer.compare(o1.countWordsSurname(o1.getSurname()), o2.countWordsSurname(o2.getSurname()));
//    }
//}
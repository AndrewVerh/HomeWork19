import java.util.Comparator;

public class PersonsSurnameLenthComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().equals(o2.getSurname())) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(o1.countWordsSurname(o1.getSurname()), o2.countWordsSurname(o2.getSurname()));
    }

}
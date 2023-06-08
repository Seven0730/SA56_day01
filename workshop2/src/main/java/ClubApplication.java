public class ClubApplication {
    public static void main(String[] args) {

        Person person1 = new Person("sun","han");

        Person person2 = new Person("qin","qin","yuan");

        person1.show();

        person2.show();

        Facility facility1 = new Facility("class1", "teach");

        Facility facility2 = new Facility("class2");

        facility2.show();

        facility1.show();
    }
}

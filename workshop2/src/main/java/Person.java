public class Person {
    private String surname;
    private String firsName;
    private String secondName;

    public Person(String surname, String firsName, String secondName) {
        this.surname = surname;
        this.firsName = firsName;
        this.secondName = secondName;
    }

    public Person(String surname, String firsName) {
        this.surname = surname;
        this.firsName = firsName;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirsName() {
        return firsName;
    }


    public String getSecondName() {
        return secondName;
    }

    public void show(){
        if(secondName != null)
        System.out.println(surname + firsName + secondName);
        else
            System.out.println(surname + firsName);
    }
}

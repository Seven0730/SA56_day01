public class Facility {

    private String name;
    private String desc = null;

    public Facility(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Facility(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void show(){
        if (desc != null) System.out.println(name + "(" + desc + ")");
        else
            System.out.println(name);
    }
}

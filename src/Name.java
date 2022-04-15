public class Name {

    String name = "ДЖЕК";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Робот " +
                "с именем " + this.getName() + ',';
    }
}


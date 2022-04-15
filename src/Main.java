public class Main {
    public static void main(String[] args) {
        Name name = new Name("ДЖЕК");
        Body body = new Body();
        System.out.println(name.toString() + body.FactoryBody() + " обычное, а голова " + Head.KVADRAT.getType());
        System.out.println(name.toString() + body.FactoryBody() + " обычное, а голова " + Head.TREYGOLNIK.getType());
        System.out.println(name.toString() + body.FactoryBody() + " обычное, а голова " + Head.OVAL.getType());
        System.out.println("Робот по имени " + name.getName() + ", " + body.FactoryBody() + " обычное, а голова " + Head.KVADRAT.getType());
    }
}

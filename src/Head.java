public enum Head {
    OVAL( "овальная") ,
    KVADRAT("квадратная") ,
    TREYGOLNIK("треугольная");
    private String type;

    Head(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}




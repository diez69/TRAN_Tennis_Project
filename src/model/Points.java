package model;

public enum Points {
    ZERO("0"),
    FIFTEEN("15"),
    THIRTY("30"),
    FORTY("40"),
    A("A");

    private String stringOfPoints;

    Points(String stringOfPoints) {
        this.stringOfPoints = stringOfPoints;
    }

    public String getStringOfPoints() {
        return stringOfPoints;
    }
}
package ZZBcomportamento.dominio;

public class Car {
    private String name = "Audi";
    private String color;
    private Integer year;

    public Car(String color, Integer year) {
        this.color = color;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}

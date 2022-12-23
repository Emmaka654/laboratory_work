interface IHouses {
    String NewFunction();
}

public class Houses implements IHouses {
    private String type;
    private String country;
    private double cost;
    private double square;

    @Override
    public String toString() {
        return "Houses{" +
                "type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", square=" + square +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String NewFunction() {
        return "Function";
    }


}

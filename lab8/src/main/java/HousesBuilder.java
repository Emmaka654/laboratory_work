public class HousesBuilder implements IHousesBuilder {
    private Houses house;

    public HousesBuilder() {
        house = new Houses();
    }

    public void typeBuilder(String type) {
        house.setType(type);
    }

    public void countryBuilder(String country) {
        house.setCountry(country);
    }

    public void costBuilder(double cost) {
        house.setCost(cost);
    }

    public void squareBuilder(double square) {
        house.setSquare(square);
    }

    public Houses getHouse() {
        Houses house1 = house;
        house = new Houses();
        return house1;
    }
}

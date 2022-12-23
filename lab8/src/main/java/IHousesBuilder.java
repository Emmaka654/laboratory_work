public interface IHousesBuilder {
    void typeBuilder(String type);

    void countryBuilder(String country);

    void costBuilder(double cost);

    void squareBuilder(double square);

    Houses getHouse();
}
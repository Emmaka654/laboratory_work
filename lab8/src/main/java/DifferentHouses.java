class Panel {
    private final IHousesBuilder house;

    public Panel(IHousesBuilder house) {
        this.house = house;
    }

    public void build(double cost, double square) {
        house.typeBuilder("Panel");
        house.countryBuilder("Russia");
        house.costBuilder(cost);
        house.squareBuilder(square);
    }
}

class Сottage {
    private final IHousesBuilder house;

    public Сottage(IHousesBuilder house) {
        this.house = house;
    }

    public void build(double cost, double square) {
        house.typeBuilder("Cottage");
        house.countryBuilder("USA");
        house.costBuilder(cost);
        house.squareBuilder(square);
    }
}

class Skyscraper {
    private final IHousesBuilder house;

    public Skyscraper(IHousesBuilder house) {
        this.house = house;
    }

    public void build(double cost, double square) {
        house.typeBuilder("Skyscrapper");
        house.countryBuilder("Dubai");
        house.costBuilder(cost);
        house.squareBuilder(square);
    }
}
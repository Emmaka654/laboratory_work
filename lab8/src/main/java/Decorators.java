class HousesDecorator implements IHouses {
    private final IHouses house;

    public HousesDecorator(IHouses house) {
        this.house = house;
    }

    public String NewFunction() {
        return house.NewFunction();
    }

}

class CalculateSquare extends HousesDecorator {
    public CalculateSquare(IHouses house) {
        super(house);
    }

    @Override
    public String NewFunction() {
        String improve = super.NewFunction();
        improve += " + Calculated square\n";
        return improve;
    }
}

class OpenTheDoor extends HousesDecorator {
    public OpenTheDoor(IHouses house) {
        super(house);
    }

    @Override
    public String NewFunction() {
        String improve = super.NewFunction();
        improve += " + Open the door\n";
        return improve;
    }
}

class Live extends HousesDecorator {
    public Live(IHouses house) {
        super(house);
    }

    @Override
    public String NewFunction() {
        String improve = super.NewFunction();
        improve += " + Live in the house\n";
        return improve;
    }
}
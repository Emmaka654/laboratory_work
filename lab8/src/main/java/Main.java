import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Singleton singleton = new Singleton();

        HousesBuilder panelBuilder = new HousesBuilder();
        Panel panel = new Panel(panelBuilder);
        panel.build(100_000, 75);
        Houses house = panelBuilder.getHouse();
        System.out.println(house.toString());

        CalculateSquare panelCalculateSquare = new CalculateSquare(house);
        singleton.addHouse(house);
        System.out.println(panelCalculateSquare.NewFunction());


        HousesBuilder cottageBuilder = new HousesBuilder();
        Сottage cottage = new Сottage(cottageBuilder);
        cottage.build(200_000, 150);
        Houses house1 = cottageBuilder.getHouse();
        System.out.println(house1.toString());

        OpenTheDoor cottageOpenTheDoor = new OpenTheDoor(house1);
        Live cottageLive = new Live(cottageOpenTheDoor);

        System.out.println(cottageLive.NewFunction());
        singleton.addHouse(house1);


        HousesBuilder skyscraperBuilder = new HousesBuilder();
        Skyscraper skyscraper = new Skyscraper(skyscraperBuilder);
        skyscraper.build(300_000_000, 7.5);
        Houses house2 = skyscraperBuilder.getHouse();
        System.out.println(house2.toString());

        CalculateSquare skyscraperCalculateSquare = new CalculateSquare(house2);
        OpenTheDoor skycrapperOpenTheDoor = new OpenTheDoor(skyscraperCalculateSquare);
        Live live = new Live(skycrapperOpenTheDoor);

        System.out.println(live.NewFunction());
        singleton.addHouse(house2);

        singleton.GetAllHouses();
    }
}
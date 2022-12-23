
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void panelTest() {
        Houses expected = new Houses();
        expected.setType("Panel");
        expected.setCountry("Russia");
        expected.setCost(100_000.0);
        expected.setSquare(75);

        HousesBuilder panelBuilder = new HousesBuilder();
        Panel panel = new Panel(panelBuilder);
        panel.build(100_000, 75);
        Houses actual = panelBuilder.getHouse();

        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void cottageTest() {
        Houses expected = new Houses();
        expected.setType("Cottage");
        expected.setCountry("USA");
        expected.setCost(200_000);
        expected.setSquare(150);

        HousesBuilder cottageBuilder = new HousesBuilder();
        Сottage cottage = new Сottage(cottageBuilder);
        cottage.build(200_000, 150);
        Houses actual = cottageBuilder.getHouse();

        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void skyscraperTest() {
        Houses expected = new Houses();
        expected.setType("Skyscrapper");
        expected.setCountry("Dubai");
        expected.setCost(300_000_000);
        expected.setSquare(7.5);

        HousesBuilder skyscraperBuilder = new HousesBuilder();
        Skyscraper skyscraper = new Skyscraper(skyscraperBuilder);
        skyscraper.build(300_000_000, 7.5);
        Houses actual = skyscraperBuilder.getHouse();

        Assert.assertEquals(expected.toString(), actual.toString());
    }
}

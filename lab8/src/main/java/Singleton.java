import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Singleton {
    private static Singleton instance;
    private ArrayList<Houses> housesArrayList = new ArrayList<>();

    FileWriter output;

    protected Singleton() {
    }

    public static Singleton Instance() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return null;
    }

    public void addHouse(Houses house) throws IOException {
        output = new FileWriter("output.txt", true);
        housesArrayList.add(house);
        output.write(house.toString() + "\n");
        output.close();
    }

    public Houses[] GetAllHouses() {
        Houses[] resultArray = new Houses[housesArrayList.size()];
        housesArrayList.toArray(resultArray);
        return resultArray;
    }

}
package seminar;

public class CarOS implements OS{
    String lastUpdate;

    public CarOS(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void update(String update)
    {
        this.lastUpdate = update;
    }

    public void printLastUpdate()
    {
        System.out.println(this.lastUpdate);
    }
}

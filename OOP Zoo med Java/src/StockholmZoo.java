public class StockholmZoo extends Place {
    private String isSafe;

    public StockholmZoo(String city, String zooName, int ageOfZoo, String isSafe) {
        super(city, zooName, ageOfZoo);
        this.isSafe = isSafe;

    }

    public String getIsSafe() {
        return isSafe;
    }

    public void setIsSafe(String isSafe) {
        this.isSafe = isSafe;
    }
    
}

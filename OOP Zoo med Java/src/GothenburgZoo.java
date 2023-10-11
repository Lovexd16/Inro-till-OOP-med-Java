public class GothenburgZoo extends Place{
    
    private String pool;

    public GothenburgZoo(String city, String zooName, int ageOfZoo, String pool) {
        super(city, zooName, ageOfZoo);
        this.pool = pool;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

}

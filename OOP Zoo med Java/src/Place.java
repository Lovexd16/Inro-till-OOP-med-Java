public class Place {
    private String city;
    private String zooName;
    private int ageOfZoo;

    public Place(String city, String zooName, int ageOfZoo) {
        this.city = city;
        this.zooName = zooName;
        this.ageOfZoo = ageOfZoo;
    }

    public void sayZooWelcome() {
        System.out.println("Hej! Vårat zoo i " + this.city + " heter " + this.zooName + " och zoo:t är " + ageOfZoo + " år gammalt!");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public int getAgeOfZoo() {
        return ageOfZoo;
    }

    public void setAgeOfZoo(int ageOfZoo) {
        this.ageOfZoo = ageOfZoo;
    }

}


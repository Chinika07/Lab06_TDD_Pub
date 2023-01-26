public class Guest {

    // Properties
    private String name;
    private int age;
    private int wallet;
    private int sobriety;
    private String bannedFromPub;

    // Constructor
    public Guest(String name, int age, int wallet, int sobriety, String bannedFromPub){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
        this.bannedFromPub = bannedFromPub;
    }

    // Getters & Setters
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return this.age;}
    public void setAge(int age) {this.age = age;}

    public int getWallet() {return this.wallet;}
    public void setWallet(int wallet) {this.wallet = wallet;}

    public int getSobriety() {return this.sobriety;}
    public void setSobriety(int sobriety) {this.sobriety = sobriety;}
    public String getBannedFromPub() {return this.bannedFromPub;}
    public void setBannedFromPub(String bannedFromPub) {this.bannedFromPub = bannedFromPub;}




}

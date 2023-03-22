
public abstract class Pokemon {

    //variabelen
    //De privé-declaratie van variabelen binnen een klasse beperkt de toegang tot hun waarden en zorgt ervoor dat hun wijziging alleen mogelijk is via de methoden die de klasse aanbiedt, waardoor de encapsulatie en controle van de klasse behouden blijft.
    private String type;
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;

    //constructor
    public Pokemon(){

    }

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public Pokemon(String type, String name, int level, int hp, String food, String sound) {
        this.type = type;
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    //getters setters
    public String getType() {
        return "normal";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    //methoden

}

import java.util.Objects;

class FirePokemon extends Pokemon{
    public String getType() {
        return "fire";
    }

    //constructor
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    //methode
    void flameThrower(Pokemon nameFighterOne, Pokemon nameFighterTwo){
        System.out.println(nameFighterOne.getName() + "attacks" + nameFighterTwo.getName());
        if (Objects.equals(nameFighterOne.getType(), "fire") && Objects.equals(nameFighterTwo.getType(), "grass")) {
            System.out.println(nameFighterOne.getName() + " has won!");
            int newHpWinner = nameFighterOne.getHp() + 3;
            System.out.println(nameFighterOne.getName() + " goes from " + nameFighterOne.getHp() + " to: " + newHpWinner);
            System.out.println(nameFighterTwo.getName() + " looses!");
            /*System.out.println(nameFighterTwo.getName() + " goes from " + nameFighterTwo.getHp() + " to: " + nameFighterTwo.setHp(nameFighterTwo.getHp()-3););*/ // werkt niet, vragen waarom dit niet werkt
            int newHpLooser = nameFighterTwo.getHp() - 3;
            System.out.println(nameFighterTwo.getName() + " goes from " + nameFighterTwo.getHp() + " to: " + newHpLooser);
        } else if (Objects.equals(nameFighterOne.getType(), "fire") && Objects.equals(nameFighterTwo.getType(), "water")){
            System.out.println(nameFighterOne.getName() + " has won!");
            int newHpWinner = nameFighterOne.getHp() + 2;
            System.out.println(nameFighterOne.getName() + " goes from " + nameFighterOne.getHp() + " to: " + newHpWinner);
            System.out.println(nameFighterTwo.getName() + " looses!");
            int newHpLooser = nameFighterTwo.getHp() - 2;
            System.out.println(nameFighterTwo.getName() + " goes from " + nameFighterTwo.getHp() + " to: " + newHpLooser);
        }
        else if (Objects.equals(nameFighterOne.getType(), "fire") && Objects.equals(nameFighterTwo.getType(), "electric")){
            System.out.println(nameFighterOne.getName() + " has won!");
            int newHpWinner = nameFighterOne.getHp() + 1;
            System.out.println(nameFighterOne.getName() + " goes from " + nameFighterOne.getHp() + " to: " + newHpWinner);
            System.out.println(nameFighterTwo.getName() + " looses!");
            int newHpLooser = nameFighterTwo.getHp() - 1;
            System.out.println(nameFighterTwo.getName() + " goes from " + nameFighterTwo.getHp() + " to: " + newHpLooser);
        }
        else if (Objects.equals(nameFighterOne.getType(), "fire") && Objects.equals(nameFighterTwo.getType(), "fire")){
            System.out.println("This fight was a waste, nothing happend");
        }
    }
}

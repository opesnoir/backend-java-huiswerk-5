import java.util.Objects;

//vraag: hoe voorkom je 'duplicated' code?

class WaterPokemon extends Pokemon {

    @Override
    public String getType() {
        return "water";
    }

    //constructor
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    //methode
    void hydroPump(Pokemon nameFighterOne, Pokemon nameFighterTwo) {

        System.out.println(nameFighterOne.getName() + "attacks" + nameFighterTwo.getName());

        if (Objects.equals(nameFighterOne.getType(), "water") && Objects.equals(nameFighterTwo.getType(), "electric")) {
            System.out.println(nameFighterOne.getName() + " has won!");
            int newHpWinner = nameFighterOne.getHp() + 3;
            System.out.println(nameFighterOne.getName() + " goes from " + nameFighterOne.getHp() + " to: " + newHpWinner);
            System.out.println(nameFighterTwo.getName() + " looses!");
            int newHpLooser = nameFighterTwo.getHp() - 3;
            System.out.println(nameFighterTwo.getName() + " goes from " + nameFighterTwo.getHp() + " to: " + newHpLooser);
        }

        else if (Objects.equals(nameFighterOne.getType(), "water") && Objects.equals(nameFighterTwo.getType(), "fire")) {
            System.out.println(nameFighterOne.getName() + " has won!");
            int newHpWinner = nameFighterOne.getHp() + 2;
            System.out.println(nameFighterOne.getName() + " goes from " + nameFighterOne.getHp() + " to: " + newHpWinner);
            System.out.println(nameFighterTwo.getName() + " looses!");
            int newHpLooser = nameFighterTwo.getHp() - 2;
            System.out.println(nameFighterTwo.getName() + " goes from " + nameFighterTwo.getHp() + " to: " + newHpLooser);
        }

        else if (Objects.equals(nameFighterOne.getType(), "water") && Objects.equals(nameFighterTwo.getType(), "grass")) {
            System.out.println(nameFighterOne.getName() + " has won!");
            int newHpWinner = nameFighterOne.getHp() + 1;
            System.out.println(nameFighterOne.getName() + " goes from " + nameFighterOne.getHp() + " to: " + newHpWinner);
            System.out.println(nameFighterTwo.getName() + " looses!");
            int newHpLooser = nameFighterTwo.getHp() - 1;
            System.out.println(nameFighterTwo.getName() + " goes from " + nameFighterTwo.getHp() + " to: " + newHpLooser);
        }

        else if (Objects.equals(nameFighterOne.getType(), "water") && Objects.equals(nameFighterTwo.getType(), "water")) {
            System.out.println("This fight was a waste, nothing happend");
        }
    }
}

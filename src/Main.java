import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] hero = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < hero.length; i++){
            hero[i].applySuperAbility();
            if (hero[i] instanceof Medic) {
                ((Medic) hero[i]).increaseExperience();
                System.out.println("Опыт лечения медика: " + ((Medic) hero[i]).getHealPoints());
            }

        }
    }
}
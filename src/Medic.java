public class Medic extends Hero{
    private int healPoints;
    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic применил суперспособность CRITICAL DAMAGE");
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience(){
        healPoints = (int) (healPoints * 1.1);
    }
}

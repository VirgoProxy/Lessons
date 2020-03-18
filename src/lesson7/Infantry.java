package lesson7;

public class Infantry extends BattleUnit{
    private int armor;

    public Infantry(int healthScore, int speed, int attackScore, int armor) {
        super(healthScore, speed, attackScore);
        setArmor(armor);
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Пехотинец атакует");
    }

    @Override
    public void rest(Unit rest) {
        System.out.println("Пехотинец отдыхает");
    }
}

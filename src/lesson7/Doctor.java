package lesson7;

public class Doctor extends BattleUnit{
   private int medicineScore;

    public Doctor(int healthScore, int speed, int attackScore, int medicineScore) {
        super(healthScore, speed, attackScore);
        setMedicineScore(medicineScore);
    }

    public int getMedicineScore() {
        return medicineScore;
    }

    public void setMedicineScore(int medicineScore) {
        this.medicineScore = medicineScore;
    }

    @Override
    public void attack(BattleUnit unit) {//override - указатель, программа будет рабоать если его убрать,
        // но он не только указатель для нас, он также явлется указателем к компилятору, что мы переопределяем метод
        System.out.println("Атака доктора");
    }

    @Override
    public void rest(Unit rest) {
        System.out.println("Доктор отдыхает");
    }

    @Override
    public void runFromField() {
        System.out.println("runFromField CanRest");
    }
}

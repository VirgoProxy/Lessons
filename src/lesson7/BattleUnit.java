package lesson7;

abstract public class BattleUnit extends Unit implements CanAttack{//extends - оператор наследования, где Юнит - это родительский класс, т.е. мы расширяем класс юнит
    //множественное наследования классов через extends запрещено
    // implements - реализация методов выбранного интерфейса
    //заключает контракт на выполнение методов интерфейса, выполняет все нереализованные методы интерфейса
    //имплементировать несколько интерфейсов можно через запятую
    //абстрактные классы - мы не можем создать объект на основании абстрактного класса
    //у абстрактных классов могут быть методы и с реализацией, и без реализации

    protected int attackScore;

    public BattleUnit(int healthScore, int speed, int attackScore) {
        super(healthScore, speed);//вызов конструктора родительского класса
        setAttackScore(attackScore);
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    @Override
    public void runFromField() {
        System.out.println();
    }
    //принимаем String, возвращаем объект
    public static BattleUnit getBattleUnit(String type){
        BattleUnit battleUnit = null;
        //фабрика
        if ("knight".equals(type)){
            battleUnit = new Knight((int)(Math.random()*10 + 2), (int)(Math.random()*7 + 1),
                    (int)(Math.random()*8 + 1), (int)(Math.random()*13 + 3));
        }
        else if ("doctor".equals(type)){
            battleUnit = new Doctor((int)(Math.random()*10 + 2), (int)(Math.random()*7 + 1),
                    (int)(Math.random()*8 + 1), (int)(Math.random()*13 + 3));
        }
        else if ("infantry".equals(type)){
            battleUnit = new Infantry((int)(Math.random()*10 + 2), (int)(Math.random()*7 + 1),
                    (int)(Math.random()*8 + 1), (int)(Math.random()*13 + 3));
        }
        return battleUnit;
    }
}

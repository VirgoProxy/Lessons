package lesson7;

public interface CanAttack{// на основе интерфейса нельзя создать объект,
    // до 8й версии у интерфейсов могут быть только методы без реализаций(только методы и аргументы)
    //по умолчанию все public
    //если мы хотим написать в интерфейсе метод с реализацией, то такой метод называется дефолтным(default)
    void attack(BattleUnit enemy);

    default void runFromField() {
        System.out.println("runFromField CanRest");
    }
}

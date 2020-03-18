package lesson7;

public interface CanRest {//если класс использует несколько интерфейсов,
    // а в них содержатся одинаковые методы, то необходимо в самом классе метод переопределить
    void rest(Unit rest);

    default void runFromField() {
        System.out.println("runFromField CanRest");
    }
}

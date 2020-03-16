package ru.virgo.lesson6;

public class Author {
    // свойства
    private String name;//этот модификатор доступа запрещает доступ к свойству извне, только внутри класса
    private String surname;

    //методы
    //Setter используем для присвания значений свойтв

    public void setName(String name) {//по сути дела такой метод необходим для того, чтобы можно было прописать проверки
        //name != null
        if(name.length() >= 2 && !"".equals(name)){//!"".equals(name) - проверка на пустую строчку
            this.name = name;//this - это ссылка на текущий объект
            //здесь return тоже можно использовать для выхода из программы
        }
        //проверка на соответствие на примере:
        //String someVar;
        //someVar.equals("java"); - неправильно
        //"java".equals(someVar); - правильно

    }
    public String getName() {//метод getter возвращает значениме свойства
        return name;//свойства после return рабоать не будут, т.к. он оканчивает работу метода
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

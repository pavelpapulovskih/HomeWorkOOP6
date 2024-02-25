package Lesson_10.Ex002;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {

        Worker w = new Worker(28, "firstName", "lastName", 20, 22);

        // #region ParameterizedWorker

        ParameterizedWorker<Integer> w1 = new ParameterizedWorker<Integer>(
                1990,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w1.getId());

        String uid = UUID.randomUUID().toString();
        ParameterizedWorker<String> w2 = new ParameterizedWorker<>(
                uid,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w2.getId());

// В данном коде используется принцип SOLID - принцип открытости/закрытости (Open/Closed Principle - OCP).
// Принцип OCP гласит, что классы должны быть открыты для расширения, но закрыты для модификации. 
// В данном коде класс ParameterizedWorker является обобщенным (generic) классом, который позволяет создавать объекты с различными типами данных для их идентификаторов (id). 
// Это позволяет добавлять новые типы данных для идентификаторов, не изменяя сам класс ParameterizedWorker.
// Использование обобщенного класса ParameterizedWorker демонстрирует принцип OCP, так как он позволяет добавлять новую функциональность (новые типы данных для идентификаторов) без изменения существующего кода.

       












// #endregion

        // #region MultiParameterized
        // MultiParameterized<Integer, Double, String> mp1 = new MultiParameterized<>(
        //         1, 2.0, "3.0");
        // System.out.println(mp1);

        // MultiParameterized<String, String, String> mp2 = new MultiParameterized<>(
        //         "1", "2.0", "3.0");
        // System.out.println(mp2);

        // #endregion

    }
}

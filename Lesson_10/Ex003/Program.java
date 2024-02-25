package Lesson_10.Ex003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4));
        

        var el = Methods.getElementFromIntegerCollection(data, 1);
        System.out.println(el);
        el = Methods.<Integer>getElementFromUCollection(data, 2);
        el = Methods.getElementFromUCollection(data, 2);
        System.out.println(el);

    }
}
// В данном коде используется принцип SOLID - принцип подстановки Барбары Лисков (Liskov Substitution Principle - LSP).
// Принцип LSP утверждает, что объекты в программе должны быть заменяемыми экземплярами их базовых типов без изменения правильности программы. 
// В контексте данного кода, методы getElementFromIntegerCollection и getElementFromUCollection принимают коллекцию элементов и возвращают элемент из этой коллекции.
// Использование принципа LSP означает, что метод getElementFromUCollection должен корректно работать с коллекцией любого типа, который является подтипом Collection. 
// В данном коде метод getElementFromUCollection действительно работает с типом List<Integer>, что подтверждает соблюдение принципа LSP.

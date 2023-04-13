package vio.vin.javanewfeat.java8.use_supplier;

import java.util.function.Supplier;

public class UseSupplier {
    public void case1() {
        Supplier<Person> nullPersonSupplier = Person::new;
        Supplier<Person> notNullPersonSupplier = () -> new Person("k", "v");
        System.out.println(nullPersonSupplier.get().toString());
        System.out.println(notNullPersonSupplier.get());
    }

    public static void main(String[] args) {
        new UseSupplier().case1();
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
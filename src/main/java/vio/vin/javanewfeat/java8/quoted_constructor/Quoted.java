package vio.vin.javanewfeat.java8.quoted_constructor;

public class Quoted {
    public void case1() {
        PersonFactory<Personal> personFactory = new PersonFactory<Personal>() {
            @Override
            public Personal create(String firstName, String lastName) {
                return new Personal(firstName, lastName);
            }
        };
        Personal personal = personFactory.create("t", "v");
    }

    public void case2() {
        PersonFactory<Personal> personFactory = Personal::new;
        personFactory.create("f", "v");
    }
}

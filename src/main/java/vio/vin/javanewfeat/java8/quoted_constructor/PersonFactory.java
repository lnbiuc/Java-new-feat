package vio.vin.javanewfeat.java8.quoted_constructor;

interface PersonFactory<P extends Personal> {
    P create(String firstName, String lastName);
}

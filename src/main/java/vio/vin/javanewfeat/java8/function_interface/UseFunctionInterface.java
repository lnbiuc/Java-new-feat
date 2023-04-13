package vio.vin.javanewfeat.java8.function_interface;

public class UseFunctionInterface {
    public void case1() {
        FunctionInterface service = i -> i + 1;
        System.out.println(service.increase(10));
    }
}

package vio.vin.javanewfeat.java8.interface_default_method;

import org.springframework.stereotype.Component;

@Component
public class InterfaceDefaultMethod {

    private final CalcService calcService;

    public InterfaceDefaultMethod(CalcService calcService) {
        this.calcService = calcService;
    }

    public void case1() {
        System.out.println(calcService.calcLevel(100));
        calcService.defaultInterfaceMethod(111);
    }
}

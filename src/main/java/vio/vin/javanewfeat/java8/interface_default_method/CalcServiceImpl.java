package vio.vin.javanewfeat.java8.interface_default_method;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService{
    @Override
    public void defaultInterfaceMethod(int i) {
        System.out.println(i);
    }
}

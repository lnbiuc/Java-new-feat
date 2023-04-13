package vio.vin.javanewfeat.java8.interfacedefault;

public interface CalcService {
    void defaultInterfaceMethod(int i);
    default double calcLevel(int level) {
        return Math.floor((double) level / 10);
    }
}

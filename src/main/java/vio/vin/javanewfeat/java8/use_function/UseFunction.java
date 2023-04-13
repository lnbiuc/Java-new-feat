package vio.vin.javanewfeat.java8.use_function;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

public class UseFunction {

    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public void case1() {
        Function<Date, String> formatDate = simpleDateFormat::format;
        System.out.println(formatDate.apply(new Date()));
    }
}

package vio.vin.javanewfeat.java8.quoted_constructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UseSimpleQuoted {
    public void case1() {
        Entity name = new Entity("name", 1);

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Entity {

    private String name;

    private Integer id;
}

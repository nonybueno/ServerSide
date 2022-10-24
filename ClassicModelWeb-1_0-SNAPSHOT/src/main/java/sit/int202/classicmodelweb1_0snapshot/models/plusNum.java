package sit.int202.classicmodelweb1_0snapshot.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor


public class plusNum {
    private int num1;
    private int num2;

    public int sum() {
        return this.num1 + this.num2;
    }
}

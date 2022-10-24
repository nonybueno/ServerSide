package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class calmodel {
    private static int num1;
    private static int num2;
    public calmodel(int num1, int num2) {
        this.num1=num1;
        this.num2=num2;
    }
    public int sumNum(){
        return this.num1 + this.num2;
    }

}

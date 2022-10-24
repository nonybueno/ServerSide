package sit.int202.exam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class Calculator {
    private double num1;
    private double num2;
    private String operator;

    public double checkOperatorAndResult() {
        if (this.operator.equals("plus")) {
            return num1 + num2;
        } else if (this.operator.equals("minus")) {
            return num1 - num2;
        } else if (this.operator.equals("time")) {
            return num1 * num2;
        } else if (this.operator.equals("divide")) {
            return num1 / num2;
        }
        return Double.NaN;
    }

    public String changeOperatorToRegression() {
        if (this.operator.equals("plus")) {
            return "+";
        } else if (this.operator.equals("minus")) {
            return "-";
        } else if (this.operator.equals("time")) {
            return "*";
        } else if (this.operator.equals("divide")) {
            return "/";
        }
        return "";
    }

}

package Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Calculatormodel {
    private int number1;
    private int number2;

    private String operator;
    public Calculatormodel(int number1, int number2, char operator) {
        this.number1=number1;
        this.number2=number2;
    }
}

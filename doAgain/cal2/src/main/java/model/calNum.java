package model;

public class calNum {
    private int num1;
    private int num2;

    public calNum(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int sum(){
        return this.num1 + this.num2;
    }
}

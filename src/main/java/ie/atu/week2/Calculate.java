package ie.atu.week2;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;

public class Calculate {
    private int add;
    private int sub;
    private double mul;
    private double div;
    public Calculate(int add, int sub, double mul, double div) {
        this.add = add;
        this.sub = sub;
        this.mul = mul;
        this.div = div;
    }

    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        if(b == 0 ){
            return 0;
        }
        else{
            return a/b;
        }
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public double getMul() {
        return mul;
    }

    public void setMul(double mul) {
        this.mul = mul;
    }

    public double getDiv() {
        return div;
    }

    public void setDiv(double div) {
        this.div = div;
    }
}

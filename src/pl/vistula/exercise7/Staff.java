package pl.vistula.exercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staff extends Person implements Salary{
    String education;
    String position;

    double salary;

    public  void  initialize() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        education = br.readLine();
        System.out.println("Enter your position");
        position = br.readLine();

    }
    public void Gudeta568171(){
        Gudeta56817();
        System.out.println("Education :" + education);
        System.out.println("Position :" + position);
    }

    @Override

    public double salaryToPay_Gudeta_56817(double hours, double rate) {
        return hours * rate;
    }
    public double salaryForOvertime_gudeta_56817(double overtimeHours, double rate){
        return Salary.super.salaryForOvertime_Gudeta_56817(overtimeHours,rate);
    }

}

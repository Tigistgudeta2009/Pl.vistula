package pl.vistula.exercise7;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws IOException {
        Staff bb = new Staff();
        //bb.initialize();
        //bb.Gudeta568171();

        double salary = bb.salaryToPay_Gudeta_56817(150, 30);
        System.out.println("The employee received a salary of"+ salary);

        double salaryForOvertime=bb.salaryForOvertime_gudeta_56817(12,30);
        System.out.println("The employees received a salary for overtime in the amount of" + salaryForOvertime);

        int bonus=Salary.bonus_Gudeta_56817(5);
        System.out.println("The employees received a bonus "+ bonus);



    }
}

package pl.vistula.exercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staff extends Person{
    String education;
    String position;

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
}

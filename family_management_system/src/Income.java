import java.util.*;
public class Income {

    private float fatherIncome;
    private float motherIncome;
    private float childIncome;
    private float otherIncome;
//encapsulation
    public float getFatherIncome() {
        return fatherIncome;
    }

    public void setFatherIncome(float y) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter father income");
        y=sc.nextInt();
        fatherIncome = y;
    }

    public float getMotherIncome() {
        return motherIncome;
    }

    public void setMotherIncome(float z) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter mother income");
        z=sc.nextInt();
        motherIncome = z;
    }

    public float getChildIncome() {
        return childIncome;
    }

    public void setChildIncome(float a) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter child income");
        a=sc.nextInt();
        childIncome = a;
    }

    public float getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(float b) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter other source of income");
        b=sc.nextInt();
        otherIncome = b;
    }
    public void calcTotalIncome(float y,float z,float a,float b){
        float Income=y+a+b+z;
        System.out.println("total income is"+Income);
    }
    public void checkFamilyStatus(float Income){
        if(Income<10000)
            System.out.println("you are lower class family");
        else if(Income<=50000)
            System.out.println("you are middle class family");
        else if(Income>50000)
            System.out.println("you are higher class family");
           else
            System.out.println("no balance");//
    }
}

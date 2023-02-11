import java.util.*;

public class Family {

    public String famName;

    protected int famPhoneNumber;

    private String tribe;

    public int famSize;

    public Family(String a, int b, String c, int d) {
        famName=a;
        famPhoneNumber=b;
        tribe=c;
        famSize=d;

    }


    public String getFamName()
    {
        return famName;
    }
    public void setFamName(String a){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your family name");
         a=sc.nextLine();
        famName=a;
    }

    public int getFamPhoneNumber() {
        return famPhoneNumber;
    }
    public void setFamPhoneNumber(int b){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the family's phone number");
        b=sc.nextInt();
        famPhoneNumber=b;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String c){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the familly's tribe");
        c=sc.nextLine();
        tribe=c;
    }

    public int getFamSize() {
        return famSize;
    }

    public void setFamSize(int d)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of your family");
        d=sc.nextInt();
        famSize=d;
    }
}
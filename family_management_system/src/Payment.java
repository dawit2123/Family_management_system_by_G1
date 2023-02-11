import java.util.Scanner;

public class Payment extends Expense{
    private float billOfElectricity;
    private float billOfWater;
    public float amountOfChildSchool;
    public float amountOfHouseRent;

    public Payment(float billOfElectricity, float billOfWater, float amountOfChildSchool, float amountOfHouseRent) {
        super();
        this.billOfElectricity = billOfElectricity;
        this.billOfWater = billOfWater;
        this.amountOfChildSchool = amountOfChildSchool;
        this.amountOfHouseRent = amountOfHouseRent;
    }

    public float getBillOfElectricity() {
        return billOfElectricity;
    }

    public void setBillOfElectricity(float billOfElectricity) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bill of electricity");
        billOfElectricity=sc.nextInt();
        this.billOfElectricity = billOfElectricity;
    }

    public float getBillOfWater() {
        return billOfWater;
    }

    public void setBillOfWater(float billOfWater) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bill of water");
        billOfWater=sc.nextInt();
        this.billOfWater = billOfWater;
    }

    public float getAmountOfChildSchool() {
        return amountOfChildSchool;
    }

    public void setAmountOfChildSchool(float amountOfChildSchool) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount of child school");
        amountOfChildSchool=sc.nextInt();
        this.amountOfChildSchool = amountOfChildSchool;
    }

    public float getAmountOfHouseRent() {
        return amountOfHouseRent;
    }

    public void setAmountOfHouseRent(float amountOfHouseRent) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount of house of rent");
        amountOfHouseRent=sc.nextInt();
        this.amountOfHouseRent = amountOfHouseRent;
    }
    public void calcTotalBill(float billOfElectricity,float billOfWater){
        System.out.println("total bill is: "+(billOfElectricity+billOfWater));;// set return value
    }
    public void calcTotalAmount(float amountOfChildSchool,float amountOfHouseRent){
        System.out.println("total amount is: "+(amountOfChildSchool+amountOfHouseRent));
    }
    //modify class diagram
    public void distributeIncome(){
        System.out.println("the total amount is: "+(amountOfHouseRent+amountOfChildSchool+billOfWater+billOfElectricity));
    }
}

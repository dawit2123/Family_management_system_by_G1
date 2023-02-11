import java.util.Scanner;

public abstract class Need extends Expense{
    public String basicNeed;
    public String additionalWant;

    public Need(String basicNeed, String additionalWant) {
        this.basicNeed = basicNeed;
        this.additionalWant = additionalWant;
    }

    public Need() {

    }

    public String getBasicNeed() {
        return basicNeed;
    }

    public void setBasicNeed(String basicNeed) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic needs");
        basicNeed=sc.nextLine();
        this.basicNeed = basicNeed;
    }

    public String getAdditionalWant() {
        return additionalWant;
    }

    public void setAdditionalWant(String additionalWant) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter additional want");
        additionalWant=sc.nextLine();
        this.additionalWant = additionalWant;
    }

    public void distributeIncome(){
        System.out.println("here the income is distributed for "+basicNeed+"and for "+additionalWant);
    }

    public void prepareVacation(){
        System.out.println("we have two trips this month");
    }
    public  void getBalancedDiet(){
        System.out.println("we have to get balanced diet");
    }

    public void purchaseClothes(){
        System.out.println("the need of the clothes is full filled");
    };//polymorphism

}

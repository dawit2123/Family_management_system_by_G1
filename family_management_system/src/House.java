import java.util.Scanner;

public class House extends Need {
    protected int houseNo;
    protected String typeOfHouse;
    protected float houseBill;

    public House(String basicNeed, String additionalWant, int houseNo, String typeOfHouse, float houseBill) {
        super(basicNeed, additionalWant);
        this.houseNo = houseNo;
        this.typeOfHouse = typeOfHouse;
        this.houseBill = houseBill;
    }

    public House(int houseNo, String typeOfHouse, float houseBill) {
        this.houseNo = houseNo;
        this.typeOfHouse = typeOfHouse;
        this.houseBill = houseBill;
    }

    public House(int houseNo, String typeOfHouse) {
        this.houseNo = houseNo;
        this.typeOfHouse = typeOfHouse;

    }


    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter house number");
       houseNo=sc.nextInt();
        this.houseNo = houseNo;
    }

    public String getTypeOfHouse() {
        return typeOfHouse;
    }

    public void setTypeOfHouse(String typeOfHouse) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter type of house");
        typeOfHouse=sc.nextLine();
        this.typeOfHouse = typeOfHouse;
    }

    public float getHouseBill() {
        return houseBill;
    }

    public void setHouseBill(float houseBill) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your house bill");
        houseBill=sc.nextFloat();
        this.houseBill = houseBill;
    }

    public void payHouseBill(){
        System.out.println("the house bill is paid");
    }

    public void isHouse(int s) {
        //switch
        //private,public,rented
        System.out.println("press 1 for private"+"/n"+"press 2 for public"+"/n"+"press 3 for rented house");
        System.out.println("select your house type");
        Scanner sc=new Scanner(System.in);
         s=sc.nextInt();
        switch (s){
            case 1:
                System.out.println("oh your house is private");
                break;
            case 2:
                System.out.println("your house is public");
                break;
            case 3:
                System.out.println("you rent the house");
                break;
            default:
                System.out.println("you entered invalid number");
        }
    }

    @Override
    public void prepareVacation() {
        System.out.println("we are going to paris");
    }

    @Override
    public void getBalancedDiet() {
        System.out.println("vegetables and meat are eaten this month");
    }
}

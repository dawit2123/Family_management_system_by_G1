import java.util.Scanner;

public class Clothes extends Need {
    private int numOfClothes;
    private float expense;
    protected String brand;
    private float priceOfShoes;

    public Clothes(int numOfClothes, float expense, String brand, float priceOfShoes) {
        this.numOfClothes = numOfClothes;
        this.expense = expense;
        this.brand = brand;
        this.priceOfShoes = priceOfShoes;
    }

    public int getNumOfClothes() {
        return numOfClothes;
    }

    public void setNumOfClothes(int numOfClothes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of clothes");
        numOfClothes = sc.nextInt();
        this.numOfClothes = numOfClothes;
    }

    public float getExpense() {
        return expense;
    }

    public void setExpense(float expense) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the expense for the clothes");
        expense = sc.nextFloat();
        this.expense = expense;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter brand");
        brand = sc.nextLine();
        this.brand = brand;
    }

    public float getPriceOfShoes() {
        return priceOfShoes;
    }

    public void setPriceOfShoes(float priceOfShoes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter price of shoes");
        priceOfShoes = sc.nextFloat();
        this.priceOfShoes = priceOfShoes;
    }

    protected void checkBrand(String brand) {
        if (brand == "nike")

            System.out.println("that's the right choice");

        else
            System.out.println("No matter which you bought");
    }

    public void purchaseNumOfShoes(int x) {
        System.out.println("please enter the number of shoes u wanna buy");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("you have " + x + "shoes");

    }

    public void purchaseClothes() {
        System.out.println("here are the clothes");
    }

    @Override
    public void prepareVacation() {
        System.out.println("ya here we go to addis ababa");
    }

    @Override
    public void getBalancedDiet() {
        System.out.println("we have eaten fruits");
    }
}

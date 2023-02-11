import java.util.Scanner;

public class SavedAmount {
    private float harvestAmount;

    public SavedAmount(float harvestAmount) {
        this.harvestAmount = harvestAmount;
    }

    public float getHarvestAmount() {
        return harvestAmount;
    }

    public void setHarvestAmount(float harvestAmount) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the saved amount from expense ");
        harvestAmount=sc.nextInt();
        this.harvestAmount = harvestAmount;
    }

}

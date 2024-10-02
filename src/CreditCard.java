import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;

    private List<Chopping> choppingList;

    public CreditCard(double limit) {
        this.choppingList = new ArrayList<>();
        this.balance = limit;
        this.limit = limit;
    }

    public boolean launchChop(Chopping chopping){
        if(this.balance > chopping.getCost()){
            this.balance -= chopping.getCost();
            this.choppingList.add(chopping);
            return  true;
        }
        return false;
    }


    public List<Chopping> getChoppingList() {
        return choppingList;
    }

    public double getBalance() {
        return balance;
    }

    public double getLimit() {
        return limit;
    }



}

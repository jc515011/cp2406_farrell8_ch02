import javax.swing.JOptionPane;
public class Eggs
{
    public static void main(String[] args)
    {
        // Declare Variables
        int dozen = 12, totalEggs = 0, dozens = 0, singles = 0;
        double totalPrice = 0, dozenEggsPrice = 3.25, singleEggPrice = 0.45;
        String eggPurchase,strPrice;

        // Display Request
        eggPurchase = JOptionPane.showInputDialog(null,"How many eggs do you wish to buy", "Purchase Meadowdale Dairy Farm Eggs", JOptionPane.INFORMATION_MESSAGE);
        totalEggs = Integer.parseInt(eggPurchase);

        // Calculate eggs
        dozens = totalEggs / dozen;
        singles = (totalEggs % dozen);
        totalPrice = (dozens * dozenEggsPrice) + (singles * singleEggPrice);

        // Format totalPrice to 2 decimal places
        strPrice = String.format("%.2f", totalPrice);

        // Display Prices
        JOptionPane.showMessageDialog(null,"You have ordered " + totalEggs + " Eggs. \n"+
                        "Which is " + dozens + " dozen, at $" + dozenEggsPrice + " per dozen, \n"+
                        "and " + singles + " loose eggs at $" + singleEggPrice + " each, \n"+
                        "giving you a total price of $" + strPrice,
                "Meadowdale Dairy Farm Eggs - Total Price", JOptionPane.PLAIN_MESSAGE);
    }
}
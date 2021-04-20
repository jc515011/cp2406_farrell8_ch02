import javax.swing.JOptionPane;
public class Dollars
{
    public static void main(String[] args)
    {
        // Declare Variables
        int hundreds = 100, fiftys = 50, twentys = 20, tens = 10, fives = 5, dollars = 0, totalDollars = 0;
        int hundredsAmount = 0, fiftysAmount = 0, twentysAmount = 0, tensAmount = 0, fivesAmount = 0;
        String dollarAmount;

        // Display Request
        dollarAmount = JOptionPane.showInputDialog(null,"Enter the amount of currency to convert", "Currency Converter", JOptionPane.INFORMATION_MESSAGE);
        dollars = Integer.parseInt(dollarAmount);

        // Calculate Amounts
        totalDollars = dollars;
        hundredsAmount = dollars / hundreds;
        dollars = dollars - (hundredsAmount*hundreds);
        fiftysAmount = dollars / fiftys;
        dollars = dollars - (fiftysAmount*fiftys);
        twentysAmount = dollars / twentys;
        dollars = dollars - (twentysAmount*twentys);
        tensAmount = dollars / tens;
        dollars = dollars - (tensAmount*tens);
        fivesAmount = dollars / fives;
        dollars = dollars - (fivesAmount*fives);
        // the dollars left are ones

        // Display Currency if correct
        if(totalDollars==(dollars+(fivesAmount*fives)+(tensAmount*tens)+(twentysAmount*twentys)+(fiftysAmount*fiftys)+(hundredsAmount*hundreds)))
        {
            JOptionPane.showMessageDialog(null,"$" + totalDollars + " is " + hundredsAmount + " Hundreds, \n"+
                    fiftysAmount + " Fiftys, " + twentysAmount + " Twentys, \n"+
                    tensAmount + " Tens, " + fivesAmount + " Fives, \n"+
                    dollars + " ones \n", "You entered $" + totalDollars, JOptionPane.PLAIN_MESSAGE);
        }

        // Display Error if my logic has failed
        else{JOptionPane.showMessageDialog(null,"CHECK YOUR CALCULATIONS","LOGIC ERROR", JOptionPane.PLAIN_MESSAGE);}
    }
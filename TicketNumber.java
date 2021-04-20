import javax.swing.JOptionPane;

public class TicketNumber
{
    public static void main(String[] args)
    {
        // Declare Variables
        boolean ticketPass=false;
        int digitLength=6, testDiv=7, testRem=0, checkNumber=0;
        String ticketNumber="", tmpString="";

        // Display Request and check input is 6 digits long
        do {
            ticketNumber = JOptionPane.showInputDialog(null, "Enter the 6 digit ticket number to check", "Ticket Number Checker", JOptionPane.INFORMATION_MESSAGE);
        }while(ticketNumber.length()!=digitLength);

        // Get remainder value and convert in Int
        testRem = Integer.parseInt(String.valueOf(ticketNumber.charAt(ticketNumber.length() - 1)));

        // Get first five values and convert in Int
        for(int i=0;i<ticketNumber.length()-1;i++) {
            tmpString = tmpString + String.valueOf(ticketNumber.charAt(i));
        }
        checkNumber = Integer.parseInt(tmpString);

        // Check ticket
        if((checkNumber % testDiv)==testRem){ticketPass=true;}else{ticketPass=false;}
        if(ticketPass){JOptionPane.showMessageDialog(null," True ","Ticket: " + ticketNumber, JOptionPane.PLAIN_MESSAGE);}
        if(!ticketPass){JOptionPane.showMessageDialog(null," False ","Ticket: " + ticketNumber, JOptionPane.PLAIN_MESSAGE);}
    }
}
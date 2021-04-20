import javax.swing.JOptionPane;
public class MinutesConversion
{
    public static void main(String[] args)
    {
        // Declare Variables
        int minutes = 0, hours = 60, days = 1440, totalMinutes = 0, daysAmount = 0, hoursAmount = 0;
        String minutesAmount;

        // Display Request
        minutesAmount = JOptionPane.showInputDialog(null,"Enter the amount of minutes to convert", "Minutes Converter", JOptionPane.INFORMATION_MESSAGE);
        minutes = Integer.parseInt(minutesAmount);

        // Calculate Minutes
        totalMinutes = minutes;
        daysAmount = minutes/days;
        minutes = minutes - (daysAmount*days);
        hoursAmount = minutes/hours;
        minutes = minutes - (hoursAmount*hours);
        // single minutes are left

        // Display Minutes if correct
        if(totalMinutes==(minutes+(hoursAmount*hours)+(daysAmount*days)))
        {
            JOptionPane.showMessageDialog(null, totalMinutes + " is equal to \n"+
                    daysAmount + " Days, \n"+
                    hoursAmount + " Hours, \n"+
                    " and " + minutes + " minutes. \n", "Minutes Converter", JOptionPane.PLAIN_MESSAGE);
        }

        // Display Error if my logic has failed
        else{JOptionPane.showMessageDialog(null,"CHECK YOUR CALCULATIONS","LOGIC ERROR", JOptionPane.PLAIN_MESSAGE);}
    }
}
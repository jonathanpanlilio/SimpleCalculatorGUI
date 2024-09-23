import javax.swing.JOptionPane;

public class CalculatorGUI {
    public static void main(String[] args) {
        // Scanner userInput = new Scanner (System.in);
        int userChoice;
        double firstNumber;
        double secondNumber;
        double results;
do {
    JOptionPane.showMessageDialog(null, "Choose an operator 1 - 4");
        userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division"));

if (userChoice <= 0 || userChoice > 4) {
    JOptionPane.showMessageDialog(null, "Error!");
} else {

        firstNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your first number: "));
        secondNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your second number: "));


        switch (userChoice) {
            case 1:
            results = firstNumber + secondNumber;
            JOptionPane.showMessageDialog(null, firstNumber + " + " + secondNumber + " = " + results);
            break;
            case 2:
            results = firstNumber - secondNumber;
            JOptionPane.showMessageDialog(null, firstNumber + " - " + secondNumber + " = " + results);
            break;
            case 3:
            results = firstNumber * secondNumber;
            JOptionPane.showMessageDialog(null, firstNumber + " • " + secondNumber + " = " + results);
            break;
            case 4:
            if (secondNumber!= 0)

            {results = firstNumber / secondNumber;
                JOptionPane.showMessageDialog(null, firstNumber + " ÷ " + secondNumber + " = " + results);}
        else {
            JOptionPane.showMessageDialog(null, "Error: you cant divide by zero");
            }
        }
        }
}
    while (userChoice !=5);
}    
}


//Step 1. Provide a menu of options for user
//Step 2. Ask user what opertion they want to do
//Step 3. Ask user for the first number
//Step 4. Ask user for the second number
//Step 5. Output the results depending on the user input

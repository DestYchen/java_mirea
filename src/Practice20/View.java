package Practice20;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class View {
    private JFrame frame;
    private JTextField display;
    private JButton[] numberButtons;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton equalsButton;
    public View() {
        frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        display = new JTextField();
        display.setEditable(false);
        display.setSize(150, 150);
        frame.add(display, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        numberButtons = new JButton[10];
        numberButtons[0] = new JButton(String.valueOf(0));
        numberButtons[1] = new JButton(String.valueOf(1));
        numberButtons[2] = new JButton(String.valueOf(2));
        numberButtons[3] = new JButton(String.valueOf(3));
        numberButtons[4] = new JButton(String.valueOf(4));
        numberButtons[5] = new JButton(String.valueOf(5));
        numberButtons[6] = new JButton(String.valueOf(6));
        numberButtons[7] = new JButton(String.valueOf(7));
        numberButtons[8] = new JButton(String.valueOf(8));
        numberButtons[9] = new JButton(String.valueOf(9));
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(divideButton);
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(equalsButton);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    public void addNumberButtonListener(ActionListener listener) {
        for (int i = 1; i < 10; i++) {
            numberButtons[i].addActionListener(listener);
        }
        numberButtons[0].addActionListener(listener);
    }
    public void addOperatorButtonListeners(ActionListener listener) {
        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);
        equalsButton.addActionListener(listener);
    }
    public void updateDisplay(String text) {
        display.setText(text);
    }
}

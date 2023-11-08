package Practice20;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;
public class Controller {
    private Model model;
    private View view;
    private String currentInput;
    private ArrayList<String> lst;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        currentInput = "";
        this.lst = new ArrayList<String>();
        String[] str = new String[4];

        view.addNumberButtonListener(new NumberButtonListener());
        view.addOperatorButtonListeners(new OperatorButtonListener());
    }

    class NumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            currentInput += button.getText();
            System.out.println(currentInput);
            lst.add(button.getText());
            view.updateDisplay(currentInput);
        }
    }
    class OperatorButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            currentInput += button.getText();
            System.out.println(currentInput);
            lst.add(button.getText());
            view.updateDisplay(currentInput);
            if(lst.get(lst.size()-1) == "=") {
                lst.remove("=");
                Model str = new Model();
                int result = str.stacky(lst);
                view.updateDisplay(String.valueOf(result));
            }
        }
    }
}

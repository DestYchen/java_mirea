package Practice8;
import java.awt.*;
import javax.swing.*;
class Figures extends JFrame{
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;

    // Init
    Figures() {
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        random_shapes_paint(50, g);
    }
    void random_shapes_paint(int shapes, Graphics2D g) {
        for (int i = 0; i < shapes; i++) {
            int choice = (int) (Math.random() * 7);

            switch (choice) {
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;
                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;
                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawLine(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * WINDOW_HEIGHT)
                    );
                    break;
                case 4:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawArc(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 360),
                            (int) (Math.random() * 360)
                    );
                    break;
                case 5:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRoundRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;
                case 6:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            100,
                            100
                    );
                    break;
                default:
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Figures app = new Figures();
    }
}

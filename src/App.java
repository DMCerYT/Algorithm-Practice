import java.awt.*;
import javax.swing.*;

public class App {
    // GUI global variables
    private static JPanel mainPanel;
    private static JFrame mainFrame;

    public static void main(String[] args) {
        mainFrame = new JFrame();
        mainPanel = new JPanel();

        /**
         * Remember how a Border Layout is structured!
         * Element 1 (PAGE_START) is on TOP
         * Element 2 (CENTER) is in the CENTER
         * Element 3 (LINE_START) is on the LEFT
         * Element 4 (PAGE_END) is on the BOTTOM
         * Element 5 (LINE_END) is on the RIGHT
         */
        mainPanel.setLayout(new BorderLayout());

        // Element 1, contains the dropdown to select an algorithm
        JPanel elementOne = new JPanel();
        String[] algorithms = new String[]{"Select Algorithm", "Arrays", "ArrayList", "LinkedList", "Binary Search Tree", "AVLs", "F"};
        JComboBox<String> dropdownMenu = new JComboBox<>(algorithms);
        elementOne.add(dropdownMenu);

        mainPanel.add(elementOne, BorderLayout.NORTH);

        // Element 3, contains information regarding the algorithm including but not limited to factoids
        JPanel elementThree = new JPanel();

        mainPanel.add(elementThree, BorderLayout.WEST);

        // Element 2, contains the visualizer
        JPanel elementTwo = new JPanel();

        mainPanel.add(elementTwo, BorderLayout.CENTER);

        // Finish configuring the panel onto the frame
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(mainPanel);
        mainFrame.pack();

        // Render the application
        mainFrame.setMinimumSize(new Dimension(800, 600));
        mainFrame.setSize(1024, 768);
        mainFrame.setVisible(true);
    }
}

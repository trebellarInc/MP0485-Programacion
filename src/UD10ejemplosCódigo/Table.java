package UD10ejemplosCódigo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Table {
    /*
    public static void main(String[] args) {
        JTable resolutionsTable = new JTable(); // instances of both JTable and JPanel
        JPanel displaySettings = new JPanel();

        JFrame frame = new JFrame("Display Settings");

        // you can set the above component with diff attributes
        frame.setContentPane(displaySettings);
// and use them further

        String[] columns = {"Resolution Size"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        resolutionsTable.setModel(model);

        //frame.setContentPane(new DisplaySettings().displaySettings);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        resolutionsTable.setModel(model);
    }
*/
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JTable Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = createTable();
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static JTable createTable()
    {
        String[] columnNames = {"First Name", "Last Name"};
        Object[][] data = {{"Kathy", "Smith"},{"John", "Doe"}};
        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);

        return table;
    }
}

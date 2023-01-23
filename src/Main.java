import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // made a change with intellij on 1/23
      // made a change on repl.it 1/23
        ArrayList<Student> students = new ArrayList<Student>();

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JTextField firstField = new JTextField(50);
        JTextField lastField = new JTextField(20);
        JTextField yearField = new JTextField(10);

        JTextArea area = new JTextArea(50,50);

        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student s = new Student(firstField.getText(), lastField.getText(), Integer.parseInt(yearField.getText()));
                students.add(s);
            }
        });
        JButton seeButton = new JButton("View");
        seeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String receipt = "";
                for(Student stu: students){
                    receipt += stu +"\n";
                }
                area.setText(receipt);
            }
        });

        JButton delete = new JButton(("delete"));
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText("");
            }
        });

        panel.add(firstField);
        panel.add(lastField);
        panel.add(yearField);
        panel.add(submit);
        panel.add(seeButton);
        panel.add(area);
        panel.add(delete);

        frame.add(panel);

        frame.pack();

        frame.setVisible(true);


    }

}

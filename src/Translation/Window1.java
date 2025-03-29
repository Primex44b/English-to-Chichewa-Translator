package Translation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Window1 extends JFrame implements ActionListener {


    TextField field1 = new TextField();
    TextField field2 = new TextField();
    JButton button = new JButton("Translate");
    Font font  = new Font("Roadway",Font.BOLD,25);
    Font font2  = new Font("Roadway",Font.BOLD,15);
    JLabel label1 = new JLabel("ENGLISH TO CHICHEWA TRANSLATOR");
    String word1 = "Education";
    String word2 = "Importance";
    String word3 = "Understanding";
    String current;
    ImageIcon icon = new ImageIcon("C:/Users/ELIYA PHIRI/IdeaProjects/Translator/src/Translation/translation_6988547 (1).png");
    public static void main (String[]args){

        Welcome welcome = new Welcome();

    }


    Window1 (){

        label1.setBounds(40,0,500,100);
        label1.setFont(new Font("MV Boli",Font.BOLD,25));
        label1.setForeground(new Color(82, 186, 241));

        field1.setBounds(0,100,600,50);
        field1.setFont(font);
        field1.setForeground(new Color(0, 0, 0));
        field1.setBackground(new Color(116, 54, 221));

        field2.setBounds(0,220,600,40);
        field2.setFont(font);
        field2.setForeground(Color.GREEN);
        field2.setBackground(new Color(43, 67, 59));
        field2.setEditable(false);

        button.setBounds(195,160,185,50);
        button.setFocusable(false);
        button.setBackground(new Color(0, 0, 0));
        button.setForeground(new Color(76, 151, 237));
        button.setFont(font);
        button.addActionListener(this);

        this.setSize(600,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("English to Chichewa Translator");
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(1, 7, 46));
        this.setLocationRelativeTo(null);
        this.setIconImage(icon.getImage());
        this.add(label1);
        this.add(field1);
        this.add(field2);
        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button){

            current = field1.getText();
            if (Objects.equals(current, word1)){
                field2.setEditable(true);
                field2.setText("Maphunziro");
                field2.setEditable(false);
            } else if (Objects.equals(current, word2)) {
                field2.setEditable(true);
                field2.setText("Ubwino");
                field2.setEditable(false);
            } else if (Objects.equals(current, word3)) {
                field2.setEditable(true);
                field2.setText("Kumvetsetsa");
                field2.setEditable(false);
            }else {
                field2.setEditable(true);
                field2.setText("We are currently unable to translate that");
                field2.setEditable(false);
            }
    }

    }
}

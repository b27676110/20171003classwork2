import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;


public class MainJFrame extends JFrame{
    private Container cp;
    private JButton jbtn1 = new JButton("Example");
    private JButton jbtn2 = new JButton("Encrypt");
    private JLabel jlb1 = new JLabel("key");
    private JTextField jtf = new JTextField("1");
    private JButton jbtn3 = new JButton("Clear");
    private JButton jbtn4 = new JButton("Exit");
    private JTextArea jtaL = new JTextArea();
    private JTextArea jtaR = new JTextArea();
    private JScrollPane jspL = new JScrollPane(jtaL);
    private JScrollPane jspR = new JScrollPane(jtaR);


    private JPanel jpl = new JPanel(new GridLayout(6,1,3,3));
    public MainJFrame(){
        initcomp();
    }
    private void initcomp(){
        this.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        jtaL.setPreferredSize(new Dimension(200,500));
        jtaR.setPreferredSize(new Dimension(200,500));
        jlb1.setHorizontalAlignment(JLabel.CENTER);
        jpl.add(jbtn1);
        jpl.add(jbtn2);
        jpl.add(jlb1);
        jpl.add(jtf);
        jpl.add(jbtn3);
        jpl.add(jbtn4);
        cp.add(jpl,BorderLayout.CENTER);
        cp.add(jspL,BorderLayout.WEST);
        cp.add(jspR,BorderLayout.EAST);
        jtaL.setLineWrap(true);
        jtaR.setLineWrap(true);


        jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaL.setText("Looking for the meanings of words, " +
                        "phrases, and expressions? We provide hundreds" +
                        " of thousands of definitions, synonyms, antonyms" +
                        ", and pronunciations for English and " +
                        "other languages, derived from our language " +
                        "research and expert analysis. ");

            }
        });
        jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char [] cha = jtaL.getText().toCharArray();
                int num = cha.length;
                int n = Integer.parseInt(jtf.getText());
                for(int i = 0;i<num;i++){
                    cha[i] += n;
                }
                jtaR.setText(new String(cha));

            }
        });
        jbtn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaL.setText("");
                jtaR.setText("");
            }
        });
        jbtn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



    }
}
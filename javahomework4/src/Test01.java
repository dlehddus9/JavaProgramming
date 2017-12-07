
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Calculator extends JFrame{

    final int MAX_INPUT_LENGTH = 20;
    final int INPUT_MODE = 0;
    final int RESULT_MODE = 1;
    final int ERROR_MODE = 2;
    int displayMode;

    boolean clearOnNextDigit, percent;
    double lastNumber;
    String lastOperator;

    private JLabel textOutput;
    private JButton jbnButtons[];
    private JPanel jplMaster, jplBackSpace, jplControl;

    //Font f12 = new Font("Times New Roman", 0, 22);

    public Calculator()
    {


        //setBackground(Color.blue);

        jplMaster = new JPanel();


        textOutput = new JLabel("0");
        textOutput.setHorizontalTextPosition(JLabel.LEFT);
        textOutput.setBackground(Color.WHITE);
        //textOutput.setMinimumSize(new Dimension(100, 40));
        //textOutput.setPreferredSize(new Dimension(100, 40));
        //textOutput.setMaximumSize(new Dimension(600, 600));
        textOutput.setFont(new Font("Serif", Font.ROMAN_BASELINE, 25));
        textOutput.setOpaque(true);


        getContentPane().add(textOutput, BorderLayout.NORTH);

        jbnButtons = new JButton[23];

        JPanel jplButtons = new JPanel();


        for (int i=0; i<=9; i++)
        {
            jbnButtons[i] = new JButton(String.valueOf(i));
        }

        jbnButtons[10] = new JButton("+/-");
        jbnButtons[11] = new JButton(".");
        jbnButtons[12] = new JButton("=");
        jbnButtons[13] = new JButton("/");
        jbnButtons[14] = new JButton("*");
        jbnButtons[15] = new JButton("-");
        jbnButtons[16] = new JButton("+");
        jbnButtons[17] = new JButton("sqrt");
        jbnButtons[18] = new JButton("1/x");
        jbnButtons[19] = new JButton("%");

        jplBackSpace = new JPanel();
        jplBackSpace.setLayout(new GridLayout(1, 1, 2, 2));

        jbnButtons[20] = new JButton("Backspace");
        jplBackSpace.add(jbnButtons[20]);

        jplControl = new JPanel();
        jplControl.setLayout(new GridLayout(1, 2, 2 ,2));

        jbnButtons[21] = new JButton(" CE ");
        jbnButtons[22] = new JButton("C");

        jplControl.add(jbnButtons[21]);
        jplControl.add(jbnButtons[22]);


        for (int i=0; i<jbnButtons.length; i++)	{
            //jbnButtons[i].setFont(f12);

            if (i<10)
                jbnButtons[i].setForeground(Color.black);

            else
                jbnButtons[i].setForeground(Color.GRAY);
        }


        jplButtons.setLayout(new GridLayout(4, 5, 2, 2));


        for(int i=7; i<=9; i++)		{
            jplButtons.add(jbnButtons[i]);
        }

        jplButtons.add(jbnButtons[13]);
        jplButtons.add(jbnButtons[17]);


        for(int i=4; i<=6; i++)
        {
            jplButtons.add(jbnButtons[i]);
        }


        jplButtons.add(jbnButtons[14]);
        jplButtons.add(jbnButtons[18]);

        for( int i=1; i<=3; i++)
        {
            jplButtons.add(jbnButtons[i]);
        }


        jplButtons.add(jbnButtons[15]);
        jplButtons.add(jbnButtons[19]);


        jplButtons.add(jbnButtons[0]);
        jplButtons.add(jbnButtons[10]);
        jplButtons.add(jbnButtons[11]);
        jplButtons.add(jbnButtons[16]);
        jplButtons.add(jbnButtons[12]);

        jplMaster.setLayout(new BorderLayout());
        jplMaster.add(jplBackSpace, BorderLayout.WEST);
        jplMaster.add(jplControl, BorderLayout.EAST);
        jplMaster.add(jplButtons, BorderLayout.SOUTH);

        getContentPane().add(jplMaster, BorderLayout.SOUTH);
        requestFocus();




        addWindowListener(new WindowAdapter() {

                              public void windowClosed(WindowEvent e)
                              {
                                  System.exit(0);
                              }
                          }
        );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String args[]) {
        Calculator cal = new Calculator();
        Container contentPane = cal.getContentPane();
        cal.setTitle("계산기");
        cal.setSize(600, 600);
        cal.pack();
        cal.setLocation(600, 600);
        cal.setVisible(true);
        cal.setResizable(false);
    }

}


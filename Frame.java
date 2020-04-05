/**
 * Author: Tiberiu Paharnicu tp371
 * Version:1.3
 * Modified:05/04/2020 Time 15:43
 */

/**
 * Improvements:- break into lambdas if possible
 *              - divide in different classes if possible
 */

//TODO finish the random selector algorithm


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.List;

public class Frame extends JFrame implements ActionListener {

    /**
     */
    private static final long serialVersionUID = 1L;

    JFrame window = new JFrame("Chasing-bombs-tp371");
    

    // panels
    JPanel panel_01 = new JPanel();
    JPanel panel_02 = new JPanel();
    JPanel panel_03 = new JPanel();

    JPanel panel_inside_02 = new JPanel();
    JPanel panel_inside_03 = new JPanel();

    // button
    JButton click = new JButton();

    

    // buttons second panel
    JButton gameStart = new JButton("Play A Game");
    JButton exit = new JButton("Exit");

    // buttons third panel for difficulty
    JButton easy = new JButton("Easy");
    JButton medium = new JButton("Medium");
    JButton hard = new JButton("Hard");

    //Random Variable
     /** 
    *Use this variable to change difficulty of the game.
    *Depending on the variable number chose it will change the number of mines being hidden
    in the cells therefore causing a change of difficulty.
     */
    int changeableValue = 3;
    Random rand = new Random();    
        

    public Frame(){
       
        JButton[] buttons = new JButton[10];
        String btn[] ={"1","2","3","4","5","6","7","8","9","10"};
        
        window.setLayout(new GridLayout(0,3));
        panel_02.setBackground(Color.GRAY);
        panel_03.setBackground(Color.LIGHT_GRAY);

        
        //button settings
        panel_01.setLayout(new GridLayout(2,5));
        
        for(int i = 0 ; i < buttons.length; i++){
            buttons[i] = new JButton(btn[i]);
            buttons[i].setBackground(Color.BLACK);
            buttons[i].setForeground(Color.BLACK);
            buttons[i].addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button is pressed");

                }
                
            });
            panel_01.add(buttons[i]);
        }
        
        //randomiser
        for(int i = 0; i < changeableValue ; i++){
            int random = (int) (Math.random() * 10);
            System.out.println("Random number selected is: " + buttons[random]);
        }

        
        panel_02.add(panel_inside_02);
        panel_inside_02.setLayout(new GridLayout(2,1));
        panel_inside_02.add(gameStart);
        gameStart.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("This is game start button");
            }
        }
        );
        panel_inside_02.add(exit);
        exit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("This is exit button");
            }
        }
        );


        panel_03.add(panel_inside_03);
        panel_inside_03.setLayout(new GridLayout(3,1));

        panel_inside_03.add(easy);
        easy.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                changeableValue = 5;
                System.out.println("Value of random bombs is " + changeableValue);
            }
        }
        );

        panel_inside_03.add(medium);
        medium.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                changeableValue = 7;
                System.out.println("Value of random bombs is " + changeableValue);
            }
        }
        );
        
        panel_inside_03.add(hard);
        hard.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                changeableValue = 9;
                System.out.println("Value of random bombs is " + changeableValue);
            }
        }
        );

        window.add(panel_01,BorderLayout.WEST);
        window.add(panel_02,BorderLayout.CENTER);
        window.add(panel_03,BorderLayout.EAST);

        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }


    
    public static void main(String[] args){
        Frame game = new Frame();
    }


}


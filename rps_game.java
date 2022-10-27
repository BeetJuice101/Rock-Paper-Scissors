//Made By BeetJuice101

import java.awt.Color;
import java.awt.event.*;  
import javax.swing.*;  
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class rps_game extends JPanel {
    protected static JButton rock, paper, scissors, new_game;
    protected static JLabel text, win, lose, tie;

    public static void primary() {
        rock = new JButton("<html><span style='font-size:20px;color:white;'>Rock</span></html>");
        paper = new JButton("<html><span style='font-size:20px;color:white;'>Paper</span></html>");
        scissors = new JButton("<html><span style='font-size:20px;color:white;'>Scissors</span></html>");
        text = new JLabel("<html><span style='font-size:35px;'>Rock Paper Scissors</span></html>");
        JFrame frame = new JFrame("Rock Paper Scissors Game");
        rock.setBounds(150, 120, 300, 60);
        paper.setBounds(150, 200, 300, 60);
        scissors.setBounds(150, 280, 300, 60);
        text.setBounds(70,20,500,60);
        rock.setBackground(Color.black);
        rock.setOpaque(true);
        paper.setBackground(Color.black);
        paper.setOpaque(true);
        scissors.setBackground(Color.black);
        scissors.setOpaque(true);
        win = new JLabel("<html><span style='font-size:35px;color:black;'>You Won</span></html>");
        lose = new JLabel("<html><span style='font-size:35px;color:black;'>You Lost</span></html>");
        tie = new JLabel("<html><span style='font-size:35px;color:black;'>You Tied</span></html>");
        win.setBounds(200, 200, 200, 60);
        lose.setBounds(200, 200, 200, 60);
        tie.setBounds(200, 200, 200, 60);
        new_game = new JButton("<html><span style='color:white;'>New Game</span></html>");
        new_game.setVisible(false);
        new_game.setBounds(510, 0,75, 15);
        new_game.setBackground(Color.black);
        new_game.setOpaque(true);
        win.setVisible(false);
        lose.setVisible(false);
        tie.setVisible(false);
        frame.add(rock);
        frame.add(paper);
        frame.add(scissors);
        frame.add(text);
        frame.add(win);
        frame.add(lose);
        frame.add(tie);
        frame.add(new_game);
        frame.setLayout(null);
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rock.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                //Rock Function
                List<Integer> options = new ArrayList<>();
                options.add(1); //1 = Rock
                options.add(2); // 2 = Paper
                options.add(3); // 3 = Scissors
                rock.setVisible(false);
                paper.setVisible(false);
                scissors.setVisible(false);
                Random rand = new Random();
                int selection = options.get(rand.nextInt(options.size()));
                if (selection == 1) {
                    tie.setVisible(true);
                    new_game.setVisible(true);
                }
                if (selection == 2) {
                    lose.setVisible(true);
                    new_game.setVisible(true);
                }
                if (selection == 3) {
                    win.setVisible(true);
                    new_game.setVisible(true);
                }
            }  
        });
        paper.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Paper Function
                List<Integer> options = new ArrayList<>();
                options.add(1); //1 = Rock
                options.add(2); // 2 = Paper
                options.add(3); // 3 = Scissors
                rock.setVisible(false);
                paper.setVisible(false);
                scissors.setVisible(false);
                Random rand = new Random();
                int selection = options.get(rand.nextInt(options.size()));
                if (selection == 1) {
                    win.setVisible(true);
                    new_game.setVisible(true);
                }
                if (selection == 2) {
                    tie.setVisible(true);
                    new_game.setVisible(true);
                }
                if (selection == 3) {
                    lose.setVisible(true);
                    new_game.setVisible(true);
                }
            }
        });
        scissors.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Scissors Function
                List<Integer> options = new ArrayList<>();
                options.add(1); //1 = Rock
                options.add(2); // 2 = Paper
                options.add(3); // 3 = Scissors
                rock.setVisible(false);
                paper.setVisible(false);
                scissors.setVisible(false);
                Random rand = new Random();
                int selection = options.get(rand.nextInt(options.size()));
                if (selection == 1) {
                    lose.setVisible(true);
                    new_game.setVisible(true);
                }
                if (selection == 2) {
                    win.setVisible(true);
                    new_game.setVisible(true);
                }
                if (selection == 3) {
                    tie.setVisible(true);
                    new_game.setVisible(true);
                }
            }
        });
        new_game.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                new_game.setVisible(false);
                win.setVisible(false);
                lose.setVisible(false);
                tie.setVisible(false);
                rock.setVisible(true);
                paper.setVisible(true);
                scissors.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                primary(); 
            }
        });
    }
}
    
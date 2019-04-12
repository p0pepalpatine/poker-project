/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

public class Driver extends JFrame {

    Deck deck;
    Player p1;
    Player p2;
    Player board;

    int pairs1 = 0;
    int flsh1 = 0;

    int pairs2 = 0;
    int flsh2 = 0;
    

	static JMenu holdEmMenu;
	static JMenu historyMenu;

    Driver() {

        setTitle(" Poker Program");
        // setLayout(new BorderLayout());
        setSize(1200, 900);
        setLocationRelativeTo(null);
        

		//Adding the history tab and main tab
		JMenuBar mb = new JMenuBar();
			holdEmMenu = new JMenu("Hold Em");
			historyMenu = new JMenu("History");
			mb.add(holdEmMenu);
			mb.add(historyMenu);
			
			setJMenuBar(mb);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel t = new JPanel();
        JLabel tab = new JLabel();
        JPanel top = new JPanel();
        JPanel buttonPan = new JPanel();
        buttonPan.setLocation(500, 800);

        ImageIcon topImg = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\table.jpg").getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT));
            tab.setIcon(topImg);
        //    tab.setLocation(400, 700);
       // tab.setIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\table.jpg"));
        //tab.setLocation(400, 600);
        top.add(buttonPan);
      //  top.setSize(500,500);
        top.setLocation(0,700);
       top.add(tab);
        add(top);

        JButton deal = new JButton("Deal");
        buttonPan.add(deal);

        JButton exit = new JButton("EXIT");
        buttonPan.add(exit);

        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\AceSpades.jpg"); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(60, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
imageIcon = new ImageIcon(newimg);
        
        //JLabel p1Card1 = new JLabel(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\AceSpades.jpg"));
        JLabel p1Card1 = new JLabel();
        //p1Card1.setSize(25, 25);
       // p1Card1.setMaximumSize(new Dimension(25, 25));
       
       
       /////////////////////////////////////Player 1 card and name Panels///////////////////////
       JPanel cPan = new JPanel();
       cPan.setSize(150, 175);
       cPan.setLocation(500, 600);
       cPan.add(p1Card1);
       
       JPanel p1Pan = new JPanel();
       p1Pan.setSize(100, 100);
       p1Pan.setLocation(525, 720);
       JLabel player1Label = new JLabel("Player 1");
       p1Pan.add(player1Label);
        add(p1Pan);
       /////////////////////////////////////end Player 1 stuff///////////////////////////////////
       
       /////////////////////////////////////Player 2 card and name Panels///////////////////////
       
       JLabel p2Card1 = new JLabel();
       JLabel p2Card2 = new JLabel();
       JPanel cPan2 = new JPanel();
       cPan2.setSize(150, 175);
       cPan2.setLocation(500, 100);
       cPan2.add(p2Card1);
       cPan2.add(p2Card2);
       
       JPanel p2Pan = new JPanel();
       p2Pan.setSize(150, 120);
       p2Pan.setLocation(525, 120);
       JLabel player2Label = new JLabel("Player 2");
       
       p2Pan.add(p2Card1);
       p2Pan.add(p2Card2);
       p2Pan.add(player2Label);
        add(p2Pan);
       /////////////////////////////////////end Player 2 stuff///////////////////////////////////
       
       
       

       /////////////////////////////Board cards and label stuff////////////////////////////////
       JPanel boardPan = new JPanel();
       boardPan.setSize(300, 175);
       boardPan.setLocation(500, 350);
       //boardPan.add(p1Card1);
       
       JLabel board1 = new JLabel();
       JLabel board2 = new JLabel();
       JLabel board3 = new JLabel();
       JLabel board4 = new JLabel();
       JLabel board5 = new JLabel();
       
       JPanel boardNamePan = new JPanel();
       boardNamePan.setSize(400, 125);
       boardNamePan.setLocation(375, 350);
       JLabel boardLabel = new JLabel("Community Cards");
       
       boardNamePan.add(board1);
       boardNamePan.add(board2);
       boardNamePan.add(board3);
       boardNamePan.add(board4);
       boardNamePan.add(board5);
       boardNamePan.add(boardLabel);
        add(boardNamePan);
        ////////////////////////////////////////////////////////////////////////////////////////


JLabel p1Card2 = new JLabel();
//ImageIcon im = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\" + "10D" + ".jpg").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
//p1Card2.setIcon(im);
        //p1Card1.setSize(25, 25);
       // p1Card1.setMaximumSize(new Dimension(25, 25));
      // buttonPan.add(p1Card2);
       cPan.add(p1Card2);
       
      // cPan.setLocation(NORTH);
        add(cPan);
        //buttonPan.add(cPan);
        //buttonPan.add(p1Card1);
        

        //ActionListener to deal new hand button in clicked
        deal.addActionListener((ActionEvent e) -> {

            try {
                deck = Deck.newShuffledDeck();

                p1 = new Player("p1");
                p2 = new Player("p2");
                board = new Player("board");

                p1.addCard(deck.getDeckCards());
                p2.addCard(deck.getDeckCards());
                p1.addCard(deck.getDeckCards());
                p2.addCard(deck.getDeckCards());

                ImageIcon im = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\" + p1.getCards().get(0) + ".jpg").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
            p1Card1.setIcon(im);
            
            ImageIcon im2 = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\" + p1.getCards().get(1) + ".jpg").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
            p1Card2.setIcon(im2);
            
            im2 = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\" + p2.getCards().get(0) + ".jpg").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
            p2Card1.setIcon(im2);
            
            im2 = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\" + p2.getCards().get(1) + ".jpg").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
            p2Card2.setIcon(im2);
            
                //Burn card
                System.out.println("Flop Burn card (Just for show): " + deck.getDeckCards().pop());

                //FLOP
                board.addCard(deck.getDeckCards());
                board.addCard(deck.getDeckCards());
                board.addCard(deck.getDeckCards());

                //Burn card
                System.out.println("Turn Burn card (Just for show): " + deck.getDeckCards().pop());

                //TURN
                board.addCard(deck.getDeckCards());

                //Burn card
                System.out.println("River Burn card (Just for show): " + deck.getDeckCards().pop());

                //RIVER
                board.addCard(deck.getDeckCards());
                
                ImageIcon boardImg1 = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\" + board.getCards().get(0) + ".jpg").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
            board1.setIcon(boardImg1);
            boardImg1 = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\" + board.getCards().get(1) + ".jpg").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
            board2.setIcon(boardImg1);
            boardImg1 = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\" + board.getCards().get(2) + ".jpg").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
            board3.setIcon(boardImg1);
            boardImg1 = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\" + board.getCards().get(3) + ".jpg").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
            board4.setIcon(boardImg1);
            boardImg1 = new ImageIcon(new ImageIcon("C:\\Users\\rob\\Desktop\\NetBeansProjects\\Poker2\\" + board.getCards().get(4) + ".jpg").getImage().getScaledInstance(60, 80, Image.SCALE_DEFAULT));
            board5.setIcon(boardImg1);

                System.out.println("Player 1: " + p1.getCards());
                System.out.println("Player 2: " + p2.getCards());
                System.out.println("Board/community: " + board.getCards());

                
                
                p1PairCheck(p1, board);
                
             //   System.out.println(board.getCards() + "ddeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
                //Thread.sleep(1000);
                p2PairCheck(p2, board);
             //   System.out.println(board.getCards() + "ccccccccccccccccccccccccccccccc");
                p1StraightCheck(p1, board);
              //  System.out.println(board.getCards()+ "bbbbbbbbbbbbbbbbbbbbbbbbb");
                p2StraightCheck(p2, board);
            //    System.out.println(board.getCards() + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                System.out.println("P1");
                flushCheck(p1, board);
                System.out.println("P2");
                flushCheck(p2, board);
                
                /**

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (p1.getCards().get(0).getRank() == p1.getCards().get(1).getRank()) {
                    System.out.println(p1.getName() + " has a pocket pair");
                    pairs1++;
                }

                for (int i = 0; i < 5; i++) {
                    if (p1.getCards().get(0).getRank() == board.getCards().get(i).getRank()) {
                        pairs1++;
                    }
                }

                switch (pairs1) {
                    case 0:
                        return;

                    case 1:
                        System.out.println("P1 has a pair of " + p1.getCards().get(0).getRank());

                    case 2:
                        System.out.println("P1 has a three of a kind with three " + p1.getCards().get(0).getRank());

                    case 3:
                        System.out.println("P1 has a four of a kind with four " + p1.getCards().get(0).getRank());
                }
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 *  */
                         System.out.println("The winner is...    We Don't Know Yet!!!\n\n\n");

            } catch (Exception p) {
                JOptionPane.showMessageDialog(this, "?????????????????????");
            }
        });

        t.add(top);
        add(t);

        setVisible(true);

    }

    private static void p1PairCheck(Player p, Player b) {

        int pairs = 0;
        int y = 2;
        //boolean pock = false;

        if (p.getCards().get(0).getRank().getRankValue() == p.getCards().get(1).getRank().getRankValue()) {
            System.out.println(p.getName() + " has a pocket pair");
           // pairs++;
         //   y = 1;
        }

       // for (int k = 0; k < y; k++) {
            for (int i = 0; i < 5; i++) {
                if (p.getCards().get(0).getRank().getRankValue() == b.getCards().get(i).getRank().getRankValue()) {
                    pairs++;
                }
            }
           // for (int i = 0; i < 5; i++) {
           //     if (p.getCards().get(1).getRank().getRankValue() == b.getCards().get(i).getRank().getRankValue()) {
          //          pairs++;
           //     }
          //  }
        //}

        switch (pairs) {
            case 0:
                break;

            case 1:
                System.out.println(p.getName() + " has a pair of " + p.getCards().get(0).getRank());

                break;
            case 2:
                System.out.println(p.getName() + " has a three of a kind with three " + p.getCards().get(0).getRank());
                break;
            case 3:
                System.out.println(p.getName() + " has a four of a kind with four " + p.getCards().get(0).getRank());
                break;
        }
    }
    
    private static void p2PairCheck(Player p, Player b) {

        int pairs = 0;
        int y = 2;
        //boolean pock = false;

        if (p.getCards().get(0).getRank().getRankValue() == p.getCards().get(1).getRank().getRankValue()) {
            System.out.println(p.getName() + " has a pocket pair");
           // pairs++;
         //   y = 1;
        }

       // for (int k = 0; k < y; k++) {
            for (int i = 0; i < 5; i++) {
                if (p.getCards().get(0).getRank().getRankValue() == b.getCards().get(i).getRank().getRankValue()) {
                    pairs++;
                }
            }
           // for (int i = 0; i < 5; i++) {
           //     if (p.getCards().get(1).getRank().getRankValue() == b.getCards().get(i).getRank().getRankValue()) {
          //          pairs++;
           //     }
          //  }
        //}

        switch (pairs) {
            case 0:
                break;

            case 1:
                System.out.println(p.getName() + " has a pair of " + p.getCards().get(0).getRank());

                break;
            case 2:
                System.out.println(p.getName() + " has a three of a kind with three " + p.getCards().get(0).getRank());
                break;
            case 3:
                System.out.println(p.getName() + " has a four of a kind with four " + p.getCards().get(0).getRank());
                break;
        }
    }
    
    private static void p1StraightCheck(Player p, Player b) {
        
        ArrayList<Cards> usable  = new ArrayList<>();
        
      //  System.out.println(b.getCards() + "fffffffffffffffffffffffffff");
        //usable = b.getCards();
        
        for(int i=0;i < 5;i++){
            usable.add(b.getCards().get(i));
        }
       // System.out.println(b.getCards() + "gggggggggggggggggggggggggggg");
       // System.out.println(b.getCards());
        for(int i=0;i < 2;i++){
            usable.add(p.getCards().get(i));
        }
        
       // System.out.println(b.getCards() + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        Collections.sort(usable);
        
        if(usable.get(1).getRank().getRankValue() == (usable.get(0).getRank().getRankValue() +1) ){
            System.out.println("P1 two connectors");
            if(usable.get(2).getRank().getRankValue() == (usable.get(1).getRank().getRankValue() +1)){
                System.out.println("P1 three connectors");
                if((usable.get(3).getRank().getRankValue()) == (usable.get(2).getRank().getRankValue() +1)){
                    System.out.println("P1 four connects");
                    
                    if((usable.get(4).getRank().getRankValue())== (usable.get(3).getRank().getRankValue() +1)){
                        System.out.println("P1 STRAIGHT");
                        
                    }
                }
                
            }
        }
        
        else if(usable.get(2).getRank().getRankValue() == (usable.get(1).getRank().getRankValue() +1) ){
            System.out.println("P1 two connectors");
            if(usable.get(3).getRank().getRankValue() == (usable.get(2).getRank().getRankValue() +1)){
                System.out.println("P1 three connectors");
                if((usable.get(4).getRank().getRankValue()) == (usable.get(3).getRank().getRankValue() +1)){
                    System.out.println("P1 four connects");
                    
                    if((usable.get(5).getRank().getRankValue())== (usable.get(4).getRank().getRankValue() +1)){
                        System.out.println("P1 STRAIGHT");
                        
                    }
                }
                
            }
        }
        
        else if(usable.get(3).getRank().getRankValue() == (usable.get(2).getRank().getRankValue() +1) ){
            System.out.println("P1 two connectors");
            if(usable.get(4).getRank().getRankValue() == (usable.get(3).getRank().getRankValue() +1)){
                System.out.println("P1 three connectors");
                if((usable.get(5).getRank().getRankValue()) == (usable.get(4).getRank().getRankValue() +1)){
                    System.out.println("P1 four connects");
                    
                    if((usable.get(6).getRank().getRankValue())== (usable.get(5).getRank().getRankValue() +1)){
                        System.out.println("P1 STRAIGHT");
                        
                    }
                }
                
            }
        }
        System.out.println("P1 cards to use: " + usable);
        //sort then check if 1, then if 2, then if 3, then if 4
    }
    
    private static void p2StraightCheck(Player p, Player b) {
        
        ArrayList<Cards> p2Usable = new ArrayList<>();
        
       // System.out.println(b.getCards() + " dddddddddddddddddddddddddddd");
       // p2Usable = b.getCards();
        
        for(int i=0;i < 5;i++){
            p2Usable.add(b.getCards().get(i));
        }
      //  System.out.println(b.getCards());
        for(int i=0;i < 2;i++){
            p2Usable.add(p.getCards().get(i));
        }
        Collections.sort(p2Usable);
        
        if(p2Usable.get(1).getRank().getRankValue() == (p2Usable.get(0).getRank().getRankValue() +1) ){
            System.out.println("P2 two connectors");
            if(p2Usable.get(2).getRank().getRankValue() == (p2Usable.get(1).getRank().getRankValue() +1)){
                System.out.println("P2 three connectors");
                if((p2Usable.get(3).getRank().getRankValue()) == (p2Usable.get(2).getRank().getRankValue() +1)){
                    System.out.println("P2 four connects");
                    
                    if((p2Usable.get(4).getRank().getRankValue())== (p2Usable.get(3).getRank().getRankValue() +1)){
                        System.out.println("P2 STRAIGHT");
                        
                    }
                }
                
            }
        }
        
        else if(p2Usable.get(2).getRank().getRankValue() == (p2Usable.get(1).getRank().getRankValue() +1) ){
            System.out.println("P2 two connectors");
            if(p2Usable.get(3).getRank().getRankValue() == (p2Usable.get(2).getRank().getRankValue() +1)){
                System.out.println("P2 three connectors");
                if((p2Usable.get(4).getRank().getRankValue()) == (p2Usable.get(3).getRank().getRankValue() +1)){
                    System.out.println("P2 four connects");
                    
                    if((p2Usable.get(5).getRank().getRankValue())== (p2Usable.get(4).getRank().getRankValue() +1)){
                        System.out.println("P2 STRAIGHT");
                        
                    }
                }
                
            }
        }
        
        else if(p2Usable.get(3).getRank().getRankValue() == (p2Usable.get(2).getRank().getRankValue() +1) ){
            System.out.println("P2 two connectors");
            if(p2Usable.get(4).getRank().getRankValue() == (p2Usable.get(3).getRank().getRankValue() +1)){
                System.out.println("P2 three connectors");
                if((p2Usable.get(5).getRank().getRankValue()) == (p2Usable.get(4).getRank().getRankValue() +1)){
                    System.out.println("P2 four connects");
                    
                    if((p2Usable.get(6).getRank().getRankValue())== (p2Usable.get(5).getRank().getRankValue() +1)){
                        System.out.println("P2 STRAIGHT");
                        
                    }
                }
                
            }
        }
        System.out.println("P2 cards to use: " + p2Usable);
    }
    
    private static void flushCheck(Player p, Player b){
        
        ArrayList<Cards> flushUsable  = new ArrayList<>();
        
       // flushUsable = b.getCards();
        for(int i=0;i < 5;i++){
            flushUsable.add(b.getCards().get(i));
        }
        
        int club = 0;
        int spade = 0;
        int heart =0;
        int diamond =0;
        
        for(int i=0;i < 2;i++){
            flushUsable.add(p.getCards().get(i));
        }
        
        for(int k=0;k < 7;k++){
            
            if(flushUsable.get(k).getSuit() == Suit.CLUBS){
                club ++;
            }
            if(flushUsable.get(k).getSuit() == Suit.SPADES){
                spade ++;
            }
            if(flushUsable.get(k).getSuit() == Suit.HEARTS){
                heart ++;
            }
            if(flushUsable.get(k).getSuit() == Suit.DIAMONDS){
                diamond ++;
            }
            
        }
        
        if(club >= 5){
            System.out.println("CLUB FLUSH");
            if(flushUsable.get(6).getSuit() == Suit.CLUBS){
                System.out.println(flushUsable.get(6).getRank() + " high");
            }
            else if(flushUsable.get(5).getSuit() == Suit.CLUBS){
                System.out.println(flushUsable.get(5).getRank() + " high");
            }
            else if(flushUsable.get(4).getSuit() == Suit.CLUBS){
                System.out.println(flushUsable.get(4).getRank() + " high");
            }
        }
        if(spade >= 5){
            System.out.println("SPADE FLUSH");
            if(flushUsable.get(6).getSuit() == Suit.SPADES){
                System.out.println(flushUsable.get(6).getRank() + " high");
            }
            else if(flushUsable.get(5).getSuit() == Suit.SPADES){
                System.out.println(flushUsable.get(5).getRank() + " high");
            }
            else if(flushUsable.get(4).getSuit() == Suit.SPADES){
                System.out.println(flushUsable.get(4).getRank() + " high");
            }
        }
        if(heart >= 5){
            System.out.println("HEART FLUSH");
            
            if(flushUsable.get(6).getSuit() == Suit.HEARTS){
                System.out.println(flushUsable.get(6).getRank() + " high");
            }
            else if(flushUsable.get(5).getSuit() == Suit.HEARTS){
                System.out.println(flushUsable.get(5).getRank() + " high");
            }
            else if(flushUsable.get(4).getSuit() == Suit.HEARTS){
                System.out.println(flushUsable.get(4).getRank() + " high");
            }
        }
        if(diamond >= 5){
            System.out.println("DIAMOND FLUSH");
            
            if(flushUsable.get(6).getSuit() == Suit.DIAMONDS){
                System.out.println(flushUsable.get(6).getRank() + " high");
            }
            else if(flushUsable.get(5).getSuit() == Suit.DIAMONDS){
                System.out.println(flushUsable.get(5).getRank() + " high");
            }
            else if(flushUsable.get(4).getSuit() == Suit.DIAMONDS){
                System.out.println(flushUsable.get(4).getRank() + " high");
            }
        }
        
    }
    
    

    public static void main(String[] args) {
        Driver d = new Driver();
        


    }

}

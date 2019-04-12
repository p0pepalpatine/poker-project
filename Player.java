/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two;

import java.util.ArrayList;
import java.util.Stack;


public class Player {
    
    private String name;
    private ArrayList<Cards> cards = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public ArrayList<Cards> getCards(){
        return this.cards;
    }

    public void setCards(ArrayList<Cards> cards) {
        this.cards = cards;
    }
    
    Player(String name){
        this.name = name;
    }
    public void addCard(Stack<Cards> s){
        
        cards.add(s.pop());
       
    }
    
    
}

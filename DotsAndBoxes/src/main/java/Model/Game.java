/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author salce
 */
public class Game {
    private List<Player> players=new ArrayList<Player>();
    private Board board;
    
    private void startGame(){};
    private void endGame(){};
    private void addPlayer(Player player){};
    private void leaveGame(){};

    
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    
            
}

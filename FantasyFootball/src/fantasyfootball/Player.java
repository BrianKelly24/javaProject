/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasyfootball;

import java.io.Serializable;

/**
 *
 * @author x16114418
 */
//Adam Cahill
public class Player extends Stats implements Serializable {
    
    private String playername;
    private String playerage;
    private String playercountry;
    
    public Player(){
        playername = " ";
        playerage = " ";
        playercountry = " ";
        
    }

    public Player(String playername, String playerage, String playercountry, String performance, String speed, String stamina, String shotsOnTarget, String name, String id) {
        super(performance, speed, stamina, shotsOnTarget, name, id);
        this.playername = playername;
        this.playerage = playerage;
        this.playercountry = playercountry;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getPlayerage() {
        return playerage;
    }

    public void setPlayerage(String playerage) {
        this.playerage = playerage;
    }

    public String getPlayercountry() {
        return playercountry;
    }

    public void setPlayercountry(String playercountry) {
        this.playercountry = playercountry;
    }
    
    
    
}
//Adam Cahill
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
//Brian Kelly
public class Stats extends Details implements Serializable{
    private String performance;
    private String speed;
    private String stamina;
    private String shotsOnTarget;
    
    public Stats(){
        super();
        performance = " ";
        speed = " ";
        stamina = " ";
        shotsOnTarget = " ";
    }

    public Stats(String performance, String speed, String stamina, String shotsOnTarget, String name, String id) {
        super(name, id);
        this.performance = performance;
        this.speed = speed;
        this.stamina = stamina;
        this.shotsOnTarget = shotsOnTarget;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getStamina() {
        return stamina;
    }

    public void setStamina(String stamina) {
        this.stamina = stamina;
    }

    public String getShotsOnTarget() {
        return shotsOnTarget;
    }

    public void setShotsOnTarget(String shotsOnTarget) {
        this.shotsOnTarget = shotsOnTarget;
    }
    
    
    
}
//Brian Kelly
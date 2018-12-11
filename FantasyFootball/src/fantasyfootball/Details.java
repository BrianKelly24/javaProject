/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasyfootball;

/**
 *
 * @author x16114418
 */
//Brian kelly
public class Details {
    protected String name;
    protected String id;
    
    public Details(){
        name = " ";
        id = " ";
    }

    public Details(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
//Brian Kelly
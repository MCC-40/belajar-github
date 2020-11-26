/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg40.oop;

/**
 *
 * @author aqira
 */
public class Cyborg extends Person{
    
    private boolean helmet;

    public Cyborg() {
        super();
        setHelmet(true);
        //DB MySQL tinyint -> 1 / 0
    }
    
    //alt + insert -> Getter Setter
    public boolean isHelmet() {
        return helmet;
    }

    public void setHelmet(boolean helmet) {
        this.helmet = helmet;
    }

    @Override
    public String toString() {
        return super.toString() + " |Helmet : " + helmet;
    }
    
    
}

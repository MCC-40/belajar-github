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
public interface IRemote {
    
    public boolean power(boolean powerStatus);
    public String channel(int number);
    public String source(String sourceChoice);
}

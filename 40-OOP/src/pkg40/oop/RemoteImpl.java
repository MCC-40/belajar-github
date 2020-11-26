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
public class RemoteImpl implements IRemote {

    @Override
    public boolean power(boolean powerStatus) {
        return powerStatus;
    }

    @Override
    public String channel(int number) {
        String result;
        switch (number) {
            case 1:
                result = "Nickelodeon";
                break;
            case 2:
                result = "Disney Channel";
                break;
            case 3:
                result = "RCTI";
                break;
            default:
                result = "Layar Pelangi";
        }
        result += " Show";
        return result;
    }

    @Override
    public String source(String sourceChoice) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

}

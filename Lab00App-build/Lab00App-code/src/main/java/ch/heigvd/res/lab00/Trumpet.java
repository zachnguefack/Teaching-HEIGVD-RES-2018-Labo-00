 fb-alphorn
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author zacharie
 */
public class Trumpet implements IInstrument{
    
    public Trumpet(){}
    @Override
    public String play(){ 
        return "pouet";
    }
    @Override
    public int getSoundVolume(){
        return 20;
    }
     @Override
    public String getColor(){
        return "golden";
    }
    
    
        
=======
package ch.heigvd.res.lab00;

/**
 * Created by Olivier Liechti on 28/02/18.
 */
class Trumpet implements IInstrument {
    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public String getColor() {
        return "golden";
    }

    @Override
    public int getSoundVolume() {
        return 8;
    }

master
}

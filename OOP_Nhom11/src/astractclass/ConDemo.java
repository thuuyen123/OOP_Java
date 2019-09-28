/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astractclass;

/**
 *
 * @author ADMIN
 */
public class ConDemo extends DemoAbstract{
    public ConDemo(String name){
        super(name);
    }
    @Override
    public int getSoTu() {
        String nn=super.getName();
        String[] st=nn.split(" ");
        return st.length;
    }
    
}

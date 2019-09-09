/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_15_menu_chuanhoa;

/**
 *
 * @author Thu Uyên
 */
public class HoTen {
    private String name;

    public HoTen() {
    }

    public HoTen(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HoTen{" + "name=" + name + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Thu Uyên
 */
public class User {
     private int id_user;
    private String fullname;
    private String nickname;
    private String password;
    private String address;
    private String phone;
    private boolean planet;
    private Date dateofBrith;
    private String email;
    private String picture;

    public User() {
    }

    public User(int id_user, String fullname, String nickname, String password, String address, String phone, boolean planet, Date dateofBrith, String email, String picture) {
        this.id_user = id_user;
        this.fullname = fullname;
        this.nickname = nickname;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.planet = planet;
        this.dateofBrith = dateofBrith;
        this.email = email;
        this.picture = picture;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isPlanet() {
        return planet;
    }

    public void setPlanet(boolean planet) {
        this.planet = planet;
    }

    public Date getDateofBrith() {
        return dateofBrith;
    }

    public void setDateofBrith(Date dateofBrith) {
        this.dateofBrith = dateofBrith;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "User{" + "id_user=" + id_user + ", fullname=" + fullname + ", nickname=" + nickname + ", password=" + password + ", address=" + address + ", phone=" + phone + ", planet=" + planet + ", dateofBrith=" + dateofBrith + ", email=" + email + ", picture=" + picture + '}';
    }
}

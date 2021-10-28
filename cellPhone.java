package com.company;
class cellP{

    public void vibration(){
        System.out.println("Vibrating.....");
    }
    public void ringing(){
        System.out.println("Ringing.....");
    }

}
public class cellPhone {
    public static void main(String[] args) {
        cellP phone = new cellP();

        phone.ringing();
        phone.vibration();
    }
}

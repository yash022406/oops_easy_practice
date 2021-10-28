package com.company;
class square{
    int side;
    public int perimeter(){
        return 4*side;
    }
    public int area(){
        return side*side;

    }

}
public class squareFinding {
    public static void main(String[] args) {
        square square = new square();
        square.side = 5;
        System.out.println("The perimeter of this square is "+ square.perimeter());
        System.out.println("The area of this square is"+ square.area());
    }
}

package Intro;
public class autoboxandunbox {
    public static void main(String[] args) {
        int x1 = 10;
        Integer x2 = x1; //autoBoxing 
        int x3 = x2;     //autoUnBoxing
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}


//Primitive converts into corrosponding Wrapper class object..
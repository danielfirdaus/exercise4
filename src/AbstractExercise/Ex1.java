/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractExercise;

/**
 *
 * @author Danielfirdaus
 */
abstract class Parents{
    abstract void Message();
    void printMethod(){
        System.out.println("Message");
    }
}
class sub extends Parents {
    @Override
    void Message(){
        System.out.println("This is first subclass");
    }
   
}
class sub1 extends Parents{
    @Override
    void Message(){
        System.out.println("This is second subclass");
    }
}

public class Ex1{
    public static void main(String[] args) {
        sub a = new sub();
        sub1 b = new sub1();
        a.Message();
        b.Message();
    }
}
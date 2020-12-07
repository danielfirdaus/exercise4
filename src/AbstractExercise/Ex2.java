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
abstract class bank{
    abstract void getBalance();  
}
class bank1 extends bank{
    void getBalance(){
        System.out.println("Balance bank 1: 100");
    }
}
class bank2 extends bank{
    void getBalance(){
        System.out.println("Balance bank 2: 150");
    }
}
class bank3 extends bank{
    void getBalance(){
        System.out.println("Balance bank 2: 200");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        bank1 a = new bank1();
        bank2 b = new bank2();
        bank3 c = new bank3();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
    
}

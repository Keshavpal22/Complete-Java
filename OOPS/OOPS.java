package OOPS;

public class OOPS {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("red");
        System.out.println(p1.getColor());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "john_doe";
        // myAcc.password = "myPassword"; // This line will cause an error
        // myAcc.setPassword("securePassword123");
    }
}

// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }

class Pen{
    private String color;
    private int tip;

    // Getters
    String getColor(){
        return color;
    }

    int getTip(){
        return tip;
    }


    // Setters
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

// class Student{
//     String name;
//     int age;

//     float percentage;

//     void calcPercentage(int phy, int chem, int math){
//         percentage = (phy + chem + math) / 3;
//     }
// }

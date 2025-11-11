public class Factory {

    //instance variables
    public int yearFounded;
    public boolean isOpen;
    public double earnings; //unit in millions
    public String products;

    public static void main(String[] args) {
        System.out.println("Welcome to Natalie's factory!!");

        new Factory();

    }

    //constructor
    public Factory(){
        System.out.println("We make houses");
        yearFounded = 2025;
        isOpen = false;
        earnings = 1.1;
        products = "houses";
        factoryInfo();
    }

    public void factoryInfo() {



    }



    }



    //todo: make a method called factoryInfo




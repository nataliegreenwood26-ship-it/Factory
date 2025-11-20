import com.sun.corba.se.impl.orbutil.HexOutputStream;

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
        yearFounded = 2012;
        isOpen = false;
        earnings = 1.1;
        products = "houses";
        factoryInfo();
        factoryInfo();

        House h1= new House();
        h1.owner= "Mr.Kim";
        System.out.println("the owner is" + h1.owner);
        h1.size=200;
        h1.walls=10;
        h1.address= "126 manet road";
        h1.isOccupied=true;
        House h2 = new House();
        h2.printInfo();

        House myhouse = new House();
        myhouse.printInfo();

        House customHouse = new House(200.2,5,"Mrs.Blair","126 Manet Road",true);

        customHouse.printInfo();

        Squash mysquash = new Squash();
        mysquash.printinfo();
        Squash customsquash = new Squash(10,"Agnus","Tim",false);


    }

    public void factoryInfo() {



    }



    }



    //todo: make a method called factoryInfo




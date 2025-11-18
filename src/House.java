public class House {


    //instance variables
    //1. at the top of the class
    //2. they can be used anywhere
    //3. they have the word public before

    public int walls;
    public double size;
    public String owner;
    public String address;
    public boolean isOccupied;


    public House(){
    walls = 4;
    size = 3200.7;
    owner = "Bobby";
    address = "362 Centre St";
    isOccupied = true;

    }
    //hw: add 2 more parameters to the house constructor, 1 for isOccupied, 1 for address
    //set the instance variables value to the parameters
    //fix the related problems by adding them to the code in the factory class


    public House(double psize, int pWalls,String pOwner) {
        size = psize;
        walls = pWalls;
        owner = pOwner;


    }


    public void printInfo() {
        System.out.println(walls); //not a readable way
        System.out.println(size);
        System.out.println("name of owner:" +owner); //readable
        System.out.println(address);
        System.out.println(isOccupied);





    }


}

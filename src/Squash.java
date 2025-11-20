public class Squash {

    public int Matches;
    public String Comp1;
    public String Comp2;
    public boolean DoesComp2Win;

    public Squash() {
        Matches = 3;
        Comp1 = "Spencer";
        Comp2 = "Bobby";
        DoesComp2Win = true;

    }

    public Squash(int pMatches, String pComp1, String pComp2, boolean pDoesComp2Win) {
        Matches = pMatches;
        Comp1 = pComp1;
        Comp2 = pComp2;
        DoesComp2Win = pDoesComp2Win;


    }

    public void printinfo() {
        System.out.println("Matches" + Matches);
        System.out.println("Spencer:" + Comp1);
        System.out.println("Bobby:" + Comp2);
        System.out.println("Comp2 Wins" + DoesComp2Win);


    }




}

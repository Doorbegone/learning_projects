
class big_thing {
    protected String name = "Entity: ";
    public void announce(){
        System.out.println(name);
    }
}

class small_thing extends big_thing{
    protected String fulln;
    
    public small_thing(String[] args){
        fulln = args[0];   
    }
}


public class Main {
    int tote = 124;
    public static void main(String[] args) {
        //If you are reading this, you're going to find something very interesting here.
        System.out.println("Hello World!");
        System.out.println("Number");
        System.out.println(3 * 3);
        System.out.println(Math.pow(2, 4));

        String totherm = "Fish, the Ultimate";
        Main tothe = new Main();

        System.out.println(tothe.tote + totherm);

        int thenum1 = 0;
        int thenum2 = 0;
        if(tothe.tote > Math.pow(2,4)){
            thenum1 = 15;
        }
        if("Fish".length() > "fish".length()){
            thenum2 = 12;
        }

        

        switch (thenum1) {
            case 15:
                System.out.println("tothe was more than 2^4");
                break;
            case 12: 
                System.out.println("Something was switched");
                break;
            default:
                System.out.println("tothe was lesss than 2^4");
                break;
        }

        switch (thenum2) {
            case 12:
                System.out.println("Fish");
                break;
            case 15:
                System.out.println("Something was switched");
                break;
            default:
                System.out.println("Not Fish");
                break;
        }

        int i = 0;
        while(i < 100){
            System.out.print(i + " ");
            i++;
        }
        String fishvar = "Apples and Fisheries are Domstrant";
        for(int j = 0; j < 20; j++){
            System.out.print(fishvar.charAt(j) + " ");
        }
        int chele = 4;
        String werew = "Fissh";
        String rewew = "There";
        String rewer = "Chelemon";
        chele = secondary_funct(werew, chele);
        chele = secondary_funct(rewew, chele);
        chele = secondary_funct(rewer, chele);
        System.out.println("Final value of chele is: " + chele);
        //secondary_funct(fishvar, thenum2);
        
        /*
         * something very interesting here.
         */
    }

    public static int secondary_funct(String input, int tnum) {
        System.out.println(input);
        int output = tnum * tnum;
        System.out.println(output);
        return output;
    }
}

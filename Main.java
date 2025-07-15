

public class Main {
    public static void main(String[] args) {
        //If you are reading this, you're going to find something very interesting here.
        System.out.println("Hello World!");
        System.out.println("Number");
        System.out.println(3 * 3);
        System.out.println(Math.pow(2, 4));

        String totherm = "Fish, the Ultimate";
        int tothe = 124;

        System.out.println(tothe + totherm);

        boolean statment1 = false;
        boolean statment2 = false;
        if(tothe > Math.pow(2,4)){
            statment1 = true;
        }
        if("Fish".length() > "fish".length()){
            statment2 = true;
        }

        int thenum1 = 15;
        int thenum2 = 12;

        switch (thenum1) {
            case 15:
                System.out.println("tothe was more than 2^4");
                break;
            default:
                System.out.println("tothe was lesss than 2^4");
                break;
        }

        switch (thenum2) {
            case 12:
                System.out.println("Fish");
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
        
        /*
         * something very interesting here.
         */
    }
}

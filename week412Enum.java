public class week412Enum {

    public enum Level {
        High, Medium, Low;
    }

    public static void main(String[] args) {
        // Level l = Level.High; // Creating an instance of the Level enum
        // System.out.println(l); // Printing the value

        // System.out.println(l.ordinal());

        // Level l1 = Level.Low; // Creating an instance of the Level enum
        // System.out.println(l1); // Printing the value

        // System.out.println(l1.ordinal());

        Level[] l2 = Level.values();
        for(Level l3 : l2){
            System.out.println(l3 +" "+l3.ordinal());
        }
    }
}


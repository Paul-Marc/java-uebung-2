public class Aufgabe2 {
    public static void main(String[] args){
        int a = 1024 - 621;
        System.out.print("Das Ergebniss von Aufgabe a) ist: ");
        System.out.println(a);
        
        System.out.println("---------------------------------");

        int b = 22 / 7;
        int rest = 22 % 7;
        System.out.print("Das Ergebniss von Aufgabe b) ist: ");
        System.out.println(b);

        System.out.print("Der Rest von Aufgabe b) ist: ");
        System.out.println(rest);
        
        System.out.println("---------------------------------");

        double c  = 91.23 + 18.21;
        System.out.print("Das Ergebniss von Aufgabe c) ist: ");
        System.out.println(c);
        
        System.out.println("---------------------------------");


        int d = 128 % 2;
        System.out.print("Wenn das hier: ");
        System.out.print(d);
        System.out.println(" gleich 0 ist ist die Zahl 128 gerade.");
        
        System.out.println("---------------------------------");

        boolean e = 7 > 1 && 7 < 19;
        System.out.print("Ist die Ganzzahl 7 größer "
        +" als 1 und kleiner als 19? ");
        System.out.println(e);
                
        System.out.println("---------------------------------");

        boolean f = -1.0f < 0.5f || -1.0f > 10.2f;
        System.out.print("Ist die Fließkommazahl 1. 0 Entweder kleiner als "
        +"0.5 oder größer als 10.2? ");
        System.out.println(f);
        
        System.out.println("---------------------------------");
    }
}
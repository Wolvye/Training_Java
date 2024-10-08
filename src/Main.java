public class Main {
    public static void main(String[] args) {
        int i3 =berechnen(2,4);
        int i5 =berechnen(i3, 25);
       berechnen(i5,-5);
        wort();

    }
    public static void konsolenAusgabe(boolean b){
        if (b){
            System.out.println("Der Wert ist wahr!");

        }else{
            System.out.println("Der Wert ist Falsch!");
        }
    }
    public static void ersteMethode() {
        System.out.println("Hallo Welt!");
    }
    public static void neueMethode(int a){
        System.out.println(a);
    }
    public static void mehrereArgumente(float f, boolean b){
        if (b){
            System.out.println(f);
        }

    }
    public static void dreiArgumente(int a, int b ,boolean c){
        if (c){
            System.out.println(a+b);
        }else {
            System.out.println(a-b);
        }

    }
    public static void erstetzen(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    public static int subtrahieren(int a, int b){
        int c = a-b;
        return c;
    }
    public static int berechnen(int a, int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
    public static void wort(){
        int i =200;
        String zeichenkette ="Alles klar," + i;
        System.out.println(zeichenkette + " Herr Kommissar?"+ (i+i));
        float f =2.5f;
        int i2 = (int) f;
        System.out.println(i2); // die 0.5 geht verloren. Das liegt am casting von float zu int

        String s = "2.5";
        //int i3 = Integer.parseInt(s);
        float f3 = Float.parseFloat(s);
    }


}


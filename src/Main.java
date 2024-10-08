public class Main {
    public static void main(String[] args) {
       int i1 =2;
       int i2=4;
        int i3= i1+i2;
       erstetzen(i1, i2);
        System.out.println(i3);
        int i4 =25;


        int i5 =i3 +i4;
        System.out.println(i5);
        int i6=-5;

        int i7= i5-i6;
        System.out.println(i7);

        ersteMethode();
        neueMethode(i7);
        mehrereArgumente(2.0f , false);
        dreiArgumente(2,5,false);
        int i = subtrahieren(2,3);
        System.out.println(i);
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
}


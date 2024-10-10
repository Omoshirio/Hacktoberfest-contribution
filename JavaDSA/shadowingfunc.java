public class shadowingfunc {

    static int x = 90;  //this will be shadowed at line no 8
    public static void main(String[] args) {
        System.out.println(x);  // output :- 90

        int x;  // the class variable at line 4 is shadowed by this

        // System.out.println(x);   // scope will begin when value is initialised
        
        x = 40;

        System.out.println(x);  // output :- 40


        fun();
    }

    static void fun() {
        System.out.println(x);
    }
    
}

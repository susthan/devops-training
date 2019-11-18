package example;

public class Example {

    public static void main(String[] args) {

        print("###################################################");
        print("Hello world!!!!");
        print("I am just a pretty printer :p ");
        for(String s: args)
            print(s);
        print("###################################################");

    }

    private static void print(String s) {
        for(int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}

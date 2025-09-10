public class FirehoseTester {
    public static void main() {
        System.out.println("Yo, whaddup!");

        Firehose hose1 = new Firehose();
        Firehose hose2 = new Firehose();
        System.out.println(hose1.equals(hose2));
        hose1.paint();
        hose1.unwind();
        hose1.use();
        hose1.drinkMe(90);
        System.out.println(hose1.toString());
        System.out.println(hose1.equals(hose2));
    }

   
}

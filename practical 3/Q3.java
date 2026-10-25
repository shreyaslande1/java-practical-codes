class store {
    static String storename;
    int itemprice;
    int amount = 0;

    public static void sname(String s) {
        storename = s;
    }

    public void sale(float itemprice) {
        this.itemprice = (int) itemprice;
        System.out.println("Storename = " + storename + " Item price = " + itemprice + " Amount = " + amount);
    }
}

public class Q3 {
    public static void main(String[] args) {
        store.sname("Shreyas Jewellers");
        store s1 = new store();
        s1.sale(1000.30f);
        store s2 = new store();
        s2.sale(3400.23f);
        s2.display();
    }
}
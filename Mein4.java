public class Mein3_1 {
    public static void main(String[] args) {

        int diameter1 = 28;
        int diameter2 = 24;

        double area1 = Math.PI * diameter1 * diameter1 / 4;
        double area2 = Math.PI * diameter2 * diameter2 / 4;
        System.out.println((area1 - area2) * 40);

    }
}

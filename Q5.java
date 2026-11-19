public class Q5 {
    public static void main(String[] args) {
        int n = 4;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        for (int ligne = n; ligne >= 1; ligne--) {
            for (int i = 1; i <= ligne; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

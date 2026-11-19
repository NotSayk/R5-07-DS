public class Q3 {
    public static void main(String[] args) {
        int n = 10;                          
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);   
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

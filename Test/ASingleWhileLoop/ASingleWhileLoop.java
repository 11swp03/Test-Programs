public class ASingleWhileLoop {
    public static void main(String[] args) {
     int i = 0;
     

        while(i < 4) {
            int j = 0;
            while(j < 4) {
                System.out.println("i is " + i + " and j is " + j);
                j++;
            }
            i++;
        }

    }
}
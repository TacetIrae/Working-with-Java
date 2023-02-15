package first_pj;

public class main {
    public static void main(String[] args) {

        System.out.println("hello world!");
        int x,y,z;
        x = 10;
        y = 20;
        z = x+y;
        System.out.println(z);
        /*Types of values */
        int ii = 1;
        float t = 1.25f;
        double g = 1.25;
        char r = 'g';
        String h = "Hello, my name is egor";
        boolean u = true;
        var l = 123; /* Most probable choice */
        int[] array = new int[10];
        int[][] arr = new int[5][3];
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                System.out.printf("%d", arr[i][j]);
            }
        }







        
    }
    
}
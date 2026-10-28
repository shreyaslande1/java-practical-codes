public class A {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int [][] a = new int[m][n];
        int temp = 2;
        for(int i = 0;i<m;i++){
           for(int j = 0;j<n;j++){
               a[i][j] = Integer.parseInt(args[temp]);
               temp++;
           }
        }
        int large = a[0][0];
        int min = a[0][0];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(a[i][j]<min){
                    min = a[i][j];
                }
                if(a[i][j]>large){
                    large = a[i][j];
                }
            }
        }
        System.out.println(large);
        System.out.println(min);
        
    }
}

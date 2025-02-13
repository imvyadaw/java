package nested_loop;

public class loop2{
    public static void main(String args[]){
        int n=4;
        int m=5;
        for(int i=1;i<=n;i=i+1){
            for(int j=1;j<=m;j=j+1){
                if(i==1|| i==n||j==1||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// out put
// *****
// *   *
// *****
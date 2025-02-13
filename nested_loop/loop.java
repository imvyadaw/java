package nested_loop;

public class loop {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        for(int i=1;i<=n;i=i+1){
            for(int j=1;j<=m;j=j+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// output
// *****
// *****
// *****
// *****
// *****

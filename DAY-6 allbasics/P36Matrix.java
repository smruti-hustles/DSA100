import java.util.*;
public class P36Matrix{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      int a[][]=new int[m][n];
      int b[][]=new int[m][n];
      int c[][]=new int[m][n];
      int d[][]=new int[m][n];
      int e[][]=new int[m][n];
      int f[][]=new int[m][n];
      int g[][]=new int[m][n];
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            a[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            b[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            for(int k=0;k<a[j].length;k++){
                c[i][j]=a[i][j]+ b[i][j]; //addition of matrix
                d[i][j]=a[i][j]- b[i][j]; //subtraction of matrix
                e[i][j]=a[i][k]* b[k][j];  // multiplication of matrix
                f[i][j]=a[j][i];  //Transpose of matrix
                g[i][j]=a[j][i];
            }
        }
      }
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
           System.out.print(c[i][j]+" ");
        }
        System.out.println();
      }
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
           System.out.print(d[i][j]+" ");
        }
        System.out.println();
      }
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
           System.out.print(e[i][j]+" ");
        }
        System.out.println();
      }
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
           System.out.print(f[i][j]+" ");
        }
        System.out.println();
      }
    }
}
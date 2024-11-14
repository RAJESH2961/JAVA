import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int [][] matrix1= new int[3][3];
        int [][] matrix2= new int[3][3];
        int [][] result= new int[3][3];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The values for Matrix-1");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter ["+i+"]" + "[" +j+"]"+"Value");
                matrix1[i][j]= scan.nextInt();
            }
        }

        System.out.println("Enter The values for Matrix-2");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter ["+i+"]" + "[" +j+"]"+"Value");
                matrix2[i][j]= scan.nextInt();
            }
        }

        //Matrix Multiplication Logic
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                // System.out.println("Enter ["+i+"]" + "[" +j+"]"+"Value");
                for(int k=0; k<3;k++){
                    result[i][j] = result[i][j]+matrix1[i][k]*matrix2[k][j];
                }
                // matrix1[i][j]= scan.nextInt();
            }
        }

        System.out.println("Resultant Matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

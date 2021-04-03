import java.util.Random;
public class Lab2 {
    public static void main(String[] args)  {
		
		String s;

		System.out.print("Введіть кількість рядків матриці: ");
		s = System.console().readLine();
		int y = Integer.parseInt(s);

		System.out.print("Введіть кількість стовпців матриці: ");
		s = System.console().readLine();
		int x  = Integer.parseInt(s);

		double rangeMin = 0;
		double rangeMax = 100;

		double[][] matrixA = new double[y][x];
		double[][] matrixB = new double[y][x];
		double[][] matrixC = new double[y][x];

		Random r = new Random();
        for ( int i = 0; i < y; i++) {
            for ( int j = 0; j < x; j++) {
				matrixA[i][j] = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
				matrixB[i][j] = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
            }
        }

		System.out.println("Матриця A");	
        for ( int i = 0; i < y; i++) {
            for ( int j = 0; j < x; j++) {
				System.out.print(matrixA[i][j]);	
				System.out.print("\t");	
			}
			System.out.println();	
        }

		System.out.println("Матриця B");	
        for ( int i = 0; i < y; i++) {
            for ( int j = 0; j < x; j++) {
				System.out.print(matrixB[i][j]);	
				System.out.print("\t");
			}
			System.out.println();	
        }
		
        for ( int i = 0; i < y; i++) {
            for ( int j = 0; j < x; j++) {
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

		System.out.println("Матриця C");	
        for ( int i = 0; i < y; i++) {
            for ( int j = 0; j < x; j++) {
				System.out.print(matrixC[i][j]);	
				System.out.print("\t");
			}
			System.out.println();	
        }
	
		double sum = 0;

        for ( int i = 0; i < x; i++) {
			double min = matrixC[0][i];
            for ( int j = 0; j < y; j++) {
				if (matrixC[j][i] < min){
					min = matrixC[j][i];
				}
            }
			sum += min;
        }

		
		System.out.print("Сума: ");	
		System.out.print(sum);	
    }
}

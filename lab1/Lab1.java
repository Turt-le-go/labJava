public class Lab1 {
    public static void main(String[] args)  {
		
		String s;

		System.out.print("Введіть a: ");
		s = System.console().readLine();
		byte a = Byte.parseByte(s);

		System.out.print("Введіть b: ");
		s = System.console().readLine();
		byte b = Byte.parseByte(s);

		System.out.print("Введіть n: ");
		s = System.console().readLine();
		byte n = Byte.parseByte(s);

		System.out.print("Введіть m: ");
		s = System.console().readLine();
		byte m = Byte.parseByte(s);

        double S = 0;

        final byte C = 2;
		

        for ( byte i = a; i <= n; i++) {
            for ( byte j = b; j <= m; j++) {
				/*
				System.out.println(i);
				System.out.println(j);
				System.out.println(C);
				System.out.println("___");
				*/
				if (i == C || j == 0) {
					System.out.println(":( Division by Zero");
					return;
				}
                S += ((double)(i%j)/(i-C));
            }
        }
        System.out.println(S);
    }
}

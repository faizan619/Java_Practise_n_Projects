public class Pattern{
	public static void main(String ag[]){
		System.out.println("Pattern 1");
		int num = 5;
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=======================================");

		System.out.println("Pattern 2");
		for(int i =0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("=======================================");

		System.out.println("Pattern 3");
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println(" ======================================= ");

		System.out.println("Pattern 4");
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println(" ======================================= ");
		
		System.out.println("Pattern 5");
		for(int i=1;i<=num;i++){
			// System.out.println(i);
			for(int j=0;j<=num-i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println(" ======================================= ");

		System.out.println("Pattern 6");
		for(int i=0;i<num;i++){
			for(int j=1;j<=(num-i);j++){
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println(" ======================================= ");
		
		System.out.println("Pattern 7");
		for(int i=0;i<num;i++){
			for(int j=0;j<num-1-i;j++){
				System.out.print(" ");
			}

			for(int j=0;j<2*i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println(" ======================================== ");

		System.out.println("Pattern 8");
		for(int i=0;i<num;i++){

			for(int j=0;j<i;j++){

				System.out.print(" ");

			}

			for(int j=0;j<num*2-1-(i*2);j++){
				System.out.print("*");
			}

			// for(int j=0;j<i;j++){
			// 	System.out.print("-");
			// }

			System.out.println();

		}

		System.out.println(" ======================================== ");

		System.out.println("Pattern 9");
		
		for(int i=0;i<num;i++){

			for(int j=0;j<num-i;j++){
				System.out.print(" ");
			}

			for(int j=0;j<2*i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}		
		for(int i=0;i<num;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}

			for(int j=0;j<num*2-(i*2-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}


		System.out.println(" ======================================== ");

		System.out.println("Pattern 10");

		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<num-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
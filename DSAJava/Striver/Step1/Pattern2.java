public class Pattern2{
	public static void main(String af[]){
		System.out.println("Pattern 11");
		int num = 5;
		for(int i=1;i<=num;i++){
			for(int j=0;j<i;j++){
				int res = j%2;
				System.out.print(res);
			}
			System.out.println();
		}

		System.out.println("=========================================");
		System.out.println("Pattern 12");
		for(int i=1;i<num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}

			for(int j=0;j<num-i-1;j++){
				System.out.print("-");
			}

			for(int j=0;j<num-i-1;j++){
				System.out.print("-");
			}

			for(int j=i;j>=1;j--){
				System.out.print(j);
			}

			System.out.println();
		}

		System.out.println("=========================================");
		System.out.println("Pattern 13");
		int val13 = 0;
		for(int i=0;i<num;i++){

			for(int j=0;j<=i;j++){
				val13++;
				System.out.print(val13);
			}
			System.out.println();
		}


		System.out.println("=========================================");
		System.out.println("Pattern 14");

		
		for(int i=0;i<num;i++){
			char val14 = 'A';
			for(int j=0;j<=i;j++){
				System.out.print(val14);
				val14++;
			}
			System.out.println();
		}


		System.out.println("=========================================");
		System.out.println("Pattern 15");

		for(int i=0;i<num;i++){
			char val15 = 'A';
			for(int j=num;j>i;j--){
				System.out.print(val15);
				val15++;
			}
			System.out.println();
		}



		System.out.println("=========================================");
		System.out.println("Pattern 18");

		// 		<?php
		// $num=5;
		// for($i=0;$i<$num;$i++){
		//     $cc = 'A';
		//     for($j=1;$j<=$num;$j++){
		//         echo "\n".$j." : ".$num."\n";
		//         if($j>=$num-$i){
		//             echo $cc;
		//         }
		//         ++$cc;
		//     }
		//     echo "\n";
		// }

		// ?>


		System.out.println("=========================================");
		System.out.println("Pattern 19");
		// try to find the time complexity of this solution
		for(int i=0;i<num;i++){
			for(int j=0;j<num-i;j++){
				System.out.print("*");
			}

			for(int j=0;j<i*2;j++){
				System.out.print(" ");
			}

			for(int j=0;j<num-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<num;i++){
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			for(int j=0;j<=num*2-(i*2)-3;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("=====================================");
		System.out.println("Pattern 21");

		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){

				if(i==0 || j==0 || i==num-1 || j==num-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}

			}
			System.out.println();
		}



	}
}
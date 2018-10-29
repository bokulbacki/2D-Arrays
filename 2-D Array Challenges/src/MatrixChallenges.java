
public class MatrixChallenges
	{

		public static void main(String[] args)
			{
				int array1 [ ] [ ] = new int [3] [4];
				array1 [0] [0] = 2;
				array1 [0] [1] = 4;
				array1 [0] [2] = 6;
				array1 [0] [3] = 8;
				array1 [1] [0] = 3;
				array1 [1] [1] = 6;
				array1 [1] [2] = 9;
				array1 [1] [3] = 12;
				array1 [2] [0] = 4;
				array1 [2] [1] = 8;
				array1 [2] [2] = 12;
				array1 [2] [3] = 16;
				
				System.out.println(array1[1][2]);
				
				String array2 [ ] [ ] = new String [5] [3];	
				for (int row = 0; row<array2.length; row++)
					{
						for (int col = 0; col<array2[row].length; col++)
							{
								array2 [row][col] = "Mustang";
							}
					}
				
				for (int row = 0; row<array2.length; row++)
					{
						System.out.println();
						for (int col = 0; col<array2[row].length; col++)
							{
								System.out.print(array2[row][col] + "   ");
							}
					}
				
				int ten= 10;
				int array3 [ ] [ ] = new int [3] [3];
				for (int row = 0; row<array3.length; row++)
					{
						for (int col = 0; col<array3[row].length; col++)
							{
								array3 [row][col] = (ten);
								ten = ten +10;
							}
					}
				
				for (int row = 0; row<array3.length; row++)
					{
						System.out.println();
						for (int col = 0; col<array3[row].length; col++)
							{
								System.out.print(array3[row][col] + "   ");
							}
					}
				System.out.println();
				int sum = 0;
				sum += array3[0][0];
				sum += array3[0][2];
				sum += array3[2][0];
				sum += array3[2][2];
				
				System.out.println("The sum is " + sum);
				
			}

	}

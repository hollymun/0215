
public class Gugudan {

	public static void main(String[] args) {

		for(int i=1;i<=9;i=i+1) {
			for(int j=2; j<=5;j=j+1) {
				System.out.printf("%2d*%2d=%2d", i,j,i*j);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("=========================\n");
		
		for(int i=1;i<=3;i=i+1) {
			for(int j=1; j<=3;j=j+1) {
				for(int k=1;k<=3;k=k+1) {
					System.out.printf("@");
				
				}
				System.out.printf("*");
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
		
		String [] dot={"*"};
		for (int i=0;i<3;i=i+1) {
			for(int j=0;j<3;j=j+1) {
				System.out.printf("%5s", dot);
			}
			System.out.printf("*\n");
		}

		System.out.printf("=========================\n");
		
		for(int i=0; i<=10; i=i+1) {
			if(i<=4) {
				for(int j=0; j<=i; j=j+1) {
					System.out.printf("%5s*", dot);
				}
				System.out.printf("\n"); 
				}else if(i>4){
					for(int j=0; j<=10-i; j=j+1) {
						System.out.printf("*");
					}
				System.out.printf("\n"); 
				}
			} 
		
		System.out.printf("=========================\n");
		


		
	}
}
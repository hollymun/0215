
public class Matrix {

	public static void main(String[] args) {
/*		
		//모든 행의 크기가 동일한 2차원 배열
		//사람 이름 20개 5개 그룹을 저장할 수 있는 배열을 생성
		//자료형 [] [] 배열이름 = new 자료형 [행개수] [열개수];
		String [][] names=new String[3][30];
		
		//행별로 열의 크기가 다른 2차원 배열 만들기
		//0그룹 28개, 1그룹 17개, 2그룹 30개 저장 
		String [][] OtherNames=new String[3][];
		OtherNames[0]=new String[28];
		OtherNames[1]=new String[17];
		OtherNames[2]=new String[30];

		System.out.printf("%d\n",  OtherNames.length); //행 몇 개?
		System.out.printf("%d\n",  OtherNames[0].length); //[0]의 열 몇 개?
	//	System.out.printf("%d\n",  OtherNames[0][0].length);
		
		System.out.printf("======================\n"); 
		
		System.out.printf("%s\n",  OtherNames); //배열의 참조 리턴 
		System.out.printf("%s\n",  OtherNames[0]); 
		System.out.printf("%s\n",  OtherNames[0][0]); 
		
		System.out.printf("======================\n"); 
		
		String [][] catsNDogs= {{"하루","박시","랄랄랄"},
							{"얌마","나르"},
							{"호두","후추"}};
		
		int rowSize=catsNDogs.length;
		for(int i=0; i<rowSize;i=i+1) {
			int colSize=catsNDogs[i].length;
			for(int j=0;j<colSize;j=j+1) {
				System.out.printf("%5s", catsNDogs[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("======================\n"); 

		//빠른 열거를 이용해서 출력
		for(String [] temp:catsNDogs) {
			for(String imsi:temp) {
				System.out.printf("%5s",imsi);				
			}
			System.out.printf("@\n");
		}

		
		int [] ar= {17,26,35,44,53,62,71};
		//30 이상인 데이터의 합계, 개수, 평균(소수 2자리까지 출력)
		//변수를 시작점이 될 값으로 초기화
		int sum=0; //합계 저장할 변수  
		int cnt=0; //개수 저장할 변수 
		
		for(int x : ar) {	//배열의 데이터 순회 
			if(x>60) {
				//if(x>90) 으로 바꾸면 나누는 cnt 값이 0이 되므로 X 
				sum=sum+x; //이전 합과 합을 구할 값의 합계 
				cnt=cnt+1; 	//개수는 하나씩 증가
			}
		}
		//합계와 개수를 구한 뒤 평균은 한 번만 해도 되니까 for 구문 밖에 작성  
		double avg=(double)sum/cnt;
		
		System.out.printf("합계:%d 개수:%d 평균: %.2f", sum, cnt, avg);
		
		
		System.out.printf("=========================\n");
		//최대 최소 구하기 
		int [] ar1= {40,70,30,65,93,48,88};	 
	
		int max=0;
		int min=100; 
		
		for(int data:ar1) {
			if(max<data) {
				max=data;
			}
			if(min>data) {
				min=data;
			}
		}
		System.out.printf("최대값: %d  최소값: %d\n", max, min);
*/
		System.out.printf("=========================\n");
		//배열 합치기 
		int [] ar1= {40,70,30,65,93,48,88};	 //7
		int [] ar2= {51, 73}; 					//2
		
		//2개의 데이터를 저장할 새로운 배열을 생성 /ar1 개수와 ar2 개수 합치기 
		int [] merge=new int[ar1.length+ar2.length];

		//첫 번째 배열의 데이터 옮기기 
		for(int i=0; i<ar1.length; i=i+1) {
			merge[i]=ar1[i];
		}
		
		//두 번째 배열의 데이터 옮기기 
		for(int i=0; i<ar2.length; i=i+1) {
			merge[ar1.length+i]=ar2[i];			//ar1 뒤에 ar2가 리턴되어야 하므로 ar1개수+i
		}
		
		//ar1과 ar2의 데이터를 옮긴 merge의 전체 데이터 출력 
		for(int e:merge) {
			System.out.printf("%d\n", e);
		}

		System.out.printf("=========================\n");

	
		
		
	}
}
	


public class ArrayTest {

	public static void main(String[] args) {
		//배열을 생성하고 나중에 데이터를 대입
		String [] catsGroup=new String[4];
		
		catsGroup[0]="하루";
		catsGroup[1]="박시";
		catsGroup[2]="얌마";
		catsGroup[3]="나루";

		//배열의 요소 출력
		System.out.printf("%s\n", catsGroup[0]);
		System.out.printf("%s\n", catsGroup[1]);
		System.out.printf("%s\n", catsGroup[2]);
		System.out.printf("%s\n", catsGroup[3]);

		System.out.printf("=========================\n");
		
		//동일한 문장이나 일정한 패턴을 갖는 문장은 반복문을 이용
		//코드 라인 수를 줄이고 하나의 문장으로 처리할 수 있기 때문에 유지보수에 용이함 
		
		//배열의 데이터 개수를 상수로 직접 설정하지 않고 .length 이용 
		for(int i=0; i<catsGroup.length; i=i+1) {
			System.out.printf("%s\n", catsGroup[i]);
		}
		
		System.out.printf("=========================\n");

		// .length(배열의 데이터 개수)를 변수에 대입하고 이용
		//heap에 생성된 데이터라면 가까운 곳으로 옮겨놓고 사용하는 것이 좋음 
		int catsGroupSize=catsGroup.length;
		int i=0;
		while(i<catsGroupSize) {
			System.out.printf("%s\n", catsGroup[i]);
			i=i+1;
		}
		
		System.out.printf("=========================\n");
		
		i=0;
		do {
			System.out.printf("%s\n", catsGroup[i]);
			i=i+1;
		}while(i<4);
		
		/*		
		//for-each(빠른열거)를 이용한 배열의 데이터 나열 
		//for(자료형 변수명 : 배열명) { 출력 }; 
		for(String foreach : catsGroup) {
			System.out.printf("%s\n", foreach);
		}
*/		
		
		System.out.printf("=========================\n");
		
		//String [][] AnotherCatsGroup=new String[][]];
		
		//AnotherCatsGroup=
		
	}
}

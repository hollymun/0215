
public class Array {

	public static void main(String[] args) {
		//배열을 선언한 후 나중에 메모리 할당하기 
		int [] ar1=null;
		//배열의 이름만 만든 경우(참조형 변수를 선언만 한 경우)
		//.을 이용해서 다른 멤버를 호출하면 NullPointerException이 발생
		//NullPointerException은 참조형 변수가 데이터를 생성하지 않은 상태에서 이용
		//System.out.printf("데이터 개수: %d\n", ar1.length);
		
		ar1=new int[3];
		//위처럼 만들게 되면 각 요소는 전부 0로 채워짐 (또는 다른 기본값 0.0 false null)
		
		//배열을 선언하면서 크기를 설정
		int [] ar2=new int[4];
		
		//초기 데이터를 가지고 있는 경우 배열에 초기 데이터를 대입해서 바로 생성
		String [] nation= {"대한민국","뉴질랜드","중국","영국"};
		
		//배열이름.length를 하면 배열의 데이터 개수가 리턴됨
		System.out.printf("배열의 데이터 개수: %d\n", nation.length);
		
		//배열의 요소를 접근할 때는 배열이름[인덱스]
		//인덱스는 0부터 length-1까지
		//2번째 요소 출력
		System.out.printf("배열의 3번째 요소: %s\n", nation[2]);
		
		//배열의 다섯 번째 요소를 출력 
		//배열에는 데이터가 4개만 존재하는 상황
		//없는 인덱스에 접근하는 것이 됨
		//이런 경우 ArrayIndexOutOfBoundsException이 발생
		//System.out.printf("배열의 4번째 요소: %s\n", nation[4]);
		
		//배열의 데이터를 변경하고자 하면 배결 요소에 데이터를 대입
		nation[2]="일본";
		System.out.printf("배열의 3번째 요소: %s\n", nation[2]);
		
		//배열의 데이터를 삭제 - 배열이름에 null을 대입하면 됨
		//ar2는 사라지지 않고 있음 
		ar2=null;
		//System.out.printf("배열의 2번째 요소: %s\n", ar2[2]);
		
		System.out.printf("======================\n");
		
		int [] ar= {30,70,20,40};
		for(int i=0;i<3;i=i+1) {
			System.out.printf("%d\n", ar[i]);
		}
		
		nation=null;
		nation=new String[3];
		//nation= {"대한민국","뉴질랜드","중국"};	
		
		System.out.printf("배열의 3번째 요소: %s\n", nation[2]);


	}
}

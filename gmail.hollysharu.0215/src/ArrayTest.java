
public class ArrayTest {

	public static void main(String[] args) {
		//�迭�� �����ϰ� ���߿� �����͸� ����
		String [] catsGroup=new String[4];
		
		catsGroup[0]="�Ϸ�";
		catsGroup[1]="�ڽ�";
		catsGroup[2]="�丶";
		catsGroup[3]="����";

		//�迭�� ��� ���
		System.out.printf("%s\n", catsGroup[0]);
		System.out.printf("%s\n", catsGroup[1]);
		System.out.printf("%s\n", catsGroup[2]);
		System.out.printf("%s\n", catsGroup[3]);

		System.out.printf("=========================\n");
		
		//������ �����̳� ������ ������ ���� ������ �ݺ����� �̿�
		//�ڵ� ���� ���� ���̰� �ϳ��� �������� ó���� �� �ֱ� ������ ���������� ������ 
		
		//�迭�� ������ ������ ����� ���� �������� �ʰ� .length �̿� 
		for(int i=0; i<catsGroup.length; i=i+1) {
			System.out.printf("%s\n", catsGroup[i]);
		}
		
		System.out.printf("=========================\n");

		// .length(�迭�� ������ ����)�� ������ �����ϰ� �̿�
		//heap�� ������ �����Ͷ�� ����� ������ �Űܳ��� ����ϴ� ���� ���� 
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
		//for-each(��������)�� �̿��� �迭�� ������ ���� 
		//for(�ڷ��� ������ : �迭��) { ��� }; 
		for(String foreach : catsGroup) {
			System.out.printf("%s\n", foreach);
		}
*/		
		
		System.out.printf("=========================\n");
		
		//String [][] AnotherCatsGroup=new String[][]];
		
		//AnotherCatsGroup=
		
	}
}

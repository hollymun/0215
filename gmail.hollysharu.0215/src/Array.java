
public class Array {

	public static void main(String[] args) {
		//�迭�� ������ �� ���߿� �޸� �Ҵ��ϱ� 
		int [] ar1=null;
		//�迭�� �̸��� ���� ���(������ ������ ���� �� ���)
		//.�� �̿��ؼ� �ٸ� ����� ȣ���ϸ� NullPointerException�� �߻�
		//NullPointerException�� ������ ������ �����͸� �������� ���� ���¿��� �̿�
		//System.out.printf("������ ����: %d\n", ar1.length);
		
		ar1=new int[3];
		//��ó�� ����� �Ǹ� �� ��Ҵ� ���� 0�� ä���� (�Ǵ� �ٸ� �⺻�� 0.0 false null)
		
		//�迭�� �����ϸ鼭 ũ�⸦ ����
		int [] ar2=new int[4];
		
		//�ʱ� �����͸� ������ �ִ� ��� �迭�� �ʱ� �����͸� �����ؼ� �ٷ� ����
		String [] nation= {"���ѹα�","��������","�߱�","����"};
		
		//�迭�̸�.length�� �ϸ� �迭�� ������ ������ ���ϵ�
		System.out.printf("�迭�� ������ ����: %d\n", nation.length);
		
		//�迭�� ��Ҹ� ������ ���� �迭�̸�[�ε���]
		//�ε����� 0���� length-1����
		//2��° ��� ���
		System.out.printf("�迭�� 3��° ���: %s\n", nation[2]);
		
		//�迭�� �ټ� ��° ��Ҹ� ��� 
		//�迭���� �����Ͱ� 4���� �����ϴ� ��Ȳ
		//���� �ε����� �����ϴ� ���� ��
		//�̷� ��� ArrayIndexOutOfBoundsException�� �߻�
		//System.out.printf("�迭�� 4��° ���: %s\n", nation[4]);
		
		//�迭�� �����͸� �����ϰ��� �ϸ� ��� ��ҿ� �����͸� ����
		nation[2]="�Ϻ�";
		System.out.printf("�迭�� 3��° ���: %s\n", nation[2]);
		
		//�迭�� �����͸� ���� - �迭�̸��� null�� �����ϸ� ��
		//ar2�� ������� �ʰ� ���� 
		ar2=null;
		//System.out.printf("�迭�� 2��° ���: %s\n", ar2[2]);
		
		System.out.printf("======================\n");
		
		int [] ar= {30,70,20,40};
		for(int i=0;i<3;i=i+1) {
			System.out.printf("%d\n", ar[i]);
		}
		
		nation=null;
		nation=new String[3];
		//nation= {"���ѹα�","��������","�߱�"};	
		
		System.out.printf("�迭�� 3��° ���: %s\n", nation[2]);


	}
}

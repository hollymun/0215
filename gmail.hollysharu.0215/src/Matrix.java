
public class Matrix {

	public static void main(String[] args) {
/*		
		//��� ���� ũ�Ⱑ ������ 2���� �迭
		//��� �̸� 20�� 5�� �׷��� ������ �� �ִ� �迭�� ����
		//�ڷ��� [] [] �迭�̸� = new �ڷ��� [�ళ��] [������];
		String [][] names=new String[3][30];
		
		//�ະ�� ���� ũ�Ⱑ �ٸ� 2���� �迭 �����
		//0�׷� 28��, 1�׷� 17��, 2�׷� 30�� ���� 
		String [][] OtherNames=new String[3][];
		OtherNames[0]=new String[28];
		OtherNames[1]=new String[17];
		OtherNames[2]=new String[30];

		System.out.printf("%d\n",  OtherNames.length); //�� �� ��?
		System.out.printf("%d\n",  OtherNames[0].length); //[0]�� �� �� ��?
	//	System.out.printf("%d\n",  OtherNames[0][0].length);
		
		System.out.printf("======================\n"); 
		
		System.out.printf("%s\n",  OtherNames); //�迭�� ���� ���� 
		System.out.printf("%s\n",  OtherNames[0]); 
		System.out.printf("%s\n",  OtherNames[0][0]); 
		
		System.out.printf("======================\n"); 
		
		String [][] catsNDogs= {{"�Ϸ�","�ڽ�","������"},
							{"�丶","����"},
							{"ȣ��","����"}};
		
		int rowSize=catsNDogs.length;
		for(int i=0; i<rowSize;i=i+1) {
			int colSize=catsNDogs[i].length;
			for(int j=0;j<colSize;j=j+1) {
				System.out.printf("%5s", catsNDogs[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("======================\n"); 

		//���� ���Ÿ� �̿��ؼ� ���
		for(String [] temp:catsNDogs) {
			for(String imsi:temp) {
				System.out.printf("%5s",imsi);				
			}
			System.out.printf("@\n");
		}

		
		int [] ar= {17,26,35,44,53,62,71};
		//30 �̻��� �������� �հ�, ����, ���(�Ҽ� 2�ڸ����� ���)
		//������ �������� �� ������ �ʱ�ȭ
		int sum=0; //�հ� ������ ����  
		int cnt=0; //���� ������ ���� 
		
		for(int x : ar) {	//�迭�� ������ ��ȸ 
			if(x>60) {
				//if(x>90) ���� �ٲٸ� ������ cnt ���� 0�� �ǹǷ� X 
				sum=sum+x; //���� �հ� ���� ���� ���� �հ� 
				cnt=cnt+1; 	//������ �ϳ��� ����
			}
		}
		//�հ�� ������ ���� �� ����� �� ���� �ص� �Ǵϱ� for ���� �ۿ� �ۼ�  
		double avg=(double)sum/cnt;
		
		System.out.printf("�հ�:%d ����:%d ���: %.2f", sum, cnt, avg);
		
		
		System.out.printf("=========================\n");
		//�ִ� �ּ� ���ϱ� 
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
		System.out.printf("�ִ밪: %d  �ּҰ�: %d\n", max, min);
*/
		System.out.printf("=========================\n");
		//�迭 ��ġ�� 
		int [] ar1= {40,70,30,65,93,48,88};	 //7
		int [] ar2= {51, 73}; 					//2
		
		//2���� �����͸� ������ ���ο� �迭�� ���� /ar1 ������ ar2 ���� ��ġ�� 
		int [] merge=new int[ar1.length+ar2.length];

		//ù ��° �迭�� ������ �ű�� 
		for(int i=0; i<ar1.length; i=i+1) {
			merge[i]=ar1[i];
		}
		
		//�� ��° �迭�� ������ �ű�� 
		for(int i=0; i<ar2.length; i=i+1) {
			merge[ar1.length+i]=ar2[i];			//ar1 �ڿ� ar2�� ���ϵǾ�� �ϹǷ� ar1����+i
		}
		
		//ar1�� ar2�� �����͸� �ű� merge�� ��ü ������ ��� 
		for(int e:merge) {
			System.out.printf("%d\n", e);
		}

		System.out.printf("=========================\n");

	
		
		
	}
}
	

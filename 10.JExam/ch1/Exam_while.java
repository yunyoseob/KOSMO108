package a.b.c.ch1;

// 107 ��
// �ݸ� : for, while ���ǽĿ��� false �� ����ϸ� �ʵȴ�.
// �б⹮ : if �� ���ǽĿ��� false ����� �����ϴ�.
public class Exam_while {

	public static void main(String args[]) {
		
		boolean bool = false;
		while (bool){
			System.out.println(">>>");
		}

		// �������� 
		int num = 1;
		int sum = 0;
		int count = 0;

		while (num <= 10){
		
			count++;
			sum += num;
			
			System.out.println(count + "��° ���� >>> : " + sum + " ");
			if (sum > 20){				
				break;
			}

			num++;
		}

		System.out.println("1���� " + count + " ������ ���� " + sum + " �Դϴ�.");
		System.out.println(count + " �� ���� �߽��ϴ�.");
	}
}
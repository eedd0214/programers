package programers.com;
import java.util.*;
/*
 * ���ڿ�s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�
 * s�� ���� ��ҹ��ڷθ� �����Ǿ� ������ �빮�ڴ� �ҹ��ں����������� �����մϴ�.
 * 
 * str�� ���̰� 1�̻��� ���ڿ��Դϴ�.
 * 
 * s = Zbcdefg
 * return = gfedcbZ
 * 
 * 
 * ������ ����ִ� �迭 arr�� ��հ��� return �ϴ� �Լ�
 * arr�� ����1 �̻�, 100������ �迭 �Դϴ�.
 * arr ���Ҵ� -10000dltkd 10000������ ���� �Դϴ�.
 * 
 * arr= [1,2,3,4]
 * return=2.5
 * 
 */

class Solution{
	public char[] Solution1(String n) {
		char [] answer = new char[n.length()];
		n.getChars(0, n.length(), answer, 0);
		Arrays.sort(answer);
		
		return answer;
	}
	
	public double Solution2(int[] n) {
		double answer=0;
		double ans=0;
		for(int i=0;i<n.length;i++) {
			ans +=n[i];
		}
		answer=ans/n.length;
		
		
		return answer;
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {5,5};
		Solution s = new Solution();
		String n="ckdfAs";
		System.out.println(s.Solution2(a));
		System.out.println(s.Solution1(n));
	}

}

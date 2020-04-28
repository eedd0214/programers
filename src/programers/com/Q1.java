package programers.com;
import java.util.*;
/*
 * 문자열s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수
 * s는 영문 대소문자로만 구성되어 있으며 대문자는 소문자보다작은것을 간주합니다.
 * 
 * str은 길이가 1이상인 문자열입니다.
 * 
 * s = Zbcdefg
 * return = gfedcbZ
 * 
 * 
 * 정수를 담고있는 배열 arr의 평균값을 return 하는 함수
 * arr은 길이1 이상, 100이하인 배열 입니다.
 * arr 원소는 -10000dltkd 10000이하인 정수 입니다.
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

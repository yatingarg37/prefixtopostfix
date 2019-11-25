package assignments;

import java.util.Scanner;
import java.util.Stack;

public class pretopost {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		Stack stk= new Stack();
		char ch[]=str.toCharArray();
		int n= ch.length;
		for(int i =n-1;i>=0;i--) {
			if(ch[i]=='/' || ch[i]=='*'||ch[i]=='-'||ch[i]=='+') {
				String str1 = (String) stk.pop();
				String str2 = (String) stk.pop();
				str= str1+str2+ch[i];
				stk.push(str);
			}
			else {
				stk.push(ch[i]+"");
			}
		}

		System.out.print(str);

	}

}

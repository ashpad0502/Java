package TowersofHanoi;
import java.util.Scanner;

public class TowersofHanoi {  
	public void TowersOfHanoi(int n,char s,char d,char a)
	{
		if(n == 1)
		{
			System.out.println(s+" --> "+d);
			return;
		}
		
		TowersOfHanoi(n-1,s,a,d);
		System.out.println(s+" --> "+d);
		TowersOfHanoi(n-1,a,d,s);
		// System.out.println(a+" --> "+d);
	}
	public static void main(String[] args) {
		TowersofHanoi sc = new TowersofHanoi();
        Scanner scan = new Scanner(System.in);
        int n = 3;	//Input
        char s='A',a='B',d='C';
        sc.TowersOfHanoi(n,s,d,a);
        scan.close();
    }	
}  
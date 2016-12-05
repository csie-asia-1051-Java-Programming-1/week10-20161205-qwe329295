package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021028 蕭佑誠
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int d =scn.nextInt();
		float s = 1,w=1;
		if(d<=120){
			s=(d*2.10f);
			w=(d*2.10f);
			System.out.println("夏月"+s);
			System.out.println("非夏月"+w);
		}else if(d>120 && d<=330){
			s=((120*2.10f)+(d-120)*3.02f);
			w=((120*2.10f)+(d-120)*2.68f);
			System.out.println("夏月"+s);
			System.out.println("非夏月"+w);
		}else if(d>330 && d<=500){
			s=((120*2.10f)+((330-120)*3.02f)+((d-330)*4.39f));    
			w=((120*2.10f)+((330-120)*2.68f)+((d-330)*3.61f)); 
			System.out.println("夏月"+s);
			System.out.println("非夏月"+w);
		}else if(d>500 && d<=700){
			s=((120*2.10f)+((330-120)*3.02f)+((500-330)*4.39f)+(d-500)*4.97f);
			w=((120*2.10f)+((330-120)*2.68f)+((500-330)*3.61f)+(d-500)*4.01f);
			System.out.println("夏月"+s);
			System.out.println("非夏月"+w);
		}else if(d>700){
			s=((120*2.10f)+((330-120)*3.02f)+((500-330)*4.39f)+((700-500)*4.97f)+(d-700)*5.63f);
		    w=((120*2.10f)+((330-120)*2.68f)+((500-330)*3.61f)+((700-500)*4.01f)+(d-700)*4.50f);
		    System.out.println("夏月"+s);
			System.out.println("非夏月"+w);
		}
		

	}

}

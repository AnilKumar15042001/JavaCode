package string;

public class Concat {
	
	public static void concatMethod(String str,String str2)
	{
		System.out.println(str.concat(str2));
	}
	
	public static void plusOperator(String str,int num,int num2)
	{
		System.out.println(str+num);
		System.out.println(str+num+num2);
		System.out.println(num+str+num2);
		System.out.println(num+num2+str);
		System.out.println(str+num/num2);
		System.out.println(str+num*num2);
//		System.out.println(str+num-num2);//error
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		concatMethod("Anil"," Kumar");
	}

}

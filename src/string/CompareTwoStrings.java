package string;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Anil";
		String s2="Anil";
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
		String s3=new String("Anil");
		String s4=new String("Anil");
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		
		s2=s3;
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		boolean result=true;
		result="Anil"=="Anil";//true
		result=s2=="Anil";//false
		result=s2==s3;//true
		System.out.println(s1==s3);
	}

}

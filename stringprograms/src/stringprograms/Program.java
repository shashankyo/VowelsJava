package stringprograms;

public class Program {
public static void main(String[] args) {
	String str = "THis123java456class??!";
	int count = 0;
//	System.out.println(str);
//	str = str.replaceAll(" ", "");
//	System.out.println(str);
	//counting owels using tochar array
	//	char []ch =str.toCharArray();
//	for(int i = 0;i<ch.length;i++)
//	{
//		if(ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i'||ch[i] == 'o'||ch[i] == 'u')
//		{
//			count ++;
//			System.out.println(ch[i]);
//		}
//		
//	}
//	System.out.println("Thetotal number of vowels " + " present in string is"+count);


//	char []ch =str.toCharArray();
//	for(int i = 0;i<str.length();i++)
//	{
//		if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u')
//		{
//			count ++;
//			System.out.println(str.charAt(i));
//		}
//		
//	}
//	System.out.println("The total number of vowels " + " present in string is"+count);

//	for(int i = 0;i<str.length();i++)
//	{
//		if(!(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'))
//		{
//			count ++;
//			System.out.println(str.charAt(i));
//		}
//		
//	}
//	System.out.println("Thetotal number of vowels " + " present in string is"+count);

//	int mount = 0;
//	for(int i = 0;i<str.length();i++)
//	{
//		if(!(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'
//				||str.charAt(i) == 'o'||str.charAt(i) == 'u' || str.charAt(i) == ' ' || str.charAt(i) == '?' ||str.charAt(i) == ' ' || str.charAt(i) == '!'||str.charAt(i) == ' ' || str.charAt(i) == ' '))
//		{
//			count ++;
//			System.out.println(str.charAt(i));
//		}
//		else
//		{
//			mount ++;
//			System.out.println(str.charAt(i));
//		}
//		
//	}
//	System.out.println("The total number of consonants " + " present in string is "+count);
//	System.out.println("The total number of vowels " + " present in string is "+mount);

	
	for(int i=0;i<str.length(); i++) {
		if ((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
		{
			count ++;
			System.out.println(str.charAt(i));
		}
		System.out.println("The count is "+ count);
	}
}
}

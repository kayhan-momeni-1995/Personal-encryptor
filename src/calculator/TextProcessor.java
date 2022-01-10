package calculator;

import java.math.BigInteger;

public class TextProcessor
{
	public static String encrypt(String text, String password)
	{
		password+="*";
		password+=password;
		for (int i=1; i<password.length(); i+=2)
		{
			password=password.substring(0, i)+"-"+password.substring(i);
		}
		
		int length2 = password.length();
		BigInteger number2 = BigInteger.valueOf(0);
		for (int i=0; i<length2; i++)
		{
			char c = password.charAt(i);
			number2 = number2.add(pow(10000, i).multiply(BigInteger.valueOf((long)c)));
		}
		String result="";
		String word="";
		boolean s = false;
		int counter=0;
		int pointer=0;
		for (;;)
		{
			counter=0;
			pointer = text.indexOf(" ");
			if (pointer<0)
			{
				s=true;
				pointer=text.length();
			}
			word=text.substring(0, pointer);
			result+=Encryptor.word(word, number2);
			text=text.substring(pointer);
			while (!s && text.startsWith(" "))
			{
				text=text.substring(1);
				counter++;
			}
			int i=0;
			while (i<counter && !s)
			{
				result+="^";
				i++;
			}
			if (s)
				break;
		}
		result=result.substring(0, result.length());
		for (int i=1; i<result.length(); i++)
		{
			if (i%130==0)
			{
				result=result.substring(0, i)+"\n"+result.substring(i);
			}
		}
		return result;
	}
	public static String decrypt (String text, String pass)
	{
		pass+="*";
		pass+=pass;
		for (int i=1; i<pass.length(); i+=2)
		{
			pass=pass.substring(0, i)+"-"+pass.substring(i);
		}
		int length2 = pass.length();
		BigInteger number2 = BigInteger.valueOf(0);
		for (int i=0; i<length2; i++)
		{
			char c = pass.charAt(i);
			number2 = number2.add(pow(10000, i).multiply(BigInteger.valueOf((long)c)));
		}
		String result="";
		String word="";
		boolean s = false;
		int counter=0;
		int pointer=0;
		for (;;)
		{
			counter=0;
			pointer = text.indexOf("^");
			if (pointer<0)
			{
				s=true;
				pointer=text.length();
			}
			word=text.substring(0, pointer);
			result+=Decryptor.word(word, number2);
			text=text.substring(pointer);
			while (!s && text.startsWith("^"))
			{
				text=text.substring(1);
				counter++;
			}
			int i=0;
			while (i<counter && !s)
			{
				result+=" ";
				i++;
			}
			if (s)
				break;
		}
		result=result.substring(0, result.length());
		return result;
	}
	private static BigInteger pow (int x, int p)
	{
		if (p==0)
			return BigInteger.valueOf(1);
		else if (p==1)
			return BigInteger.valueOf(x);
		else
		{
			BigInteger result = BigInteger.valueOf(x);
			for (int i=1; i<p; i++)
			{
				result=result.multiply(BigInteger.valueOf(x));
			}
			return result;
		}
	}

}

package calculator;

import java.math.BigInteger;

public class Encryptor
{
	public static String word(String word)
	{
		int length = word.length();
		BigInteger number = BigInteger.valueOf(0);
		for (int i=0; i<length; i++)
		{
			char c = word.charAt(i);
			number = number.add(pow(9999, i).multiply(BigInteger.valueOf((long)c)));
		}
		String result = number.toString();
		result=result.replace("0", Changer.intToChar(0));
		result=result.replace("1", Changer.intToChar(1));
		result=result.replace("2", Changer.intToChar(2));
		result=result.replace("3", Changer.intToChar(3));
		result=result.replace("4", Changer.intToChar(4));
		result=result.replace("5", Changer.intToChar(5));
		result=result.replace("6", Changer.intToChar(6));
		result=result.replace("7", Changer.intToChar(7));
		result=result.replace("8", Changer.intToChar(8));
		result=result.replace("9", Changer.intToChar(9));

		for (int i=1; i<result.length(); i++)
		{
			if (i%130==0)
			{
				result=result.substring(0, i)+"\n"+result.substring(i);
			}
		}
		return result;
	}
	public static String word (String word, BigInteger number2)
	{
		int length = word.length();
		BigInteger number = BigInteger.valueOf(0);
		for (int i=0; i<length; i++)
		{
			char c = word.charAt(i);
			number = number.add(pow(9999, i).multiply(BigInteger.valueOf((long)c)));
		}
		
		String result = (number.add(number2)).multiply(number2).toString();
		result=result.replace("0", Changer.intToChar(0));
		result=result.replace("1", Changer.intToChar(1));
		result=result.replace("2", Changer.intToChar(2));
		result=result.replace("3", Changer.intToChar(3));
		result=result.replace("4", Changer.intToChar(4));
		result=result.replace("5", Changer.intToChar(5));
		result=result.replace("6", Changer.intToChar(6));
		result=result.replace("7", Changer.intToChar(7));
		result=result.replace("8", Changer.intToChar(8));
		result=result.replace("9", Changer.intToChar(9));

		for (int i=1; i<result.length(); i++)
		{
			if (i%130==0)
			{
				result=result.substring(0, i)+"\n"+result.substring(i);
			}
		}
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

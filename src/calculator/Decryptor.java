package calculator;

import java.math.BigInteger;

public class Decryptor
{
	public static String word(String word)
	{
		word=word.replace("\n", "");
		word=word.replace(" ", "");
		word=word.replace("a", Integer.toString(Changer.charToInt("a")));
		word=word.replace("b", Integer.toString(Changer.charToInt("b")));
		word=word.replace("c", Integer.toString(Changer.charToInt("c")));
		word=word.replace("d", Integer.toString(Changer.charToInt("d")));
		word=word.replace("e", Integer.toString(Changer.charToInt("e")));
		word=word.replace("f", Integer.toString(Changer.charToInt("f")));
		word=word.replace("g", Integer.toString(Changer.charToInt("g")));
		word=word.replace("h", Integer.toString(Changer.charToInt("h")));
		word=word.replace("i", Integer.toString(Changer.charToInt("i")));
		word=word.replace("j", Integer.toString(Changer.charToInt("j")));
		word=word.replace("k", Integer.toString(Changer.charToInt("k")));
		word=word.replace("l", Integer.toString(Changer.charToInt("l")));
		word=word.replace("m", Integer.toString(Changer.charToInt("m")));
		word=word.replace("n", Integer.toString(Changer.charToInt("n")));
		word=word.replace("o", Integer.toString(Changer.charToInt("o")));
		word=word.replace("p", Integer.toString(Changer.charToInt("p")));
		word=word.replace("q", Integer.toString(Changer.charToInt("q")));
		word=word.replace("r", Integer.toString(Changer.charToInt("r")));
		word=word.replace("s", Integer.toString(Changer.charToInt("s")));
		word=word.replace("t", Integer.toString(Changer.charToInt("t")));
		word=word.replace("u", Integer.toString(Changer.charToInt("u")));
		word=word.replace("v", Integer.toString(Changer.charToInt("v")));
		word=word.replace("w", Integer.toString(Changer.charToInt("w")));
		word=word.replace("x", Integer.toString(Changer.charToInt("x")));
		word=word.replace("y", Integer.toString(Changer.charToInt("y")));
		word=word.replace("z", Integer.toString(Changer.charToInt("z")));
		word=word.replace("A", Integer.toString(Changer.charToInt("A")));
		word=word.replace("B", Integer.toString(Changer.charToInt("B")));
		word=word.replace("C", Integer.toString(Changer.charToInt("C")));
		word=word.replace("D", Integer.toString(Changer.charToInt("D")));
		word=word.replace("E", Integer.toString(Changer.charToInt("E")));
		word=word.replace("F", Integer.toString(Changer.charToInt("F")));
		word=word.replace("G", Integer.toString(Changer.charToInt("G")));
		word=word.replace("H", Integer.toString(Changer.charToInt("H")));
		word=word.replace("I", Integer.toString(Changer.charToInt("I")));
		word=word.replace("J", Integer.toString(Changer.charToInt("J")));
		word=word.replace("K", Integer.toString(Changer.charToInt("K")));
		word=word.replace("L", Integer.toString(Changer.charToInt("L")));
		word=word.replace("M", Integer.toString(Changer.charToInt("M")));
		word=word.replace("N", Integer.toString(Changer.charToInt("N")));
		word=word.replace("O", Integer.toString(Changer.charToInt("O")));
		word=word.replace("P", Integer.toString(Changer.charToInt("P")));
		word=word.replace("Q", Integer.toString(Changer.charToInt("Q")));
		word=word.replace("R", Integer.toString(Changer.charToInt("R")));
		word=word.replace("S", Integer.toString(Changer.charToInt("S")));
		word=word.replace("T", Integer.toString(Changer.charToInt("T")));
		word=word.replace("U", Integer.toString(Changer.charToInt("U")));
		word=word.replace("V", Integer.toString(Changer.charToInt("V")));
		word=word.replace("W", Integer.toString(Changer.charToInt("W")));
		word=word.replace("X", Integer.toString(Changer.charToInt("X")));
		word=word.replace("Y", Integer.toString(Changer.charToInt("Y")));
		word=word.replace("Z", Integer.toString(Changer.charToInt("Z")));
		word=word.replace("?", Integer.toString(Changer.charToInt("?")));
		word=word.replace("!", Integer.toString(Changer.charToInt("!")));
		word=word.replace("+", Integer.toString(Changer.charToInt("+")));
		word=word.replace("=", Integer.toString(Changer.charToInt("=")));
		word=word.replace("@", Integer.toString(Changer.charToInt("@")));
		word=word.replace("#", Integer.toString(Changer.charToInt("#")));
		word=word.replace("$", Integer.toString(Changer.charToInt("$")));
		word=word.replace("%", Integer.toString(Changer.charToInt("%")));

		BigInteger number = BigInteger.valueOf(0);
		int length = word.length();
		for (int i=0; i<length; i++)
		{
			int j=length-i-1;
			BigInteger tmp = BigInteger.valueOf(Integer.valueOf(word.substring(j,j+1)));
			tmp=tmp.multiply(pow(10,i));
			number=number.add(tmp);
		}
		String result="";
		for (;;)
		{
			result+=String.valueOf((char)number.remainder(BigInteger.valueOf(9999)).intValue());
			number=number.divide(BigInteger.valueOf(9999));
			if (number.intValue()==0)
				break;
		}
		return result;
	}
	public static String word(String word, BigInteger number2)
	{
		word=word.replace("\n", "");
		word=word.replace(" ", "");
		word=word.replace("a", Integer.toString(Changer.charToInt("a")));
		word=word.replace("b", Integer.toString(Changer.charToInt("b")));
		word=word.replace("c", Integer.toString(Changer.charToInt("c")));
		word=word.replace("d", Integer.toString(Changer.charToInt("d")));
		word=word.replace("e", Integer.toString(Changer.charToInt("e")));
		word=word.replace("f", Integer.toString(Changer.charToInt("f")));
		word=word.replace("g", Integer.toString(Changer.charToInt("g")));
		word=word.replace("h", Integer.toString(Changer.charToInt("h")));
		word=word.replace("i", Integer.toString(Changer.charToInt("i")));
		word=word.replace("j", Integer.toString(Changer.charToInt("j")));
		word=word.replace("k", Integer.toString(Changer.charToInt("k")));
		word=word.replace("l", Integer.toString(Changer.charToInt("l")));
		word=word.replace("m", Integer.toString(Changer.charToInt("m")));
		word=word.replace("n", Integer.toString(Changer.charToInt("n")));
		word=word.replace("o", Integer.toString(Changer.charToInt("o")));
		word=word.replace("p", Integer.toString(Changer.charToInt("p")));
		word=word.replace("q", Integer.toString(Changer.charToInt("q")));
		word=word.replace("r", Integer.toString(Changer.charToInt("r")));
		word=word.replace("s", Integer.toString(Changer.charToInt("s")));
		word=word.replace("t", Integer.toString(Changer.charToInt("t")));
		word=word.replace("u", Integer.toString(Changer.charToInt("u")));
		word=word.replace("v", Integer.toString(Changer.charToInt("v")));
		word=word.replace("w", Integer.toString(Changer.charToInt("w")));
		word=word.replace("x", Integer.toString(Changer.charToInt("x")));
		word=word.replace("y", Integer.toString(Changer.charToInt("y")));
		word=word.replace("z", Integer.toString(Changer.charToInt("z")));
		word=word.replace("A", Integer.toString(Changer.charToInt("A")));
		word=word.replace("B", Integer.toString(Changer.charToInt("B")));
		word=word.replace("C", Integer.toString(Changer.charToInt("C")));
		word=word.replace("D", Integer.toString(Changer.charToInt("D")));
		word=word.replace("E", Integer.toString(Changer.charToInt("E")));
		word=word.replace("F", Integer.toString(Changer.charToInt("F")));
		word=word.replace("G", Integer.toString(Changer.charToInt("G")));
		word=word.replace("H", Integer.toString(Changer.charToInt("H")));
		word=word.replace("I", Integer.toString(Changer.charToInt("I")));
		word=word.replace("J", Integer.toString(Changer.charToInt("J")));
		word=word.replace("K", Integer.toString(Changer.charToInt("K")));
		word=word.replace("L", Integer.toString(Changer.charToInt("L")));
		word=word.replace("M", Integer.toString(Changer.charToInt("M")));
		word=word.replace("N", Integer.toString(Changer.charToInt("N")));
		word=word.replace("O", Integer.toString(Changer.charToInt("O")));
		word=word.replace("P", Integer.toString(Changer.charToInt("P")));
		word=word.replace("Q", Integer.toString(Changer.charToInt("Q")));
		word=word.replace("R", Integer.toString(Changer.charToInt("R")));
		word=word.replace("S", Integer.toString(Changer.charToInt("S")));
		word=word.replace("T", Integer.toString(Changer.charToInt("T")));
		word=word.replace("U", Integer.toString(Changer.charToInt("U")));
		word=word.replace("V", Integer.toString(Changer.charToInt("V")));
		word=word.replace("W", Integer.toString(Changer.charToInt("W")));
		word=word.replace("X", Integer.toString(Changer.charToInt("X")));
		word=word.replace("Y", Integer.toString(Changer.charToInt("Y")));
		word=word.replace("Z", Integer.toString(Changer.charToInt("Z")));
		word=word.replace("?", Integer.toString(Changer.charToInt("?")));
		word=word.replace("!", Integer.toString(Changer.charToInt("!")));
		word=word.replace("+", Integer.toString(Changer.charToInt("+")));
		word=word.replace("=", Integer.toString(Changer.charToInt("=")));
		word=word.replace("@", Integer.toString(Changer.charToInt("@")));
		word=word.replace("#", Integer.toString(Changer.charToInt("#")));
		word=word.replace("$", Integer.toString(Changer.charToInt("$")));
		word=word.replace("%", Integer.toString(Changer.charToInt("%")));

		BigInteger number = BigInteger.valueOf(0);
		int length = word.length();
		for (int i=0; i<length; i++)
		{
			int j=length-i-1;
			BigInteger tmp = BigInteger.valueOf(Integer.valueOf(word.substring(j,j+1)));
			tmp=tmp.multiply(pow(10,i));
			number=number.add(tmp);
		}
		
		
		number=(number.divide(number2)).add(number2.negate());
		String result="";
		for (;;)
		{
			result+=String.valueOf((char)number.remainder(BigInteger.valueOf(9999)).intValue());
			number=number.divide(BigInteger.valueOf(9999));
			if (number.intValue()==0)
				break;
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

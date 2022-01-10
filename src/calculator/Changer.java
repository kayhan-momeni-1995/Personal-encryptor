package calculator;

import java.util.Random;

public class Changer
{
	/* _______________________________________
	 *| 0	1	2	3	4	5	6	7	8	9 |
	 *|---------------------------------------|
	 *| a	b	c	d	e	f	g	h	i	j |
	 *| k	l	m	n	o	p	q	r	s	t |
	 *| u	v	w	x	y	z	A	B	C	D |
	 *| E	F	G	H	I	J	K	L	M	N |
	 *| O	P	Q	R	S	T	U	V	W	X |
	 *| Y	Z	?	!	+	=	@	#	$	% |
	 *|_______________________________________|
	 */
	static Random r = new Random();
	public static int charToInt (String c)
	{
		if (c.equals("a") || c.equals("k") || c.equals("u") || c.equals("E") || c.equals("O") || c.equals("Y"))
		{
			return 0;
		}
		else if (c.equals("b") || c.equals("l") || c.equals("v") || c.equals("F") || c.equals("P") || c.equals("Z"))
		{
			return 1;
		}
		else if (c.equals("c") || c.equals("m") || c.equals("w") || c.equals("G") || c.equals("Q") || c.equals("?"))
		{
			return 2;
		}
		else if (c.equals("d") || c.equals("n") || c.equals("x") || c.equals("H") || c.equals("R") || c.equals("!"))
		{
			return 3;
		}
		else if (c.equals("e") || c.equals("o") || c.equals("y") || c.equals("I") || c.equals("S") || c.equals("+"))
		{
			return 4;
		}
		else if (c.equals("f") || c.equals("p") || c.equals("z") || c.equals("J") || c.equals("T") || c.equals("="))
		{
			return 5;
		}
		else if (c.equals("g") || c.equals("q") || c.equals("A") || c.equals("K") || c.equals("U") || c.equals("@"))
		{
			return 6;
		}
		else if (c.equals("h") || c.equals("r") || c.equals("B") || c.equals("L") || c.equals("V") || c.equals("#"))
		{
			return 7;
		}
		else if (c.equals("i") || c.equals("s") || c.equals("C") || c.equals("M") || c.equals("W") || c.equals("$"))
		{
			return 8;
		}
		else
		{
			return 9;
		}
	}
	public static String intToChar (int i)
	{
		double rand = r.nextDouble();
		if (i==0)
		{
			if (rand<1f/6)
				return "a";
			else if (rand<2f/6)
				return "k";
			else if (rand<3f/6)
				return "u";
			else if (rand<4f/6)
				return "E";
			else if (rand <5f/6)
				return "O";
			else
				return "Y";
		}
		else if (i==1)
		{
			if (rand<1f/6)
				return "b";
			else if (rand<2f/6)
				return "l";
			else if (rand<3f/6)
				return "v";
			else if (rand<4f/6)
				return "F";
			else if (rand <5f/6)
				return "P";
			else
				return "Z";
		}
		else if (i==2)
		{
			if (rand<1f/6)
				return "c";
			else if (rand<2f/6)
				return "m";
			else if (rand<3f/6)
				return "w";
			else if (rand<4f/6)
				return "G";
			else if (rand <5f/6)
				return "Q";
			else
				return "?";
		}
		else if (i==3)
		{
			if (rand<1f/6)
				return "d";
			else if (rand<2f/6)
				return "n";
			else if (rand<3f/6)
				return "x";
			else if (rand<4f/6)
				return "H";
			else if (rand <5f/6)
				return "R";
			else
				return "!";
		}
		else if (i==4)
		{
			if (rand<1f/6)
				return "e";
			else if (rand<2f/6)
				return "o";
			else if (rand<3f/6)
				return "y";
			else if (rand<4f/6)
				return "I";
			else if (rand <5f/6)
				return "S";
			else
				return "+";
		}
		else if (i==5)
		{
			if (rand<1f/6)
				return "f";
			else if (rand<2f/6)
				return "p";
			else if (rand<3f/6)
				return "z";
			else if (rand<4f/6)
				return "J";
			else if (rand <5f/6)
				return "T";
			else
				return "=";
		}
		else if (i==6)
		{
			if (rand<1f/6)
				return "g";
			else if (rand<2f/6)
				return "q";
			else if (rand<3f/6)
				return "A";
			else if (rand<4f/6)
				return "K";
			else if (rand <5f/6)
				return "U";
			else
				return "@";
		}
		else if (i==7)
		{
			if (rand<1f/6)
				return "h";
			else if (rand<2f/6)
				return "r";
			else if (rand<3f/6)
				return "B";
			else if (rand<4f/6)
				return "L";
			else if (rand <5f/6)
				return "V";
			else
				return "#";
		}
		else if (i==8)
		{
			if (rand<1f/6)
				return "i";
			else if (rand<2f/6)
				return "s";
			else if (rand<3f/6)
				return "C";
			else if (rand<4f/6)
				return "M";
			else if (rand <5f/6)
				return "W";
			else
				return "$";
		}
		else
		{
			if (rand<1f/6)
				return "j";
			else if (rand<2f/6)
				return "t";
			else if (rand<3f/6)
				return "D";
			else if (rand<4f/6)
				return "N";
			else if (rand <5f/6)
				return "X";
			else
				return "%";
		}
	}
}

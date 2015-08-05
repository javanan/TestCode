package com.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexTest {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("\\\\\\d");
		Matcher matcher=pattern.matcher("\\0");
		System.out.println(matcher.matches());

	}

}

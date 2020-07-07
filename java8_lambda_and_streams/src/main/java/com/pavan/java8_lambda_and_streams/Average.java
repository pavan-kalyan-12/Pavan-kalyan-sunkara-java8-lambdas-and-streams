package com.pavan.java8_lambda_and_streams;

import java.util.*;
public class Average {
	public double avg(List<Integer> list)
	{
		return list.stream().mapToInt(number -> number.intValue()).average().getAsDouble();
	}
}
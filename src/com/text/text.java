


package com.text;
import java.util.*;
public class text
{
    public static void main(String[] args)
    {

    	//从键盘接收年龄
    	Scanner s = new Scanner(System.in);
    	System.out.print("请输入查询年龄： ");
    	int i = s.nextInt();
    	

    	if(i >= 150 || i <= 0) 
    	{
    		System.out.println("书输入无效年龄");
    	}else if(i >= 56) 
    	{
    		System.out.println("年龄段为：老年");
    	}
    	else if(i >= 36) 
    	{
    		System.out.println("年龄段为：中年");
    	}
    	else if(i >= 19) 
    	{
    		System.out.println("年龄段为：青年");
    	}
    	else if(i >= 11) 
    	{
    		System.out.println("年龄段为：少年");
    	}
    	else if(i >= 6) 
    	{
    		System.out.println("年龄段为：幼年");
    	}
    }
}
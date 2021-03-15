package com.dd;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonList {
	private static List<Person> all=new ArrayList<Person>();
	private static boolean re=false;
	
	
	public PersonList() throws IOException {
		Reader in=new FileReader("E:\\compitation_workspace\\Question1\\src\\team.txt");
		BufferedReader br=new BufferedReader(in);
		int id=0,one=0,two=0,three = 0,four=0,five=0;
		
		String line=null;
		while((line=br.readLine())!=null)
		{
			int n=0;
			String[] num=line.split(" ");
			for (String string : num) {
				n++;
				
				int a=Integer.valueOf(string);
				switch (n) {
				case 1:
					id=a;
					break;
				case 2:
					one=a;
					break;
				case 3:
					two=a;
					break;
				case 4:
					three=a;
					break;
				case 5:
					four=a;
					break;
				case 6:
					five=a;
					break;

				default:
					break;
				}
				
			}
			Person p=new Person(id, one, two, three, four, five);
		//	System.out.println("id"+id+", one"+one+", two"+two+", three"+three+", four"+four+", five"+five+"");
			all.add(p);
			
		}
		
	}
	
	
	
	public static void PrintList() {
		Iterator<Person> it=all.iterator();
		while(it.hasNext()) 
		{
			 Person obj = it.next();
			System.out.print(obj.getId()+" ");
			System.out.print(obj.getOne()+" ");
			System.out.print(obj.getTwo()+" ");
			System.out.print(obj.getThree()+" ");
			System.out.print(obj.getFour()+" ");
			System.out.print(obj.getFive()+" ");
			System.out.println();
			
		}

	}
	
	
	public static int teamscore() {
		int maxscore=0;//
		int[] player = null;//存储候选队员id值以及所占位置
		Person person=null;
		int i=0;
		Iterator<Person> it=all.iterator();
		while(i<5)
		{
			
			while(it.hasNext())
			{
				Person p=it.next();
				switch (i) {
				case 0:
					if(p.getOne() > maxscore) 
					{
						maxscore=p.getOne();
						player[i]=p.getId();
					}
					
					break;
				case 1:
					if(p.getTwo() > maxscore) 
					{
						maxscore=p.getTwo();
						player[i]=p.getId();
					}
					
					break;
				case 2:
					if(p.getThree() > maxscore) 
					{
						maxscore=p.getThree();
						player[i]=p.getId();
					}break;
				case 3:
					if(p.getFour() > maxscore) 
					{
						maxscore=p.getFour();
						player[i]=p.getId();
					}
					
					break;
				case 4:
					if(p.getFive() > maxscore) 
					{
						maxscore=p.getFive();
						player[i]=p.getId();
					}
					
					break;
					
					

				default:
					break;
				}
				
				
			}
			
			 re = CheckRepetition(player,player[i]);
			 if (re)
			 {
				
			 }else {
				 i++;
			 }
			
			
		}
			
		
		
		
		
		return maxscore;
	}



	public static boolean CheckRepetition(int[] player, int player2) {
		boolean re=false;
		for (int i = 0; i < player.length; i++) {
			if(player[i]==player2) {
				re=true;
				break;
			}
		}
		return re;
	}



	

}

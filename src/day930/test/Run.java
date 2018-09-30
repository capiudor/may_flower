package day930.test;

import java.util.ArrayList;
import java.util.List;

import day930.entity.Leader;

public class Run {

	public static void main(String[] args) {
		Leader leader = new Leader(1,"laowang","ÄÐ","40","123456"
				,"address","wangjianlin","root");
		List<Leader> list = new ArrayList<>();
		list.add(leader);
		for (Leader leader2 : list) {
			System.out.println(leader2.toString());
		}
	}
	
}

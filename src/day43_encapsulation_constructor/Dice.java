package day43_encapsulation_constructor;

import java.util.ArrayList;
import java.util.List;

public class Dice {

	public static void main(String[] args) {
		
		Job job1 = new Job();
		job1.setTitle("SDET");
		job1.setCompnay("Fannie Mea");
		job1.setAnnualSalary(120.00);
		
		System.out.println(job1.getCompnay());
		System.out.println(job1.getTitle());
		System.out.println(job1.getAnnualSalary());
		
	
	Job job2 = new Job("Java Developer");

	Job job3 = new Job("SDET", "Amazon", 130.000);
	
	System.out.println(job1.toString());
	System.out.println(job2.toString());
	System.out.println(job2.toString());
	
	
	ArrayList<Job>jobList = new ArrayList<>();
	jobList.add(job3);
	jobList.add(new Job("Scrum Master", "Google", 123.000));
	jobList.add(new Job("SDET", "Apple", 223.000));
	jobList.add(new Job("SDET", "Freddie Mac", 150.000));
	jobList.add(new Job("BA", "Ledos", 98.000));
	jobList.add(new Job("Senior QA Teaster", "Delta", 150.000));
	
	
	System.out.println(jobList);
	
	double maxSalary = 0;
	int highestIndex = -1;
	for (int i = 0; i < jobList.size(); i++) {
		if(jobList.get(i).getAnnualSalary() > maxSalary) {
			maxSalary = jobList.get(i).getAnnualSalary();
			highestIndex = i;
		}
	}
	
	Job bestJob = jobList.get(highestIndex);
	System.out.println("Highest salary: "+bestJob.toString());
	
	}

}

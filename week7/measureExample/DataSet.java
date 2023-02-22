package week7.measureExample;

import java.text.DecimalFormat;
import java.util.Arrays;

public class DataSet {
	
	//instance variables
	private Measure[] data;
	private String owningDept;
	private String dataTitle;
	
	//constructor
	public DataSet(Measure[] data, String owner, String title)
	{
		this.data = data;
		owningDept = owner;
		dataTitle = title;
	}
	
	public double findAverage()
	{
		
		double ave = 0;
		double total = 0;
		
		for (Measure item : data)
		{
			 
			total += item.getMeasure();
		}
		
		if (data.length > 0) 
			ave = total / data.length;
		
		return ave;
	}
	
	
	public Measure findMax()
	{
		Measure max = null;
		if (data.length > 0) {
			max = data[0];
			for (Measure item : data)
			{
				if (item.getMeasure() > max.getMeasure())
					max  = item;
			}
		}
		return max;
	}
	
	
	public Measure findMin()
	{
		Measure min = null;
		if (data.length > 0) {
			min = data[0];
			for (Measure item : data)
			{
				if (item.getMeasure() < min.getMeasure())
					min  = item;
			}
		}
		return min;
		
	}
	
	
	public void printDataStatisticsReport() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Report for Department " + owningDept + ": Data Set: " + dataTitle);
		System.out.println("Data Average: " + df.format(findAverage()));
		System.out.println("Maximum Value: " + findMax());
		System.out.println("Minimum Value: " + findMin());
		
		
	}
	
	public String toString() 
	{
		String out = owningDept + "\n" + Arrays.toString(data);
		return out;
	}


}

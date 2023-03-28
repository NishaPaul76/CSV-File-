package com.techpalle.csv;

import java.io.*;

public class CsvProject 
{
	public static void main(String[] args) 
	{
		try
		{
			PrintWriter pw = new PrintWriter (new File ("C:\\Users\\PAULRAJ\\OneDrive\\Csv.csv"));
			
			StringBuilder stringbuilder = new StringBuilder ();
			
			stringbuilder.append("Product Name").append(",").append("Product Price").append(",").append("Product Code")
			.append(",").append("Model Number").append(",").append("Product Category").append(",").append("Product Description").append("\n");	
			//1
			stringbuilder.append("Dell").append(",").append("$859.999").append(",").append("G15-5520")
			.append(",").append("G15-7900GRY-PUS").append(",").append("Laptops").append(",").append("Dell G15 is a windows 10 laptop with a 15.60-inchdisplay and powered by a core i5 processor+").append("\n");
			//2
			stringbuilder.append("Dell").append(",").append("$1774.20").append(",").append("D560245WIN9BE")
			.append(",").append("Dell G3 15 3579").append(",").append("Laptops").append(",").append("The Dell G3 15 3579 / G3579 is a high-performance notebook, but also an entry-level machine by gaming notebook standards").append("\n");
			//3
			stringbuilder.append("Dell").append(",").append("$919.00").append(",").append("D56175346WIN9BE")
			.append(",").append("5515").append(",").append("Laptops").append(",").append("Product Description").append("\n");
			//4
			stringbuilder.append("Dell").append(",").append("$1499.93").append(",").append("D560054WIN9S")
			.append(",").append("XPS 15").append(",").append("Laptops").append(",").append("The Dell XPS 15 is a top quality 15.6-inch laptop that comes with an IPS Screen ,12th generation intel core i9").append("\n");
			//5
			stringbuilder.append("Dell").append(",").append("$849.90").append(",").append("D569935Win9")
			.append(",").append("A17-7900BL-PUS").append(",").append("Laptops").append(",").append("Dell Alienware x17 R1 which has a 17.3 Display, It has an intel core i7").append("\n");
			//6
			stringbuilder.append("Dell").append(",").append("$1974.85").append(",").append("D560560WIN9BE")
			.append(",").append("D560560WIN9BE").append(",").append("Laptops").append(",").append("The dell gaming g15 5510 runs on windows 10 home edition.It has a 15.6-inch,1920x 1080 pixel").append("\n");
			//7
			stringbuilder.append("Dell").append(",").append("$1109.00").append(",").append("G15 5RE-A975GRY-PUS")
			.append(",").append("Dell G 1 5 5515").append(",").append("Laptops").append(",").append("It has a 15,6-inch gaming laptop with AMD 8-core ryzen 7 5800H processor").append("\n");
			//8
			stringbuilder.append("Dell").append(",").append("$699.00").append(",").append("463-5902")
			.append(",").append("463-5902").append(",").append("Laptop").append(",").append("It has a intell core i7-4800MQ processor,17,3-inch screen and upto 16GB of RAM").append("\n");
			//9
			stringbuilder.append("Dell").append(",").append("$7636.08").append(",").append("Alienware 15 R4")
			.append(",").append("Alienware 15 R4").append(",").append("Laptop").append(",").append("Intel core i7-10870H,8core 15.6-inch FHD Display").append("\n");
			//10
			stringbuilder.append("Dell").append(",").append("$1399.9").append(",").append("G7-1097")
			.append(",").append("G7-1097").append(",").append("Laptop").append(",").append("It has a 9th generation intel cor i7-9750H processor,6G Graphics card and 17.3 FHD Screen").append("\n");
			
			pw.write(stringbuilder.toString());
			
			pw.close();
			
			System.out.println("CSV File Created Successfully");
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}

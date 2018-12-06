package com.Practice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class walh 
{
	
	public static int hlc;
	public static int ccc;
	public static int helc;
	public static int carl;
	public static void main(String[] args) throws IOException, InvalidFormatException, InterruptedException
	{
	
	FileInputStream foo = new FileInputStream("D:\\WalletHub.xlsx");
	 Workbook lo = WorkbookFactory.create(foo);
	Sheet baa = lo.getSheet("Sheet1");	
	int rowaa = baa.getLastRowNum();
	System.out.println(rowaa);
	
	for (int i=1;i <= rowaa; i++)
	{
		
		 String user = baa.getRow(i).getCell(0).getStringCellValue();
		 System.out.println(user);
		 double HomeLoan = baa.getRow(i).getCell(1).getNumericCellValue();
		 System.out.println(HomeLoan);
		 if (HomeLoan>= 1)
				 {
			 walh.hlc = 1;
				 }
		 else
		 {
			 walh.hlc = 0;
		 }
		 double CreditCard = baa.getRow(i).getCell(2).getNumericCellValue();
		 System.out.println(CreditCard);
		 if(CreditCard>= 1)
		 {
			 walh.ccc = 1;
		 }
		 else
		 {
			 walh.ccc = 0;
		 }
		 double Heloc = baa.getRow(i).getCell(3).getNumericCellValue();
		 System.out.println(Heloc);
		 if(Heloc>= 1)
		 {
			 walh.helc = 1; 
		 }
		 else
		 {
			 walh.helc = 0;
		 }
		 double CarLoan = baa.getRow(i).getCell(4).getNumericCellValue();
		 System.out.println(CarLoan);
		 if(CarLoan>= 1)
		 {
			 walh.carl = 1;
		 }
		 else
		 {
			 walh.carl = 0;
		 }
		 // These won't be considered in any loan type or Total account
		 double Unknown = baa.getRow(i).getCell(5).getNumericCellValue();		 
		 double Collections = baa.getRow(i).getCell(6).getNumericCellValue();
		 //TotalAccount
		double totalAccount = HomeLoan+CreditCard+Heloc+CarLoan;
		 //Calling LoanAccount Function
		 int loanTypeCount = hlc+ccc+helc+carl;
		 System.out.println(loanTypeCount);	 
	if (totalAccount >20 || loanTypeCount >=4)
			{
		
		String accountDiversityGrade = "A";
		System.out.println(user+"LoanTypeCountis "+loanTypeCount+"TotalAccountis "+totalAccount+"accountDiversityGrade "+accountDiversityGrade);
			}
	else if(totalAccount >10 || loanTypeCount==3)
	{
	
		String accountDiversityGrade = "B";
		System.out.println(user+"LoanTypeCountis "+loanTypeCount+"TotalAccountis "+totalAccount+"accountDiversityGrade "+accountDiversityGrade);	
	}
	else if(totalAccount >=5 || loanTypeCount==2)
	{
		
		String accountDiversityGrade = "C";
		System.out.println(user+"LoanTypeCountis "+loanTypeCount+"TotalAccountis "+totalAccount+"accountDiversityGrade "+accountDiversityGrade);		
	}
	else if (totalAccount >0 || loanTypeCount==1)
	{
		
		String accountDiversityGrade = "D";
		System.out.println(user+"LoanTypeCountis "+loanTypeCount+"TotalAccountis "+totalAccount+"accountDiversityGrade "+accountDiversityGrade);		
		
	}
	}
	}

}


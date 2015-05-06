/* $Id: ParagraphSplitter.java 2015-05-06 19:56:08Z 
 * Copyright (C) 2015 BenaBoy>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */
import java.io.*;
import java.util.Scanner;

public class ParagraphSplitter{

	public static void main(String args[]){
		Scanner scanner = null, userInput = null;		
		String filename = null, paragraph = null;
		char yes;
		boolean exit = false;
		
		System.out.println("***************************************************************************");
		System.out.println("*************************** Paragraph Splitter ****************************");	
		System.out.println("***************************************************************************\n");

		while(!exit){
			try{
				userInput = new Scanner(System.in);
				System.out.print("Please enter a qualified filename for the input 1-liner e.g.[input.txt]: ");
				filename = userInput.nextLine();

				scanner = new Scanner(new File(filename));
				paragraph = scanner.useDelimiter("\\Z").next();	
	
				System.out.println("\n[Split Paragraph]----------------------\n");
				System.out.print(paragraph);
				System.out.println("\n---------------------------------------\n");			

				System.out.print("Do you wish to continue? [Y/y]: ");
				yes = userInput.nextLine().charAt(0);
				exit = (yes == 'y' || yes == 'Y')? false : true;		
			}
			catch(FileNotFoundException fnfex){
				System.out.println(fnfex);
				System.out.print("Do you wish to continue? [Y/y]: ");
				yes = userInput.nextLine().charAt(0);
				exit = (yes == 'y' || yes == 'Y')? false : true;
			}
			catch(Exception ex){
				System.out.println(ex);
				System.out.print("Do you wish to continue? [Y/y]: ");
				yes = userInput.nextLine().charAt(0);
				exit = (yes == 'y' || yes == 'Y')? false : true;
			}
		
			if(scanner != null){				
				scanner.close();
			}
			if(userInput != null){
				userInput.close();
			}
		}
		
		System.out.println(":) bye. \n");
	}

}

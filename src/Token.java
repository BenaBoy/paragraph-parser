/* $Id: Token.java 2015-05-09 16:53:08Z 
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
 
 public class Token{
 	// Identifiers for Terminal tokens
 	public static final int EPSILON = -1;
 	public static final int EOF = 0;
 	public static final int SB = 1;
 	public static final int INITIAL = 2;
 	public static final int SALUTATION = 3;
 	public static final int WORD = 4;
 	
 	private String payload;
 	private int type;
 	private int pos;
 	
 	public Token(){
 		this.payload = null; // rather redundant
 		this.type = Token.EPSILON;
 		this.pos = -1;
 	}
 	
 	public Token(String load, int type, int index){
 		this.payload = load;
 		this.type = type;
 		this.pos = index;
 	}
 	
 	// Setters
 	public void SetPayload(String load){
 		this.payload = load;
 	}
 	
 	public void SetType(int type){
 		this.type = type;
 	}
 	
 	public void SetPos(int index){
 		this.pos = index;
 	}
 	
 	//Getters
 	public String GetPayload(){
 		return this.payload;
 	}
 	
 	public int GetType(){
 		return this.type;
 	}
 	
 	public int GetPos(){
 		return this.pos;
 	}
 }

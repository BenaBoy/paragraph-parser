/* $Id: TokenTest.java 2015-05-09 17:13:08Z 
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
 

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 *	Tests for {@link Token}.
 *
 *	@author BenaBoy
 */

public class TokenTest{
	private Token unit;

	@Before
	public void setup(){
		unit = new Token();
	}

	@Test	//[1]
	public void testDefaultConstructorAndGetterMethod(){ // Madness!		
		assertEquals("failure - Token() failed to set type to EPSILON",Token.EPSILON,unit.GetType());
	}	

}

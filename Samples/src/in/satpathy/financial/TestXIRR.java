/*
 *  TestXIRR.java
 *  Copyright (C) 2005 Gautam Satpathy
 *  gautam@satpathy.in
 *  www.satpathy.in
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package in.satpathy.financial;

/*
 *  Imports
 */
import java.util.GregorianCalendar;

/**
 * @author : gsatpath
 * @version : 1.0.0 Date: Oct 20, 2005, Time: 4:39:25 AM
 */
public class TestXIRR {

	/**
	 *
	 *  @param args
	 */
	public static void main( String[] args ) {
		log( "Testing XIRR..." ) ;

//		GregorianCalendar dateStart = new GregorianCalendar( 1899, 11, 30 ) ;
		GregorianCalendar dateEnd = new GregorianCalendar( 2005, 9, 20 ) ;
        int daysBetween = XIRRData.getExcelDateValue( dateEnd ) ;
		log( "Days Between = " + daysBetween ) ;

//		"Let us assume that the cells A1:A5 contain the numbers -6000, "
//		"2134, 1422, 1933, and 1422, and the cells B1:B5 contain the "
//		"dates \"1999-01-15\", \"1999-04-04\", \"1999-05-09\", "
//		"\"2000-03-12\", and \"2000-05-1\". Then\n"
//		"XIRR(A1:A5,B1:B5) returns 0.224838. "
		double[]    values  = new double[7] ;
		double[]    dates   = new double[7] ;
		/*  values[0]           = -5400000 ;
		values[1]           = 1800000 ;
		values[2]           = 6613944.43 ;
		values[3]           = -8433944.43 ;
		values[4]           = 9536367.13;
		values[5]           = -4446062.65 ;
		values[6]           =-749566.9370012 ; */
		
		/* values[0]           = -356250 ;
		values[1]           = 495000 ;
		values[2]           = -96609.09543 ;
		dates[0]            = XIRRData.getExcelDateValue( new GregorianCalendar(2014, 0, 12) ) ;
		dates[1]            = XIRRData.getExcelDateValue( new GregorianCalendar(2014, 5, 01) ) ;
		dates[2]            = XIRRData.getExcelDateValue( new GregorianCalendar(2014, 5, 01) ) ;*/
		
		values[0]           = -784000 ;
		values[1]           = -168000 ;
		values[2]           = -145000 ;
		values[3]           = 1200000 ;
		values[4]           = -90000;
		values[5]           = -75006.03600000001; 
				
		dates[0]            = XIRRData.getExcelDateValue( new GregorianCalendar(2012,5, 07) ) ;
		dates[1]            = XIRRData.getExcelDateValue( new GregorianCalendar(2012,6, 21) ) ;
		dates[2]            = XIRRData.getExcelDateValue( new GregorianCalendar(2012,8, 05) ) ;
		dates[3]            = XIRRData.getExcelDateValue( new GregorianCalendar(2012,10, 05) ) ;
		dates[4]            = XIRRData.getExcelDateValue( new GregorianCalendar(2012,11,17) ) ;
		dates[5]            = XIRRData.getExcelDateValue( new GregorianCalendar(2013,0,31));

		
		
	 	/* dates[0]            = XIRRData.getExcelDateValue( new GregorianCalendar(2013, 6, 11) ) ;
		dates[1]            = XIRRData.getExcelDateValue( new GregorianCalendar(2013, 11, 2) ) ;
		dates[2]            = XIRRData.getExcelDateValue( new GregorianCalendar(2014,7, 2) ) ;
		dates[3]            = XIRRData.getExcelDateValue( new GregorianCalendar(2014,9, 10) ) ;
		dates[4]            = XIRRData.getExcelDateValue( new GregorianCalendar(2015, 3, 15) ) ;
		dates[5]            = XIRRData.getExcelDateValue( new GregorianCalendar(2015,5, 11) ) ;
		dates[6]            = XIRRData.getExcelDateValue( new GregorianCalendar(2016,0,26) ) ; */
		
		
		XIRRData data       = new XIRRData( 6,0.5, values, dates ) ;
		double xirrValue = XIRR.xirr( data ) ;
        log( "XIRR = " + xirrValue ) ;

		log( "XIRR Test Completed..." ) ;
	}


	/**
	 *
	 * @param message
	 */
	public static void log( String message ) {
		System.out.println( message ) ;
	}

}   /*  End of the TestXIRR class. */
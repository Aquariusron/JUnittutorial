package jp.co.junit4.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestPoi2 {
	final static String PATH = " C:\\sample.xls ";
nit	public static void main (String args[] ) {

		try {
			File f = new File( PATH );
			InputStream is = new FileInputStream( f );
			Workbook wb = WorkbookFactory.create( is );
			is.close();

			Sheet s = wb.getSheetAt( 0 );
			Row r = s.getRow( 3 );
			Cell c = r.getCell( 0 );

			c.setCellValue(" てすと ");

			OutputStream os = new FileOutputStream( f );
			wb.write( os );

		} catch( FileNotFoundException e ) {
			System.out.println( e );

		} catch( IOException e ) {
			System.out.println( e );

		} catch( InvalidFormatException e ) {
			System.out.println( e );

		}

	}

}

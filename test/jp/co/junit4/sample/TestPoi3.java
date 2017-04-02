package jp.co.junit4.sample;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class TestPoi3 {
	final static String PATH = "C:\\opt\\sample2.xls";

	public static void main (String args[] ) {
		Workbook wb = new HSSFWorkbook();
		Sheet st = wb.createSheet("Sample");
		Row row;
		Cell cell;

		for(int i = 0; i < 5; i++) {
			row = st.createRow( i );
			for (int j = 0; j < 5; j++ ){
				cell = (Cell)row.createCell( j );
				cell.setCellValue("テスト");
				// cell.setCellType(Cell.CELL_TYPE_STRING);
			}
		}

		FileOutputStream out = null;

		try {
			out = new FileOutputStream( PATH );
			wb.write( out );
		} catch(IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				out.close();
			} catch(IOException e) {
				System.out.println(e.toString());
			}
		}


	}

}

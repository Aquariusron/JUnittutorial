/*
 *Model of POI .
 *20170331
 */

package jp.co.junit4.sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TestPoi {
	// メンバの定義
	public final static String EXCEL_PATH = " D:\\opt\\test.xls ";
	public final static String EXCEL_SHEET_NAME = " シ－ト1 ";

	public static void main(String args[]) {

		try {

			// ResourceFileLocatorはパッケージのAPIなので適当なデフォルトAPIに書き換える
			InputStream excelFile = ResourceFileLocator.getResourceInputStream(EXCEL_PATH);
			HSSFWorkbook workbook = new HSSFWorkbook(excelFile);
			HSSFSheet sheet = workbook.getSheet(EXCEL_SHEET_NAME);

				for (int i = 0; i < 2; i++ ) {
					HSSFRow row = sheet.getRow( i );

					for (int j = 0; j < 3; j++) {
						HSSFCell cell = row.getCell( j );
						System.out.println(cell.toString());
					}
				}

				workbook.close();
				excelFile.close();

		} catch (FileNotFoundException e ) {
			e.printStackTrace();

//		} catch (FileUtilException e ) {
//			e.printStackTrace();

		} catch (IOException e ) {
			e.printStackTrace();
		}
	}

}

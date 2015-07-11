/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package writer;
import java.io.File; 
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Writer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BiffException, IOException {
       
        File f = new File("data.xls");
        Workbook wb= Workbook.getWorkbook(f);
        Sheet s =wb.getSheet(0);
        int row =s.getRows();
        int col=s.getColumns();
        for (int i = 1; i < row; i++) {
            for (int j = 1; j <col; j++) {
                Cell c =s.getCell(j,i);
                System.out.print("  "+c.getContents());
            }System.out.println("");
        }
        Cell l =s.getCell(0,1);
        
        
        
//        int ll=Integer.valueOf(   l.getContents());
//        System.out.println(""+ll);
//    
        
    }
    
}

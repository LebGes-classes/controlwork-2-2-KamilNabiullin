import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


public class ToExcel {
    public void saveProgramsToExcel(List<Program> programs, String filePath) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Programs");

        int rowNum = 0;
        Row headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("Channel");
        headerRow.createCell(1).setCellValue("Time");
        headerRow.createCell(2).setCellValue("Title");

        for (Program program : programs) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(program.getChannel());
            row.createCell(1).setCellValue(program.getTime().toString());
            row.createCell(2).setCellValue(program.getTitle());
        }

        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }





}
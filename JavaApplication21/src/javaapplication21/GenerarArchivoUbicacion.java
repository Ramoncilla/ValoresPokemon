/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Ramonella
 */
public class GenerarArchivoUbicacion {

    ListaPokemons listaP;

    public GenerarArchivoUbicacion(ListaPokemons lista) {
        this.listaP = lista;
    }

    public void comparar() throws IOException {
        String contenido = "";
        File excelFile = new File("C:\\Users\\Ramonella\\Desktop\\ubicacion\\archivo.xlsx");
        FileInputStream fis = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIt = sheet.iterator();
        int cont = 0;
        int idPok;
        while (rowIt.hasNext()) {
            Row row = rowIt.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            String linea = "";
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cont == 3) {
                    idPok = listaP.obtenerId(cell.toString());
                    if (idPok != -1) {
                        linea += idPok + ", ";
                    } else {
                        linea += cell.toString() + "____, ";
                    }
                } else {
                    linea += (cell.toString() + ",");
                }
                cont++;
            }
            cont = 0;
            contenido += linea + "\n";
            linea = "";
        }
        workbook.close();
        fis.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Ramonella\\Desktop\\Salidas\\ubicacion.csv"));
        writer.write(contenido);
        writer.close();
        System.out.println("Listo");
    }

    public void comparar2() throws IOException {
        String contenido = "";
        File excelFile = new File("C:\\Users\\Ramonella\\Desktop\\ubicacion\\aprendidos.xlsx");
        FileInputStream fis = new FileInputStream(excelFile);

        // we create an XSSF Workbook object for our XLSX Excel File
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        // we get first sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        // we iterate on rows
        Iterator<Row> rowIt = sheet.iterator();
        int cont = 0;
        int idPok;
        while (rowIt.hasNext()) {
            Row row = rowIt.next();

            // iterate on cells for the current row
            Iterator<Cell> cellIterator = row.cellIterator();
            String linea = "";
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cont == 1) {
                    idPok = listaP.obtenerId(cell.toString());
                    if (idPok != -1) {
                        linea += idPok + ", ";
                    } else {
                        linea += cell.toString() + "____, ";
                    }
                } else {
                    linea += (cell.toString() + ",");
                }
                cont++;
            }
            cont = 0;
            contenido += linea + "\n";
            linea = "";
        }

        workbook.close();
        fis.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Ramonella\\Desktop\\Salidas\\pokemon_movimiento.csv"));
        writer.write(contenido);

        writer.close();
        System.out.println("Listo");
    }

    public void comparar3() throws IOException {
        String contenido = "";
        File excelFile = new File("C:\\Users\\Ramonella\\Desktop\\ubicacion\\aprendidosCambiarId.xlsx");
        FileInputStream fis = new FileInputStream(excelFile);
        // we create an XSSF Workbook object for our XLSX Excel File
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        // we get first sheet
        XSSFSheet sheet = workbook.getSheetAt(0);

        // we iterate on rows
        Iterator<Row> rowIt = sheet.iterator();
        int cont = 0;
        int idPok;
        while (rowIt.hasNext()) {
            Row row = rowIt.next();

            // iterate on cells for the current row
            Iterator<Cell> cellIterator = row.cellIterator();
            String linea = "";
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if (cont == 0) {
                    String val = cell.toString();
                    double num = Double.parseDouble(val);
                    int num2 = (int) num;
                    idPok = listaP.obtenerId(num2 + "");
                    if (idPok != -1) {
                        linea += idPok + ", ";
                    } else {
                        linea += cell.toString() + "____, ";
                    }
                } else {
                    linea += (cell.toString() + ",");
                }
                cont++;
            }
            cont = 0;
            contenido += linea + "\n";
            linea = "";
        }

        workbook.close();
        fis.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Ramonella\\Desktop\\Salidas\\pokemon_movimientoID.csv"));
        writer.write(contenido);

        writer.close();
        System.out.println("Listo");
    }

}

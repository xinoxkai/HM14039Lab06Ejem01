/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaBDFormularios;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PRN-315
 */
public class ProductoTableModel extends AbstractTableModel {
    ArrayList<Producto> productos=new ArrayList<>();
    
    @Override
    public int getRowCount(){
        return productos.size();
    }
    
    @Override
    public int getColumnCount(){
        return 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Producto producto = productos.get(rowIndex);
        Object valor = null;
        switch(columnIndex){
            case 0: valor = producto.codigo;
                break;
            case 1: valor = producto.nombre;
                break;
            case 2: valor = producto.cantidadExistencia;
                break;
            case 3: valor = producto.precioUnitario;
        }
        return valor;
    }
    
}

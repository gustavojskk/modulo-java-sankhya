package sankhya;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author gustavo
 */
public class color extends DefaultTableCellRenderer{
public color(){}

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel laber = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            /* É SETADO O BACKGROUD COLOR RED CASO A VALIDAÇÃO DO IF FOR 
            VERDADEIRA PINTARA A TABELA COM CINZA CLARO, CASO A VALIDAÇÃO FOR
            FALSA A TABELA SERÁ PINTADA DE VERMELHO POIS O CAMPO NÃO ESTÁ PREENCHIDO*/
        Color background = Color.RED;
        Object objeto = table.getValueAt(row, 2);

        /*CASO O CAMPO OBSERVAÇÃO ESTIVER PREENCHIDO NA TABELA, IRÁ ME RETORNAR COM A COR CINZA*/
        try {
            double nota = Double.parseDouble(objeto.toString());
            if (nota != ' ') {
                background = Color.LIGHT_GRAY;
            }

        } catch (NumberFormatException e) {
        }

        laber.setBackground(background);
        return laber;
    }
    
}

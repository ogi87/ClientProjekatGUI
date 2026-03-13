package rs.ac.bg.fon.ps.client.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.ps.common.domain.ZubarKvalifikacija;

public class ZubarKvalifikacijaTableModel extends AbstractTableModel {

    private List<ZubarKvalifikacija> lista;
    private final String[] kolone = {"Zubar", "Kvalifikacija", "Datum sticanja"};

    public ZubarKvalifikacijaTableModel() {
        lista = new ArrayList<>();
    }

    public void setLista(List<ZubarKvalifikacija> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }

    public ZubarKvalifikacija getAt(int row) {
        return lista.get(row);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ZubarKvalifikacija zk = lista.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return zk.getZubar().getIme() + " " + zk.getZubar().getPrezime();
            case 1:
                return zk.getKvalifikacija().getNaziv();
            case 2:
                return zk.getDatumSticanja();
            default:
                return "N/A";
        }
    }
}
import javax.swing.JOptionPane;

public interface Buscar {

	default Producto BuscarProducto(int indice) {
		if (Stock.getInstancia().isEmpty()) {
			JOptionPane.showMessageDialog(null,"Vacia");
			return null;
		}else {
			Producto encontrado = null;
			try {
				encontrado = Stock.getInstancia().get(indice);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No existe");
			}
			return encontrado;
		}
		
	}
	
}

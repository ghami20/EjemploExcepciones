import javax.swing.JOptionPane;

public interface ControlarStock {

	default void IngresarProducto() {
		String nombre = JOptionPane.showInputDialog("Ingrese producto");
		int precio=0;
		boolean flag;
		do {
			flag= false;
			try {
				precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio"));
				flag = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "No es nùmero");
			} 
		} while (!flag);
		
		Stock.getInstancia().add(new Producto(nombre,precio));
		
	}
	
}

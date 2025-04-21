import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		Empleado abril = new Empleado("Abril");
		abril.IngresarProducto();
		int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese id a buscar"));
		JOptionPane.showMessageDialog(null, abril.BuscarProducto(buscar));
		
//		boolean flag;
//		do {
//			flag= false;
//			try {
//				int num =Integer.parseInt(JOptionPane.showInputDialog("Ingrese num"));
//				int div =1/ num;
//				flag = true;
//			} catch (NumberFormatException e) {
//				JOptionPane.showMessageDialog(null, "No es nùmero");
//			} catch (ArithmeticException e) {
//				JOptionPane.showMessageDialog(null, "No puede divir por cero");
//			}catch(Exception e){
//				JOptionPane.showMessageDialog(null, "Generico");
//			}
//		} while (!flag);
		JOptionPane.showMessageDialog(null, "Programa sigue");
	
		
		
		
	}
}

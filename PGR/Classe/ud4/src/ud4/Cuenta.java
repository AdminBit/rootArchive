package ud4;

public class Cuenta {

		private String titular;
		private double cantidad;
	
		// construcor 1
		public Cuenta(String nombre) {
			this.titular=nombre;
			this.cantidad=0;
		}
		//construcotr 2
		public Cuenta(String nombre,double saldo) {
			this.titular=nombre;
			this.cantidad=saldo;
		}

		
		//getters and setters
		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public double getCantidad() {
			return cantidad;
		}

		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		
		//
		@Override
		public String toString() {
			return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
		}
		
		
		public void ingresar(double cantidad) {
			if(cantidad>0) {
				this.cantidad+=cantidad;
			}
		}
		public void retirar (double cantidad) {
			if(this.cantidad - cantidad >=0) {
				this.cantidad -=cantidad;
			}else {
				System.out.println("No puedes hacer la operacion");
			}
		}
		
		
}

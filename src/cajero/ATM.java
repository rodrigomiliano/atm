package cajero;

import java.util.Scanner;

import cliente.Usuario;
import producto.Cuenta;
import sucursal.Banco;

public class ATM {
	
	private static final Cuenta Scanner = null;
	private Banco banco;
	private Dispensador dispensador;
	private Cuenta cuentaOperacion;
	
	public ATM() {
		
	}
	
	public ATM(Banco banco) {
		super();
		this.banco = banco;
		this.dispensador = new Dispensador();
	}
	
	public Double mostrarSaldo() {
		return this.dispensador.getMontoDispenser();
	}

	/*
	public boolean autenticar(int nroCuenta, int NIP) {
		// llena cuentaOperacion con lo que recibe de validarCuenta
		cuentaOperacion = banco.validarCuenta(nroCuenta, NIP);
		if(cuentaOperacion == null) {
			return false;
		}else {
			return true;
		}
		
	}
	*/
	public Double consultarSaldo() {
		return cuentaOperacion.verSaldo();
	}
	/*
	public Double depositar(double deposito) {
		return cuentaOperacion.depositarFondo(deposito);
	}
	
	public Double retirar(double retiro) {
		
		if(dispensador.haySaldoDisponible(retiro)) {
			return cuentaOperacion.retirarEfectivo(retiro);			
		}else {
			//llamar a pantalla para mostrar que el ATM no tiene
			//saldo suficiente para el retiro que quiere hacer.
		}
	}
	*/
	public void cerrarSesion() {
		cuentaOperacion = null;
	}
	
	public boolean sesionActiva() {
		return cuentaOperacion == null; //Revisar si hace lo que creo que hace.
	}
	
	
	
	
	
	
	
	
	
	
	
	/* ------------------------Prueba 1 de menu del ATM ------------------------------ */
	
	
	
	 private int leeNumero(){
	        Scanner menu = new Scanner(System.in);
	        int numero = menu.nextInt();
	        return numero;
	    }
	   /* 
	    public Cuenta entrada(){ VER COMO ARMAR
	        Cuenta usuarioATM = entrada();
	        System.out.println("Ingrese el ID del usuario");
	        int numero = leeNumero();
	        if ((numero>=1) && (numero <=10)){
	            int numeroCuenta = usuarioATM.getNumeroCuenta();
	            return usuarios[numero-1];
	        }else{
	            System.out.println("Entrada inválida");
	            System.out.println("Ingrese nuevamente el ID");
	            return entrada();
	        } 
	        
	    }
	    */
	    public void menu(){    	
	    	
	        System.out.println("Bienvenido: Por favor ingrese el nº de cuenta");	        
	        System.out.println("Ingrese su NIP asociado a su nº de cuenta");
	        int numero = leeNumero();
	        
	   	        
	        /*if ((numero>=1) && (numero <=10)){ VER COMO ARMAR
	            int numeroCuenta = usuarioATM.getNumeroCuenta();
	            return usuarios[numero-1];
	        }else{
	            System.out.println("Entrada inválida");
	            System.out.println("Ingrese nuevamente el ID");
	            return entrada();
	        } 	    	
	    	*/   	 	
	    		        
	        int num = 0;
	        do{
	        System.out.println("Menú Principal");
	        System.out.println("1. Ver el Balance actual\n");
	        System.out.println("2. Retirar Dinero\n");
	        System.out.println("3. Depositar Dinero\n");        
	        System.out.println("4. Salir\n");
	        System.out.print("Ingrese su selección.");
	        num = leeNumero();
	        Cuenta usuarioATM = null;
			switch (num){
	            case 1:
	                double balance = usuarioATM.verSaldo();
	                System.out.print("El saldo es de: ");
	                System.out.println(balance);
	                System.out.print("\n\n\n");
	                break;
	            case 2:
	                System.out.print("Ingrese una cantidad para retirar: ");
	                double monto = leeNumero();
	                usuarioATM.retirarDinero(monto);
	                break;
	            case 3:
	                System.out.print("Ingrese cantidad para depositar: ");
	                double monto2 = leeNumero();
	                usuarioATM.depositarDinero(monto2);
	                System.out.print("\n\n\n");
	                break;
	            case 4:
	                System.out.print("Gracias por operar con ATM");
	                //System.out.print(usuarioATM.cerrarSesion());
	                System.out.print("\n\n\n");
	                break;
	            default:
	                System.out.println("Opción inválida");
	                num = 0;
	                break;
	        }
	        }while(num != 4);	        
	    
	    }
	
	
	
	
	    /* ------------------------Prueba 2 de menu del ATM ------------------------------ */
	
	
	
	
	
	
	
	
	
	
}










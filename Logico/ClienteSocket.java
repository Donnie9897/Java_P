package Logico;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.*;

public class ClienteSocket {

	public static void main(String[] args) throws Exception {
		byte b[] =new byte[2002];
		Socket sr= new Socket("Localhost",8080);
		InputStream is = sr.getInputStream();
		FileOutputStream fr = new FileOutputStream("C:/Users/Luis/Desktop/Eclipse-Workspace/Tarea#2_FabricaDeQueso_Mat2018-0520/FacturasGuardadas/Factura.txt");
		is.read(b,0,b.length);
		fr.write(b, 0, b.length);
	}
}

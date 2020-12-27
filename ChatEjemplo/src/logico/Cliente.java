package logico;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;


public class Cliente extends Frame implements ActionListener
{
  static Socket sfd = null;
  static DataInputStream EntradaSocket;
  static DataOutputStream SalidaSocket;
  static TextField salida;
  static TextArea entrada;  
  String texto;

  public Cliente()
  {
    setTitle("Chat");
    setSize(350,200);
    salida = new TextField(30);
    salida.addActionListener(this);
	
    entrada = new TextArea();
    entrada.setEditable(false);
	
    add("South",salida);
    add("Center", entrada);
    setVisible(true);
  }

  public static void main(String[] args)
  {
    Cliente cliente = new Cliente();
    try
    {
      sfd = new Socket("127.0.0.1",7000);
      EntradaSocket = new DataInputStream(new BufferedInputStream(sfd.getInputStream()));
      SalidaSocket = new DataOutputStream(new BufferedOutputStream(sfd.getOutputStream()));
    }
    catch (UnknownHostException uhe)
    {
      System.out.println("No se puede acceder al servidor.");
      System.exit(1);
    }
    catch (IOException ioe)
    {
      System.out.println("Comunicaci�n rechazada.");
      System.exit(1);
    }
    while (true)
    {
      try
      {
        String linea = EntradaSocket.readUTF();
        entrada.append(linea+"\n");
      }
      catch(IOException ioe)
      {
	System.exit(1);
      }
    }
  }
  
  public void actionPerformed (ActionEvent e)
  {
    texto = salida.getText();
    salida.setText("");
   
    
    try
    {
    	 int numero = Integer.parseInt(texto);
    		if(Criba(numero)) {

    		      SalidaSocket.writeUTF(texto + " Es primo");
    		      SalidaSocket.flush();
    			
    		}
    		else {

  		      SalidaSocket.writeUTF(texto + " No es primo");
  		      SalidaSocket.flush();
    		}
    	
    }
    catch (IOException ioe)
    {
      System.out.println("Error: "+ioe);
    }
  }
  
  public boolean Criba(int numero) {
	  
	  for(int i = 2; i < numero; i++) {
			 if(numero % i == 0){
				  return false;
			 }
			 
		
				 
		 }
	  return true;
  }
  
  public boolean handleEvent(Event e)
  {
	    if ((e.target == this) && (e.id == Event.WINDOW_DESTROY))
	    {
	      if (sfd != null)
	      {
		try
		{
		  sfd.close();
		}
		catch (IOException ioe)
		{
		  System.out.println("Error: "+ioe);
		}
		this.dispose();
	      }
	    }
	    return true;
	  }
	}


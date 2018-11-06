
// TODO Inserire il package corretto
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe
		super.setSize(600,600);
		
		// TODO Usare StringBuilder per costruire la stringa HTML

		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<h1> Almanacco astronomico </h1>");
		sb.append("<h2> Novembre 2018 </h2>");
		sb.append("<b>Il Sole.</b> In Novembre perderemo complessivamente 1 ora e 3 minuti di luce");
		sb.append("<table border='1'>");
		sb.append("<tr>");
		sb.append("<td>");
		sb.append("<b>Data</b>");
		sb.append("</td>");
		sb.append("<td>");
		sb.append("<b>Sorge</b>");
		sb.append("</td>");
		sb.append("<td>");
		sb.append("<b>Tramonta</b>");
		sb.append("</td>");
		sb.append("<tr>");
		sb.append("</tr>");
		sb.append("<td>");
		sb.append("1 gio");
		sb.append("</td>");
		sb.append("<td>");
		
		sb.append("</td>");
		sb.append("<td>");
		
		sb.append("</td>");
		sb.append("<tr>");
		sb.append("</tr>");
		sb.append("<td>");
		
		sb.append("</td>");
		sb.append("<td>");
		
		sb.append("</td>");
		sb.append("<td>");
		
		sb.append("</td>");
		sb.append("<tr>");
		sb.append("</tr>");
		sb.append("<td>");
		
		sb.append("</td>");
		sb.append("<td>");
		
		sb.append("</td>");
		sb.append("<td>");
		
		sb.append("</td>");
		sb.append("</table>");
		// TODO Convertire lo StringBuilder in String
		String htmlText = sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println(htmlText);
		
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}


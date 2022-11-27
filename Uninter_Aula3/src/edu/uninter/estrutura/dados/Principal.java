package edu.uninter.estrutura.dados;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dataHoje = LocalDate.now();
		System.out.println(dataHoje);
		
		DateTimeFormatter formatador  = DateTimeFormatter.ofPattern("dd / MM / yyyy  -- E"); 
		System.out.println(dataHoje.format(formatador));
	}
}


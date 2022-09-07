package com.uptc.prgm2.oldClasses;

/**
 * Este archivo tiene propiedad intelectual, licencia, derechos de autor
 * Tipos de licencia, tipos de licenciamiento de codigo, reservarse el
 * derecho de autor
 * @author 
 *
 */
/**
 * que es el archivo. documentacion minima descripcion, nombre, fecha versiones,
 * manejo de versiones en el codigo y manejo de fechas
 * 
 * @author Diego A
 * @Date 2/09/2022 clase numero 3 de la semana 1
 * 
 */
public class MyfigureOld {
	public static void main(String[] args) {
		
		//com.uptc.prgm2.myfigure.models.MyFigure figure = new MyFigure(0, null, null) {};
		//preguntar esto la proxima clase
		if (args.length == 3) {
			System.out.println("tamaño:\n" + args[0] + "\nposicion:\n" + args[1] + "px y " + args[2]+"px");
		} else {
			System.out.println("el numero de paramentros no es valido\n"
					+ "uso\n"
					+ "java -jar Myfigure.jar tamaño valorX valorY\n"
					+ "tamaño valor del tamaño de la figura\n"
					+ "valorX ubicacion en x\n"
					+ "valorY ubicacion en y\n");
		}
		try {
			System.out.println("numero de parametros: " + args.length);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("holaaaaaaaa");
			// e.printStackTrace();
		}
		System.out.println("esta app dibuja una figura");
	}
}

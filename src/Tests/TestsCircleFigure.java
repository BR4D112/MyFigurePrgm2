package Tests;

import com.uptc.prgm2.workingInClass.model.Botton;
import com.uptc.prgm2.workingInClass.model.CirculeFigure;
import com.uptc.prgm2.workingInClass.model.Posicion;

public class TestsCircleFigure {

	public static void main(String[] args) {
		CirculeFigure circuleFigure = new CirculeFigure(new Posicion(20, 10), 10);
		System.out.println("localizacion: " + circuleFigure.getValorX() + ", " + circuleFigure.getValorY());
		System.out.println("radio: " + circuleFigure.getRadio());
		Botton botton = new Botton(new Posicion(20.0, 10.0), 30.0, 10);
		Botton botton2 = new Botton(new Posicion(20.0, 10.0), 30.0, 10).setAngleEquis(45).setSizeEquis(0.3);
		System.out.println(botton + "" + botton2);

	}
}

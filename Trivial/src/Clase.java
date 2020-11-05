import javax.swing.JOptionPane;

public class Clase {

	public static void main(String[] args) {

		String pregunta;
		String respuesta;
//		int respuestaint;
		boolean acierto;
		int puntos = 0;
		int progreso = 0;

		for (int i = 0; i < 5; i++) {
			progreso = i + 1;
			acierto = false;
			
			if (progreso == 1) {
				pregunta = "¿Cuántas casillas / celdas / cuadros hay en un tablero de ajedrez común?";
				respuesta = JOptionPane.showInputDialog("Pregunta " + progreso + "/5 \n" + pregunta);
				if (respuesta.matches("64") || respuesta.matches("sesenta y cuatro")) {
					acierto = true;
				}
			} else
				;
			
			if (progreso == 2) {
				pregunta = "¿Cómo se denomina cuando los jugadores terminan la partida en una especie de empate y con el rey de ambos colores en pie?";
				respuesta = JOptionPane.showInputDialog("Pregunta " + progreso + "/5 \n" + pregunta);
				if (respuesta.matches("tablas") || respuesta.matches("en tablas") || respuesta.matches("Tablas")) {
					acierto = true;
				}
			} else
				;

			if (progreso == 3) {
				pregunta = "¿Cuál es el máximo de celdas que puede recorrer una reina en un sólo movimiento?";
				respuesta = JOptionPane.showInputDialog("Pregunta " + progreso + "/5 \n" + pregunta);
				if (respuesta.matches("7") || respuesta.matches("siete")) {
					acierto = true;
				}
			} else
				;

			if (progreso == 4) {
				pregunta = "En una partida en la que sólo quedan los dos reyes: \n"
						+ "Uno de ellos se encuentra en la fila donde empezó la partida, próxima al borde del tablero. \n"
						+ "Además, este rey no está en ninguna esquina."
						+ "¿Cuántos peones necesitas como mínimo para tener la oportunidad de dar jaque mate *sólo con peones* al rey que está solo? \n"
						+ "  _______________  \n"
						+ "8|_|· |·|·|· |·|· |_| \n"
						+ "7|_|_ |_|_|_|_|_|_| \n"
						+ "6|_|_ |_|_|_|_|_|_| \n"
						+ "5|_|_ |_|_|_|_|_|_| \n"
						+ "4|_|_ |_|_|_|_|_|_| \n"
						+ "3|_|_ |_|_|_|_|_|_| \n"
						+ "2|_|_ |_|_|_|_|_|_| \n"
						+ "1|_|_|_|R|_|_|_|_| \n"
						+ "  A B C D E F G H  \n";
				
/*				+ "· # # # # # # ·\n"
				+ "· · · · · · · ·\n"
				+ "· · · · · · · ·\n"
				+ "· · · · · · · ·\n"
				+ "· · · · · · · ·\n"
				+ "· · · · · · · ·\n"
				+ "· · · · · · · ·\n"
				+ "· · · · · · · ·"; */
				
				respuesta = JOptionPane.showInputDialog("Pregunta " + progreso + "/5 \n" + pregunta);
				if (respuesta.matches("3") || respuesta.matches("tres")) {
					acierto = true;
				}
			} else
				;

			if (progreso == 5) {
				pregunta = "¿Cuántas casillas / celdas / cuadros hay en un tablero de ajedrez común?";
				respuesta = JOptionPane.showInputDialog("Pregunta " + progreso + "/5 \n" + pregunta);
				if (respuesta.matches("64") || respuesta.matches("sesenta y cuatro")) {
					acierto = true;
				}
			}
			if (acierto == true) {
				puntos += 1;
			}
		}
		System.out.println("Tu puntuación es de: ¡" + puntos + " de 5 puntos!");
	}
}
/*

# # # # # # # #
# # # # # # # #
# # # # # # # #
# # # # # # # #
# # # # # # # #
# # # # # # # #
# # # # # # # #
# # # # # # # #

*/
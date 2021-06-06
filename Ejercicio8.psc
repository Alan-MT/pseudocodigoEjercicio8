Algoritmo Ejercicio8
	Definir num Como Entero
	Definir salir Como Caracter
	Repetir
		Repetir
			num <- Aleatorio(1,100)
		Hasta Que num MOD 5 = 0
		Escribir "ingrese una letra: "
		leer salir
		Si salir="S" O salir="s" Entonces
			Escribir "Salir"
		SiNo
			Escribir num
		Fin Si
	Hasta Que salir="S" O salir="s"
FinAlgoritmo

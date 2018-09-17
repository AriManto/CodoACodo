	Funcion absoluto <- valorAbsoluto(Num)
		Definir absoluto como Entero
		Si (Num<0) entonces
			absoluto <- Num*(-1)
		SiNo
			absoluto <- Num
		FinSi
FinFuncion
Algoritmo asd
	Mostrar "Ingrese un número o 0 para finalizar"
	Leer Num
	Mientras num<>0 Hacer
		VAL <- valorAbsoluto(Num)
		Escribir "El valor absoluto de ", Num, " es: ", VAL
		Escribir "Ingrese un número o 0 para finalizar"
		Leer Num
	FinMientras
FinAlgoritmo



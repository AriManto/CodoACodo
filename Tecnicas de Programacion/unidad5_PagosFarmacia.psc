//OpEfecTotal (OpOs y OpEfec)
//OpTarj
//OpTotal
//MontoEfecTotal (MontoOS y MontoEfec)
//MontoTarj
//MontoTotal


Algoritmo unidad5_PagosFarmacia
	Escribir "Ingrese forma de pago"
	Escribir "O: Obra Social -- E: Efectivo -- T: Tarjeta -- *: Finalizar"
	Leer PAGO
	Mientras (PAGO <> "*") Hacer
		Escribir "Ingrese el importe"
		Leer IMPORTE
		Según PAGO Hacer
			"O", "o":
				OpOS <- OpOS + 1
				OpEfecTotal <- OpEfecTotal + 1
				MontoOS <- MontoOS + (IMPORTE*0.6)
				MontoEfecTotal <- MontoEfecTotal + (IMPORTE*0.6)
			"E", "e":
				OpEfec <- OpEfec + 1
				OpEfecTotal <- OpEfecTotal + 1
				MontoEfec <- MontoEfec + (IMPORTE*0.9)
				MontoEfecTotal <- MontoEfecTotal + (IMPORTE*0.9)
			"T", "t":
				OpTarj <- OpTarj + 1
				MontoTarj <- MontoTarj + (IMPORTE*1.15)
		FinSegun
		Escribir "O: Obra Social -- E: Efectivo -- T: Tarjeta -- *: Finalizar"
		Leer PAGO
	FinMientras
	MontoTotal <- MontoEfecTotal + MontoTarj
	OpTotal <- OpEfecTotal + OpTarj
	Escribir "Total de operaciones en el día: " OpTotal ", monto del día: $" MontoTotal
	Escribir "Operaciones en efectivo: " OpEfecTotal "(" OpOS " por Obra Social y " OpEfec " en Efectivo)"
	Escribir "Montos en efectivo: $" MontoEfecTotal "($" MontoOS " por Obra Social y $" MontoEfec " en Efectivo)"
	Escribir "Operaciones por tarjeta: " OpTarj
	Escribir "Montos por tarjeta: $" MontoTarj
	FinAlgoritmo

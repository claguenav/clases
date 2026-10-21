Algoritmo piedrapapelotijera
	pt_us <- 0
	pt_bot <- 0
	Definir cd_objt Como Entero
	Definir objt_bot, objt_us Como Caracter
	Repetir 
		Escribir "piedra..."
		esperar 1 Segundos
		Escribir "papel... o"
		Esperar 1 Segundos
		Escribir "tijeras"
		Escribir "(escribe tu opcion)"
		Leer  objt_us
		Escribir "espera a que el bot elija el objeto"
		cd_objt <- azar(3)+1
		Segun cd_objt Hacer
			1:
				Esperar 1 Segundos
				objt_bot <- "tijeras"
				Escribir objt_bot
			2:
				Esperar 1 Segundos
				objt_bot <- "piedra"
				Escribir objt_bot
			De Otro Modo:
				Esperar 1 Segundos
				objt_bot <- "papel"
				Escribir objt_bot
		FinSegun
		si objt_bot = "tijeras" y objt_us = "piedra"  Entonces
			pt_us <- pt_us+1
			Escribir "tu ganas llevas ", pt_us " puntos"
			Esperar 1 Segundos
		FinSi
		si objt_bot = "papel" y objt_us = "tijeras"  Entonces
			pt_us <- pt_us+1
			Escribir "tu ganas llevas ", pt_us " puntos"
			Esperar 1 Segundos
		FinSi
		si objt_bot = "piedra" y objt_us = "papel"  Entonces
			pt_us <- pt_us+1
			Escribir "tu ganas llevas ", pt_us " puntos"
			Esperar 1 Segundos
		FinSi
		si objt_us = "tijeras" y objt_bot = "piedra"  Entonces
			pt_bot <- pt_bot+1
			Escribir "el bot gana lleva ", pt_bot " puntos"
			Esperar 1 Segundos
		FinSi
		si objt_us = "papel" y objt_bot = "tijeras"  Entonces
			pt_bot <- pt_bot+1
			Escribir "el bot gana lleva ", pt_bot " puntos"
			Esperar 1 Segundos
		FinSi
		si objt_us = "piedra" y objt_bot = "papel"  Entonces
			pt_bot <- pt_bot+1
			Escribir "el bot gana lleva ", pt_bot " puntos"
			Esperar 1 Segundos
		FinSi
		si objt_bot = "piedra" y objt_us = "piedra" Entonces
			Escribir "Empate"
			Esperar 1 Segundos
		FinSi
		si objt_bot = "tijeras" y objt_us = "tijeras" Entonces
			Escribir "Empate"
			Esperar 1 Segundos
		FinSi
		si objt_bot = "papel" y objt_us = "papel" Entonces
			Escribir "Empate"
			Esperar 1 Segundos
		FinSi
	Hasta Que pt_us = 3 o pt_bot = 3 
FinAlgoritmo

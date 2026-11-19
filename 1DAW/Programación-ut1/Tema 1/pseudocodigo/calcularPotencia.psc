Algoritmo calcularPotencia
	//DATOS
	Definir base, exponente, resultado, aux Como Entero
	
	Escribir ' dime la base '
	leer base
	Escribir ' dime el exponente'
	leer exponente
	aux = 1
	resultado  = base 
	
	Repetir
		resultado = resultado * base
		aux = aux+1 //aux++
		Escribir 'Al terminar aux es ' aux ' y resultado es ' resultado
	Hasta Que aux == exponente
	
	
	
	Escribir ' El resultado es ' resultado
	
FinAlgoritmo

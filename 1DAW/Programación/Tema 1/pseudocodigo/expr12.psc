Algoritmo expr12
	//datos
	Definir x Como Entero
	Definir b1, b2 Como Logico
	//Algoritmo 
	x = 10
	b1 = (x==10)
	x = x + x //+=
	Escribir ' b1 vale ' b1
	b2 = (x == 10)
	Escribir ' b2 vale ' b2
	b1 = b1 && b2
	Escribir ' b1 vale ' b1
	b2 = !b1 || b2
	Escribir ' b2 vale ' b2
	
	
FinAlgoritmo

'''Ejercicio
Escribe un programa que compruebe si un número introducido por el usuario como entrada es positivo.

El programa imprimirá por pantalla el mensaje: "Evaluando el numero X ...", donde X será el número introducido por el usuario.

En caso de que lo sea, se imprimirá por pantalla el mensaje: "El numero X es positivo", donde X será el número introducido por el usuario.

NOTA: Aunque el juez virtual no va a comprobarlo, para imprimir la salida usa f-strings

'''

numero = int (input ("introduzca un número:"))
print (f"Evaluando el número {numero} ... ")
if (numero > 0):
    print(f"el número {numero} es positivo")

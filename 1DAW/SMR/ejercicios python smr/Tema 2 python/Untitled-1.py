numero = int (input ("introduzca un numero:"))
if (numero < 10):
    print (f"el número {numero} es de una cifra")
elif (numero < 100):
    print (f"el número {numero} tiene dos cifras")
else:
    print (f"el número {numero} es de más de dos cifras")
print (f"el número es {numero}")
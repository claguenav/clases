barra = int(input())
multiplicador = int(input())
tiempopulsar = int(input())
posicion = tiempopulsar % (barra + 1)
potencia = posicion * multiplicador
print(potencia)
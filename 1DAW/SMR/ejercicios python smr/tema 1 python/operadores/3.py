condicion1 = input() == "true"
condicion2 = input() == "true"
print ("Las dos condiciones son ciertas:", condicion1 and condicion2)
print ("Al menos una de las condiciones es cierta:", condicion1 or condicion2)
print ("Una de las dos es cierta, pero no las dos:", condicion1 ^ condicion2)
print ("La primera condicion negada es:", not condicion1 )
print ("La segunda condicion negada es:", not condicion2)

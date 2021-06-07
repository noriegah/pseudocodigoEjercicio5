Algoritmo edad_sex
	Escribir "Ingrese el numero de personas que desea digitalizar"
	Leer personas
	mujeres=0
	hombres=0
	Para k<-1 Hasta personas Con Paso 1 Hacer
		Escribir "Ingrese el numero de su sexo, Masculino=0, Femenino=1"
		Leer sex
		Escribir "Ingrese su edad"
		Leer edad
		Si sex=0 y edad<18 Entonces
			hombres=hombres+1
		FinSi
		Si sex=1 y edad>=18 Entonces
			mujeres=mujeres+1
		FinSi
	Fin Para
	Escribir "El número de mujeres mayores de edad es de " mujeres
	Escribir "El número de hombres menores de edad es de " hombres
FinAlgoritmo

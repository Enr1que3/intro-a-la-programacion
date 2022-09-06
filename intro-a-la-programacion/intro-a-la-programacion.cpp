// intro-a-la-programacion.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//

#include <iostream>
#include<stdlib.h>
using namespace std;

int suma(int num1, int num2, int num3);

int main(){
	int resultado=suma(5,10,15);

	cout<<resultado<<endl;
}

int suma(int num1, int num2, int num3){
	return num1+num2+num3;
}
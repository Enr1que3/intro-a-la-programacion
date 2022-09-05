// intro-a-la-programacion.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//

#include <iostream>
using namespace std;

int main(){
    int num[]={1,2,3,4,5};
    int suma=0;

    for(int i=0;i<5;i++){
        suma=suma+num[i];//10
    }

    cout<<"La suma del arreglo es de: "<<suma<<endl;

    return 0;
    
}


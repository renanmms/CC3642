#include <iostream>
#include "Televisao.h"


int main(){
    // Instanciando os objetos tv1 e tv2
    Televisao tv1;
    Televisao tv2;

    string modelo;
    float preco, tamanho;
    int volume, canal;
    char ligada;
    bool ligar;

    // Obtendo os valores do teclado
    cout << "Digite o modelo: " << endl;
    cin >> modelo;    
    
    cout << "Digite o preco: " << endl;
    cin >> preco;

    cout << "Digite o tamanho: " << endl;
    cin >> tamanho;

    cout << "Digite o volume: " << endl;
    cin >> volume;

    cout << "Digite o canal: " << endl;
    cin >> canal;

    cout << "Ligar a tv (S/N): " << endl;
    cin >> ligada;

    ligar = (ligada == 'S' || ligada == 's') ? true : false;


    // Setando os valores
    tv1.setModelo(modelo);
    tv1.setPreco(preco);
    tv1.setTamanho(tamanho);
    tv1.setVolume(volume);
    tv1.setLigar(ligar);



}

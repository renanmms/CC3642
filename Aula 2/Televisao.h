#pragma once
#include <string>

using namespace std;

class Televisao{
private:
    string modelo;
    float preco, tamanho;
    int canal, volume;
    bool ligada;

public:
    Televisao(){
        modelo = "None";
        preco = tamanho = .0;
        canal = volume = 0;
        ligada = false;
    }

    void aumentaVolume(){
        volume++;
    }

    void diminuiVolume(){
        volume--;
    }

    string getModelo(){
        return modelo;
    }

    float getPreco(){
        return preco;
    }

    float getTamanho(){
        return tamanho;
    }

    int getCanal(){
        return canal;
    }

    int getVolume(){
        return volume;
    }

    bool getLigada(){
        return ligada;
    }

    void setModelo(string _modelo){
        modelo = _modelo;
    }

    void setPreco(float _preco){
        preco = _preco;
    }

    void setTamanho(float _tamanho){
        tamanho = _tamanho;
    }

    void setCanal(int _canal){
        canal = _canal;
    }

    void setVolume(int _volume){
        volume = _volume;
    }

    void setLigar(bool _ligada){
        ligada = _ligada;
    }
};
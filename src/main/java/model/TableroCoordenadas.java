/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maria
 */
public class TableroCoordenadas {

    private Coordenadas[] recorrido = new Coordenadas[]{
        new Coordenadas(292, 448),//1
        new Coordenadas(294, 426),//2
        new Coordenadas(294, 404),//3
        new Coordenadas(294, 379),//4
        new Coordenadas(294, 353),//5
        new Coordenadas(294, 331),//6
        new Coordenadas(294, 309),//7

        //8-9
        new Coordenadas(294, 286),//8
        new Coordenadas(307, 267),//9

        //10-16
        new Coordenadas(331, 270),//10
        new Coordenadas(352, 270),//11
        new Coordenadas(377, 270),//12
        new Coordenadas(401, 270),//13
        new Coordenadas(424, 270),//14
        new Coordenadas(447, 270),//15
        new Coordenadas(472, 270),//16

        //17
        new Coordenadas(472, 214),//17
    //Faltan y se tienen que cambiar las coordenadas
    };
    
    private int salida_amarillo = 5;
    private int salida_azul = 22;
    private int salida_rojo = 39;
    private int salida_verde = 56;

    public Coordenadas getPosicion(int indice) {
        return recorrido[indice];
    }

    public int getTotalCasillas() {
        return recorrido.length;
    }
;

}

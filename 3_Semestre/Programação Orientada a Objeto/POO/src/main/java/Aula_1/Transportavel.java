/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Aula_1;

/**
 *
 * @author gabriel.esmunoz
 */
public interface Transportavel {

    public static final String UNIDADE_VOLUME = "cm3";

    public String UNIDADE_PESO = "kg";

//
    public double getVolume();

    public double getPeso();

    public int getEmpilhamentoMaximo();
}

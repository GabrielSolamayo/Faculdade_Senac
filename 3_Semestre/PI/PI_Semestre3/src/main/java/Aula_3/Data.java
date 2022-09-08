/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_3;

/**
 *
 * @author gabriel.esmunoz
 */
public class Data {

    private int ano;
    private byte mes;
    private byte dia;

    public int getAno() {
        return ano;
    }

    public void setAno(int a) {
        if (a > 0) {
            ano = a;
        } else {
            System.out.println("Ano invalido");
        }
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte d) {
        if (d > 0 && d <= 31) {
            dia = d;
        } else {
            System.out.println("Dia invalido");
        }
    }

    public byte getMes() {
        return mes;
    }

    public void ajustarMes(byte m) {
        if (m > 0 && m <= 12) {
            mes = m;
        } else {
            System.out.println("Mes invalido");
        }
    }

    public boolean isAnoBissexto() {
        if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

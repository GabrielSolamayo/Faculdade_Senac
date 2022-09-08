/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_1;

/**
 *
 * @author gabriel.esmunoz
 */
public class Mobilia implements Transportavel {

    private String tipo;

    public String getTipo() {

        return tipo;

    }

    public void setTipo(String tipo) {

        this.tipo = tipo;

    }

    public String getFabricante() {

        return fabricante;

    }

    public void setFabricante(String fabricante) {

        this.fabricante = fabricante;

    }

    public String getMaterial() {

        return material;

    }

    public void setMaterial(String material) {

        this.material = material;

    }

    public double getAltura() {

        return altura;

    }

    public void setAltura(double altura) {

        this.altura = altura;

    }

    public double getLargura() {

        return largura;

    }

    public void setLargura(double largura) {

        this.largura = largura;

    }

    public double getProfundidade() {

        return profundidade;

    }

    public void setProfundidade(double profundidade) {

        this.profundidade = profundidade;

    }

    public void setPeso(double peso) {

        this.peso = peso;

    }

    private String fabricante;

    private String material;

    private double altura, largura, profundidade;

    private double peso;

    public Mobilia(String tipo, String fabricante, String material,
            double alt, double larg, double prof, double peso) {

        this.tipo = tipo;

        this.fabricante = fabricante;

        this.material = material;

        this.altura = alt;

        this.largura = larg;

        this.profundidade = prof;

        this.peso = peso;

    }

    public double getVolume() {
        double vol = this.altura * this.largura * this.profundidade;

        return vol;
    }

    public double getPeso() {
        return this.peso;
    }

    public int getEmpilhamentoMaximo() {
        return 2;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;


import java.awt.Point;
/**
 *
 * @author gabriel.esmunoz
 */
public class X_Y {
    public static void main(String[] args) {
        Point p = new Point (23, 42);
        Point x = p.getLocation();
        x.move(5, 15);
        System.out.println(x.getX());
        System.out.println(x.getY());
    }
}

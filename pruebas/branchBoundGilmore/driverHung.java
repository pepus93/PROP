package branchBoundGilmore;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class driverHung {
    public static void main (String[] args) {
        int [] asignado = {6,4,11,1,0,2,8,10,9,5,7,3};
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        String ruta = chooser.getCurrentDirectory().getAbsolutePath();
        ruta +="\\branchBound\\"+ 1;
        ctrlPersistencia cp = new ctrlPersistencia();
        cp.leerJuegoDePrueba(ruta);
        gilmore g = new gilmore(cp.getAfin(),cp.getDist());
        
        double cost = g.g(asignado,asignado.length-1);
        
        
        double [][] matrix = { /*{250,400,350},
                            {400,600,350},
                            {200,400,250} };
                            */{82,83,69,92},
                              {77,37,49,92},
                            {11,69,5,86},
                            {8,9,98,23} }; 

/*
                            {35,85,55,65},
                            {125,95,90,105},
                            {45,110,95,115} };*/
       // hung h = new hung();
      //  double coste = h.eje(matrix);
        /*for(int i=0; i < matriz.length;++i) {
            for(int j=0; j < matriz[0].length;++j) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }*/
       // System.out.println("Coste de la matriz: "+ coste);
        
		 

         
        
    }
}

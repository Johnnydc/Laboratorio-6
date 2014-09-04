/**
 * Johnny del Cid       13032
 * Luis Carlos Ralón    13030
 * @author Dell Latitude
 */

/**
 * Programa que escoge una implementación de Stack y clasifica a 
 * los desarrolladores según su habilidad para manero de web, java o/y celulares
 * Referencia:
 * https://code.google.com/p/hoja-trabajono-6/issues/attachmentText?id=1&aid=10000000&name=main.java&token=ABZ6GAdQmUpKZk0nST6GGxH-4088SBNOlw%3A1409837145433
 */
import java.util.*;
import javax.swing.JOptionPane;

public class Lab6 {

    public static void main(String[] args)
    {
       
        Factory implemt = new Factory();
        Scanner scan = new Scanner(System.in);
        String nombre;
        int grupo,entrada;
        boolean subconjunto;
        entrada=Integer.parseInt(JOptionPane.showInputDialog("Escoja la implementacion de Stack"
                + "\n1)HashSet"
                + "\n2)TreeSet"
                + "\n3) LinkedHashSet"));
        while (entrada!=1 && entrada !=2 && entrada!=3)
        {
           JOptionPane.showMessageDialog(null, "Por favor elija una implementacion de Stack disponible");
            entrada=Integer.parseInt(JOptionPane.showInputDialog("Escoja la implementacion de Stack"
                + "\n1)HashSet"
                + "\n2)TreeSet"
                + "\n3) LinkedHashSet"));         
        }
            
          Set <String> java = implemt.getSET (entrada);
          Set <String> celular = implemt.getSET (entrada);
          Set <String> web = implemt.getSET (entrada);
        
          Set <String> resultado1 = implemt.getSET(entrada);
          Set <String> resultado2 = implemt.getSET(entrada);
          Set <String> resultado3 = implemt.getSET(entrada);
          Set <String> resultado4 = implemt.getSET(entrada);
          Set <String> resultado6 = implemt.getSET(entrada);
         
          
          
       
          int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de nombres a ingresar: "));
          int contador = 0;
          for (int i=0;i<cantidad;i++)
              contador++;
          
          {
              System.out.println("Ingrese el nombre de la persona no. "+Integer.toString(contador));
              nombre = scan.next();
              System.out.println("Ingrese 1 Si tiene experiencia en Java, Ingreso 2 si no la tiene");
              grupo = scan.nextInt();
              if(grupo==1)
              {
                  java.add(nombre);
              }
               System.out.println("Ingrese 1 Si tiene experiencia en WEB, Ingreso 2 si no la tiene");
               grupo=scan.nextInt();
               if (grupo==1)
               {
                   web.add(nombre);
               }
               System.out.println("Ingrese 1 Si tiene experiencia en CELULAR, Ingreso 2 si no la tiene");
               grupo=scan.nextInt();
               if (grupo==1)
               {
                   celular.add(nombre);
               }
              
              
          }
          
          resultado1.addAll(web);
          resultado1.retainAll(java);
          resultado1.retainAll(celular);
          System.out.println("Desarrolladores con experiencia en Java, Web y Celulares"+resultado1);
          
          
          resultado2.addAll(java);
          resultado2.removeAll(web);
          System.out.println("Desarrolladores con experiencia en Java pero que no tengan experiencia en web:"+resultado2);
          
          
          
          resultado3.addAll(celular);
          resultado3.retainAll(web);
          resultado3.removeAll(java);
          System.out.println("Desarrolladores con experiencia en Web y Celulares:"+ resultado3);
          
          resultado4.addAll(celular);
          resultado4.addAll(celular);
          resultado4.removeAll(web);
          System.out.println("Desarrolladores con experiencia en Web o Celulares pero no en java:"+resultado4);
          
          subconjunto=java.containsAll(web);
          if(subconjunto==true)
          {
              System.out.println("El conjunto de java no es subconjunto del conjunto web");
          }
          if(subconjunto==false)
          {
              System.out.println("El conjunto de java es subconjunto del conjunto web");
          }
          
          
          if(web.size()>java.size() && web.size()>celular.size())
          {
              System.out.println("El conjunto con mas desarrolladores es el web");
              System.out.println("Lo conforman:" + web);
              resultado6=web;
          }
        
          if (java.size()>web.size()&& java.size()>celular.size())
          {
              System.out.println("El conjunto con mas desarrolladores es el de Java");
              System.out.println("Lo conforman:" + java);
              resultado6=java;
          }
          
          if (celular.size()>web.size()&& celular.size()>java.size())
          {
              System.out.println("El conjunto con mas desarrolladores es el de Java");
              System.out.println("Lo conforman:" + celular);
              resultado6=celular;
          }
    }
    
}

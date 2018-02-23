/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_01_polinomio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Aldair Cruz
 */
public class LPOO_01_Polinomio {
 private Integer pot;
    private Integer num;
    static Integer k;
    private static Scanner sc=new Scanner(System.in);
    static List<LPOO_01_Polinomio> poli =new ArrayList<>();
    static List<LPOO_01_Polinomio> poli2 = new ArrayList<>();
    static List<LPOO_01_Polinomio> res = new ArrayList<>();
    static List<LPOO_01_Polinomio> res2= new ArrayList<>();
    
    
    public void setPot(Integer pot){
    this.pot=pot;
    }
    public void setNum(Integer num){
       this.num=num;
    }
    
    public Integer getPot(){
        return pot;
    }
    
    public Integer getNum(){
        return num;
    }
    public LPOO_01_Polinomio(Integer pot1, Integer num1){
        this.pot=pot1;
        this.num=num1;
    }
    //primer Polinomio
    public static void ingresar(){
        Integer pot1;
        Integer num1;
        System.out.print("Ingrese la potencia ");
        pot1=sc.nextInt();
        System.out.print("Ingrese el coeficiente ");
        num1=sc.nextInt();
        
        poli.add(new LPOO_01_Polinomio(pot1, num1));
        
    }
    
    
     public static void simplificar(){
     for(int i = 0;i<poli.size();i++){
         for(int j=i+1 ;j<poli.size();j++){
         if(poli.get(i).getPot()==poli.get(j).getPot()){
             
             poli.get(i).setNum(poli.get(i).getNum() + poli.get(j).getNum());
             
             
             if(i< poli.size()-1)
             poli.remove(j);
         }
             
             }
     }   
      
        }
     
     
    public static void imprimirPoli(){
    for(LPOO_01_Polinomio te: poli){
       
        System.out.print(te + " + " );
                  
    }
    System.out.print("..");
    System.out.print("\n\n");
}
    @Override
	public String toString() {
            String a = null;
            if(pot>0){
		a= "(" + num + " X" + pot + ") ";
        }
        if(pot==0){
		a= "(" + num + ") ";
        }
    
        return a;
	}
    
   public static void inclusionDatos(){
       System.out.print("¿Cuantos monomios meterá?  ");
       k=sc.nextInt();
       for(int i=0;i<k;i++){
           ingresar();
       }
       simplificar();
       imprimirPoli();
       
   }
    
    
    //Pedir segundo polinomio
   
    public static void ingresar2(){
        Integer pot2;
        Integer num2;
        System.out.print("Ingrese la potencia ");
        pot2=sc.nextInt();
        System.out.print("Ingrese el coeficiente ");
        num2=sc.nextInt();
        
        
        poli2.add(new LPOO_01_Polinomio(pot2, num2));
        
    }
    
public static void simplificar2(){
     for(int i = 0;i<poli2.size();i++){
         for(int j=i+1 ;j<poli2.size();j++){
         if(poli2.get(i).getPot()==poli2.get(j).getPot()){
             
             poli2.get(i).setNum(poli2.get(i).getNum() + poli2.get(j).getNum());
             
             
             if(i< poli2.size()-1)
             poli2.remove(j);
         }
             
             }
     }   
      
        }
   
    public static void imprimirPoli2(){
    for(LPOO_01_Polinomio te: poli2){
        System.out.print(te + " + " );
         //if(te=){
          //System.out.print(" ");
                         
    }
    System.out.print("..");
    System.out.print("\n\n");
}
	/*public String toString2() {
		return "(" + num + " X" + pot + ") ";
	}*/
    
   public static void inclusionDatos2(){
       System.out.print("¿Cuantos monomios meterá?  ");
       k=sc.nextInt();
       for(int i=0;i<k;i++){
           ingresar2();
       }
       simplificar2();
       imprimirPoli2();
       
   }
   
   
   
   public static void union(){
       for(int i=0;i<poli.size();i++){
       res.add(new LPOO_01_Polinomio(poli.get(i).getPot(),poli.get(i).getNum()));
       
   }
       for(int i=0;i<poli2.size();i++){
           res.add(new LPOO_01_Polinomio(poli2.get(i).getPot(),poli2.get(i).getNum()));
       }
   }
  
   
   
   public static void suma(){
       for(int i=0;i<res.size();i++){
           for (int j=i+1;j<res.size();j++){
               if(res.get(i).getPot() == res.get(j).getPot()){
                   res.get(i).setNum(res.get(i).getNum() + res.get(j).getNum());
                  
               
                   if(i< res.size()-1)
             res.remove(j);
               }
           }
       }
   }
    public static void imprimir(){
    for(LPOO_01_Polinomio te: res){
        System.out.print(te + " + " );
         //if(te=){
          //System.out.print(" ");
                         
    }
    System.out.print("..");
    
    System.out.print("\n\n");
}
   public static void hacerSum(){
       union();
       suma();
       imprimirPoli();
       imprimirPoli2();
       System.out.print(" = \n");
       imprimir();
   }

   public static void resta(){
       for(int i=0;i<res.size();i++){
           for (int j=i+1;j<res.size();j++){
               if(res.get(i).getPot() == res.get(j).getPot()){
                   res.get(i).setNum(res.get(i).getNum() - res.get(j).getNum());
                  
               
                   if(i< res.size()-1)
             res.remove(j);
               }
           }
       }
   }
public static void hacerResta(){
       union();
       resta();
       imprimirPoli();
       imprimirPoli2();
       System.out.print(" = \n");
       imprimir();
   }

public static void multi(){
   
    for(int i=0;i<poli.size();i++){
      for(int j=0;j<poli2.size();j++){
        res.add(new LPOO_01_Polinomio(poli.get(i).getPot() + poli2.get(j).getPot(),(poli.get(i).getNum() * poli2.get(j).getNum())));
      }  
    }
    suma();
    
}

public static void hacerMulti(){
    multi();
    imprimir();
}



public static void menu(){
    int opc;
    System.out.print("\n\n");
    System.out.print("1.-Suma de polinomios\n2.- Resta de polinomios\n3.-Multiplicación de polinomios\n\n");
        System.out.print("Ingrese opción ");
        opc=sc.nextInt();
        switch(opc){
            case 1:
               hacerSum();
               break;
            case 2:
                hacerResta(); 
                break;
            case 3:
                hacerMulti();
                break;
           
        }
}

    //res.add(new LPOO_01_Polinomio(poli.get(i).getPot(),poli.get(i).getNum()));
    public static void main(String[] args) {
        
        
        inclusionDatos();
        inclusionDatos2();
        menu();
        
       //imprimirUnion();
    }
    
}

//Buscar la tabla de Rufini para solucionar division y la solucion de x´s

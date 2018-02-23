/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_01_polinomio;

/**
 *
 * @author Aldair Cruz
 */
public class MetodosPoli {
    private Integer[] pot;
    private Integer[] num;
    private Integer k;
    private Integer sum=0;
    private Integer sum2=0;
    private Integer sum3=0;
    private Double x1;
    private Double x2;
    //public int[] p;
    //public int[] n;
    
    
    public void ciclo(int k){
    this.k=k;
    }
    
    public void establecerPoli(int[] p,int[] n, int j){
        int i=0;
        
        this.pot[i]=p[j];
        this.num[i]=n[j];
        i++;
        
    }
    
    public void simplificar(){
        
        for(int i=0;i<k;i++){
        switch(pot[i]){
            case 0:
                sum+=num[i];
            case 1:
                sum2+=num[i];
            case 2:
                sum3+=num[i];
        }
        
        } 
        }
    
    public Double resolver(){
        double y=(sum2*sum2)-(4*sum*sum3);
        double z=(Math.sqrt(y)-sum2);
        double l=(2*sum);
        x1=z/l;
        return x1;
        
    }
    
    public Double resolver2(){
        double y=(sum2*sum2)-(4*sum*sum3);
        double z=(Math.sqrt(y)+sum2);
        double l=(2*sum);
        x2=z/l;
        return x2;
        
        
    }

   
    


}
    
    


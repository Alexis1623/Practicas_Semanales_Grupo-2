
public class RecursividadB {
    
    public int sumaNumerosNaturales(int n){
      
        if(n==1){
          return n;
      }
      else{
          return n+sumaNumerosNaturales(n-1);
          
      }
    
      
    }
    
   
    
    
}

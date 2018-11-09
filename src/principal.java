import java.util.Random;
public class principal {
    
    public static void main(String []args){
     int batalla = 1;
     int ficha;
    Random aleatorio = new Random();
    
    personaje p1= new personaje();
    p1.nombre="Liukang";
    p1.vida= 100;
    p1.patada=30;
    p1.gancho=10;
    
    personaje p2= new personaje();
    p2.nombre="Subzero";
    p2.vida=100;
    p2.patada=5;
    p2.gancho=50;
    
    while(p1.vida>1 && p2.vida >1){ ficha = aleatorio.nextInt(9);
    System.out.println(" Que comience la batalla numero : " + batalla);
    p1.atacar();
    p2.atacar();
    p1.golpear();
    p2.golpear();
    if (ficha==0)
    { p1.vida =p1.vida-p2.atacar();
    System.out.println("El ataque de " + p2.nombre + "  ha causado daño, su vida se mantiene en " + p2.vida);
    System.out.println( " A " +  p1.nombre + " le queda " + p1.vida + " de vida");
    }
    if (ficha==5)
    { p2.vida =p2.vida-p1.atacar();
    System.out.println("El ataque de " + p1.nombre + " ha causado daño, su vida se mantiene en " + p1.vida);
    System.out.println( " A " +  p2.nombre + " le queda " + p2.vida + " de vida");
    }
    
    if (ficha==1)
    { p1.vida =p1.vida-p2.golpear();
    System.out.println("El ataque de " + p2.nombre + " ha causado daño critico, su vida se mantiene en " + p2.vida);
    System.out.println( " A " +  p1.nombre + " le queda " + p1.vida + " de vida");
    }
    else
    { p2.vida =p2.vida-p1.golpear();
    System.out.println("El ataque de " + p1.nombre + " ha causado daño critico, su vida se mantiene en " + p1.vida);
    System.out.println(" A " +  p2.nombre + " le queda " + p2.vida + " de vida" );
    }
    
    
    batalla= batalla +1;
    
    
    }
    
    
    System.out.println(" La batalla ha finalizado!!");
    System.out.println("   Game over  ");
   
            
    
    
    
    }
    
}

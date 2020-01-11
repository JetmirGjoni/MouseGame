//Pjesa Model e programit e cila mundeson levizjen e miut
public class MouseMovement{
   private  double velx , vely ;
   private int x ,y;
   public void up()                        //Metoda qe miu te levizje lart
    {                                  
      vely = -3.5;
      velx=0;
      
    }
    public void down(){                     //Metoda qe miu te levizje posht
      vely = 3.5;
      velx=0;
      
     }
     public void left()                      //Metoda qe miu te levizje majtas
     {
      velx = -3.5;
      vely=0;
      
      }
      public void right()                     //Metoda qe miu te levizje djathtas
      {
       velx=3.5;
       vely=0;
     }
      public void stopUp()                     //Metoda qe miu te ndalohet
    { 
      vely -= vely;
      velx=0;
      
    }
     public void stopDown(){                    //Metoda qe miu te ndalohet
      vely -= vely;
      velx=0;
      
      
     }
     public void stopLeft()                      //Metoda qe miu te ndalohet
     {
      velx -= velx;
      vely=0;
      }
      public void stopRight()                     //Metoda qe miu te ndalohet
      {
       velx -=velx;
       vely=0;
     }
     public void stop() {                         //Metoda qe miu te ndalohet
     x=x;
     y=y;
    
     }
     
     public double getVelX(){                    //Metoda per marrjen e pozites se miut
     return velx;
     }
     
     public double getVelY(){                    //Metoda per marrjen e pozites se miut
     return vely;
     }
     public int getX(){                          //Metoda per marrjen e pozites se miut
     return x;
     }
     
     public int getY(){                          //Metoda per marrjen e pozites se miut
     return y;
     }
}
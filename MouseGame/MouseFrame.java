// Pjesa View e programit qe mundeson shfaqen e programit 
import javax.swing.*;                                                                //importimi pa pakove te duhura
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.Timer;

 public  class MouseFrame extends JPanel implements ActionListener , KeyListener {  // Emri klases dhe implementimi i ActionListener dhe KeyListener
 MouseMovement movement = new MouseMovement();                                      //Instancimi i klases MouseMovement
  Timer timer = new Timer(5,this);                                                  // Inicializimi i Timer dhe caktimi i kohes 
  private double velx = movement.getVelX();                                         // Levizjet nga klasa MouseMovement 
  private double vely = movement.getVelY(); 
  private int x = movement.getX();
  private int y = movement.getY();
 Image upL;                                                           
 Image upR;
 Image currentImage;
 ImageIcon cheese = new ImageIcon("C:\\Users\\LONATRADE\\Desktop\\MouseGame\\images\\qis1.jpg");           // Imazhet qe do te perdoren gjat programit
 ImageIcon cheese2 = new ImageIcon("C:\\Users\\LONATRADE\\Desktop\\MouseGame\\images\\qis1.jpg");
 ImageIcon cheese3 = new ImageIcon("C:\\Users\\LONATRADE\\Desktop\\MouseGame\\images\\qis1.jpg");
 ImageIcon cheese4 = new ImageIcon("C:\\Users\\LONATRADE\\Desktop\\MouseGame\\images\\qis1.jpg");
ImageIcon cheese5 = new ImageIcon("C:\\Users\\LONATRADE\\Desktop\\MouseGame\\images\\qis1.jpg");
ImageIcon cheese6 = new ImageIcon("C:\\Users\\LONATRADE\\Desktop\\MouseGame\\images\\qis1.jpg");
ImageIcon cheese7 = new ImageIcon("C:\\Users\\LONATRADE\\Desktop\\MouseGame\\images\\qis1.jpg");
 ImageIcon bad = new ImageIcon("C:\\Users\\LONATRADE\\Desktop\\MouseGame\\images\\zeher1.png");
 
 JFrame obj ;                                                                                             // Tabela ne te cilen do te vendoset paneli
 boolean eaten ,eaten2,eaten3,eaten4,eaten5,eaten7;
  
  public MouseFrame() {                                            //  Konstruktori
 
   timer.start();                                                  //  Fillimi i timerit 
   addKeyListener(this);                                          //   Aktivizimi i KeyListenrs
   setFocusable(true);                                           //    Koncentrimi ne tastier
  
   ImageIcon img1 = new ImageIcon("C:\\Users\\LONATRADE\\Desktop\\MouseGame\\images\\mouseUP4.jpg");
   upR = img1.getImage();
   ImageIcon img2 = new ImageIcon("C:\\Users\\LONATRADE\\Desktop\\MouseGame\\images\\mouseUP8.jpg");
   upL = img2.getImage();
      JFrame obj = new JFrame();
         obj.getContentPane().add(this);
         obj.setSize(1500,1000);
         obj.setVisible(true);
         obj.setTitle("Mouse Game 4k 60fps");
         obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         obj.setLocation(180,30);
         JOptionPane.showMessageDialog(null,"Use  W,A,S,D  to controll the mouse ! For additional help press H . ","Welcome",JOptionPane.INFORMATION_MESSAGE,cheese);
                     }
     public void paintComponent(final Graphics g) {          // Penda grafike dhe ngjyrosja e panelit
      super.paintComponent(g);                                
      setBackground(Color.white);
      g.setColor(Color.black);
      g.drawRect(10,10,1460,930);
       
           
         bad.paintIcon(this,g,400, 600);                                                                                 // Vendosja e imazheve
         bad.paintIcon(this,g,800, 300);
         bad.paintIcon(this,g,100, 200);
         bad.paintIcon(this,g,1300, 700);
         
          if (eaten==true  && eaten2==true && eaten3==true && eaten4==true && eaten5==true && eaten7==true){                  //   Kushti per fitimin e lojes
       timer.stop();
        JOptionPane.showMessageDialog(null, "Congratulations , You won !","Delicious",JOptionPane.INFORMATION_MESSAGE,cheese);
             
            System.exit(0);
            

      }      
      

         
         eaten =  cheese(g,150,150, cheese,eaten);                                                // Vendosja e imazheve me kushte booleane
                  cheese(g,150,150,cheese ,eaten);                                                // Vendosja e imazheve me kushte booleane
         
          eaten2 =  cheese2(g,530,210, cheese2,eaten2);                                           //Vendosja e imazheve me kushte booleane
                    cheese2(g,530,210,cheese2 ,eaten2);                                           //Vendosja e imazheve me kushte booleane
         
          eaten3 =  cheese3(g,1400,99, cheese3,eaten3);                                           //Vendosja e imazheve me kushte booleane
                    cheese3(g,1400,99,cheese3 ,eaten3);                                           //Vendosja e imazheve me kushte booleane
         
          eaten4 =  cheese4(g,1050,892, cheese4,eaten4);
                    cheese4(g,1050,892,cheese4 ,eaten4);
         
          eaten5 =  cheese5(g,1230,510, cheese5,eaten5);                                           //Vendosja e imazheve me kushte booleane
                    cheese5(g,1230,510,cheese5 ,eaten5);                                           //Vendosja e imazheve me kushte booleane
         
          eaten7 =  cheese7(g,90,800,cheese7,eaten7);                                              //Vendosja e imazheve me kushte booleane
                    cheese7(g,90,800,cheese7,eaten7);                                              //Vendosja e imazheve me kushte booleane
              
        g.drawImage(currentImage ,x + 15,y + 15,this);                                             //Vendosja e miut i cili leviz me deshire te perdoruesit
        
        if(x+20 > 375 && x+18 < 425 && y+18 > 575 &&  y+18 <625){                                  //Kushti per humbjen e lojes
        
         timer.stop();
      JOptionPane.showMessageDialog(null, "Oh , that wasn't cheese , give it another try","You Lost",JOptionPane.INFORMATION_MESSAGE,bad);
                       System.exit(0);
         
        }
        
        if(x+20 > 775 && x+18 < 825 && y+18 > 275 &&  y+18 <325){                                  //Kushti per humbjen e lojes
       
         timer.stop();
        
      JOptionPane.showMessageDialog(null, "Try to avoid eating that next time ","You Lost",JOptionPane.INFORMATION_MESSAGE,bad);  
                       System.exit(0);
         
        }
        
        if(x+20 > 75 && x+18 < 125 && y+18 > 175 &&  y+18 <225){                                    //Kushti per humbjen e lojes
        timer.stop();
           
             JOptionPane.showMessageDialog(null, "The mouse didn't like that , it preferes cheese","You Lost",JOptionPane.INFORMATION_MESSAGE,bad);
             
              System.exit(0);
        }
        
        if(x+20 > 1275 && x+18 < 1325 && y+18 > 675 &&  y+18 <725){                                //Kushti per humbjen e lojes
       
         timer.stop();
      JOptionPane.showMessageDialog(null, "That doesn't taste so good , next time try the cheese instead","You Lost",JOptionPane.INFORMATION_MESSAGE,bad);
                 System.exit(0);
         
        }
        
        
                   }
                         
    
     public boolean cheese(Graphics g , int x ,int y ,ImageIcon i , boolean eaten)                             // Metoda per vizatimin e djathit
     {
      if(!eaten){i.paintIcon(this,g,x,y);}
             if (this.x + 20 > 120 && this.x + 18 < 175 && this.y + 18 > 123 && this.y + 18 < 175){ 
             eaten = true ; 
             repaint();
             }
           
             return eaten;
             }    
             
       public boolean cheese2(Graphics g , int x ,int y ,ImageIcon i , boolean eaten)                          // Metoda per vizatimin e djathit
     {
      if(!eaten){i.paintIcon(this,g,x,y);}
             if (this.x + 20 >505 && this.x + 18 < 555 && this.y + 18 > 190 && this.y + 18 < 235){ 
             eaten2 = true ; 
             repaint();
             }
             
             return eaten2;
             }          
             
          public boolean cheese3(Graphics g , int x ,int y ,ImageIcon i , boolean eaten)                          // Metoda per vizatimin e djathit
     {
      if(!eaten){i.paintIcon(this,g,x,y);}
             if (this.x + 20 >1375 && this.x + 18 < 1425 && this.y + 18 > 74 && this.y + 18 < 124){
              eaten3 = true ;
               repaint();
               }
            
             return eaten3;
             }     
             
               public boolean cheese4(Graphics g , int x ,int y ,ImageIcon i , boolean eaten)                      // Metoda per vizatimin e djathit
     {
      if(!eaten){i.paintIcon(this,g,x,y);}
             if (this.x + 20 >1025 && this.x +18 < 1075 && this.y + 18 > 874 && this.y + 18 < 912){
              eaten4 = true ; 
              repaint();
              }
            
             return eaten4;
             }  
             
                  
    public boolean cheese5(Graphics g , int x ,int y ,ImageIcon i , boolean eaten)                                    // Metoda per vizatimin e djathit
     {
      if(!eaten){i.paintIcon(this,g,x,y);}
             if (this.x + 20 > 1205 && this.x + 18 < 1255 && this.y + 18 > 485 && this.y + 18 < 535){
              eaten5 = true ; 
              repaint();
              }
            
             return eaten5;
             }    
             
             
            

     public boolean cheese7(Graphics g , int x ,int y ,ImageIcon i , boolean eaten)                                     // Metoda per vizatimin e djathit
     {
      if(!eaten){i.paintIcon(this,g,x,y);}
             if (this.x + 20 > 60 && this.x + 18 < 120 && this.y + 18 > 770 && this.y + 18 < 830){ 
             eaten7 = true ;
              repaint();
              }
            
             return eaten7;
             }    
                            
            
     public void actionPerformed(ActionEvent e ) {                             // Metoda kryesore e ActionListener
     if ( x < 0) {                                                             //Kushtet per mbajtjen e miut mbrenda fushes
     x = x + 4;
     }
     if (x > 1410){
     x = x - 4 ;
     }
     if(y<0){
     y=y+4;
     }
     if (y >886){
     y = y-4;
     }
     
             
     
     repaint();
     x+=movement.getVelX();                                                   //Mundeson levizjen e miut majtas dhe djathtas
     y+=movement.getVelY();                                                   //Mundeson levizjen e miut lart dhe posht
     }
     public void keyPressed(KeyEvent e ) {                                    //Metoda e KeyListeners per levizjen e miut me ane te tastieres
       int code = e.getKeyCode();
     
     switch (code) {
     
     case KeyEvent.VK_W:
       movement.up();
       break; 
       
       case KeyEvent.VK_S:
       movement.down();
       break;
       
       
       case KeyEvent.VK_A:
       movement.left();
       currentImage = upR;
       break;
       
       case KeyEvent.VK_D:
       movement.right();
        currentImage = upL;
       break;    
       
         case KeyEvent.VK_H:
        timer.stop();
        JOptionPane.showMessageDialog(null,"Eat all the cheese , but be careful don't eat anything else .");
        timer.start();
       break;       
   
      
      }
     }
     public void keyReleased(KeyEvent e )  {                              //Metoda e KeyListener per ndalimin te levizjes se miut
     
      int code = e.getKeyCode();
    
    switch (code) {
    
    case KeyEvent.VK_W:
    
      movement.stopUp();
      break; 
      
      case KeyEvent.VK_S:
      
      movement.stopDown();
      movement.stop();
      break;
      
      
      case KeyEvent.VK_A:
      movement.stopLeft();
      break;
      
      case KeyEvent.VK_D:
      movement.stopRight();
      break;       

     }
         }
     public void keyTyped(KeyEvent e) {}   
   }

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135 ,206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  //skyline
    fill(192, 192, 192);
    rect(37, 50, 50, 350);
    rect(23, 150, 36, 250);
    rect(7, 105, 30, 295);
    rect(106, 25, 42, 375);
    rect(172, 125, 58, 275);
    rect(249, 30, 48, 370);
    rect(307, 40, 41, 360); 
    
    //grass
    stroke(23, 23, 23);
    fill(52, 140, 59);
    rect(0, 300, 400, 100);  
   
    //left pillar
    fill(23, 23, 23);
    rect(50, 125, 75, 175);
    
    //roof of left pillar
    fill(225);
    rect(40, 115, 95, 10 );

    //right rectangle
    fill(225);
    rect(125, 185, 175, 115);

    //roof of white rectangle
    fill(23, 23, 23);
    rect(115, 175, 195, 10);

    //window for left pillar
    fill(0 ,164 ,239);
    ellipse(87, 200, 50, 75);

    //left window details
    stroke(23);
    line(87, 150, 87, 275);
    line(62, 200, 112, 200);

    //Door
    fill(78, 53, 36);
    rect(150, 230, 40, 70);
    
    //door handle
    fill(220, 220, 220);
    ellipse(183,270,10,10);

    // right window
    fill(0 ,164 ,239);
    rect(200, 205 , 100, 75);

    //right window details
    line(200, 225, 300, 225);
    line(200, 250, 300, 250);
    line(225, 205, 225, 280);
    line(250, 205, 250, 280);
    line(275, 205, 275, 280);
      
    

   
  }
  
  // define other methods down here.
}
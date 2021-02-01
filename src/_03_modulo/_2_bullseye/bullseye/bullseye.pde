
void setup() {
  // set the size of your sketch
  size(500,500);
}

void draw() {
  int size = 450;
  for (int i = 0; i < 5; i++) {
    if (i % 2 ==0){
      fill(#D15252);
    }
    else {
      fill(#3790C9);
    }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  ellipse(250,250,size, size);
  size-=90;
  
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
}

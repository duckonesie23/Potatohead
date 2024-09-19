public class PotatoHead
{ 

//instance variables - to be used in all methods in the class 
private String eyeColor; //private int length; 
private int earringAmount;
private boolean hasNose;
private String noseColor;
private int teethAmount;
private String hatColor;
private String shoeColor;
private boolean hasArms;

private int count;
/*************************************************************************/ 

//constructors 
//default constructor 
public PotatoHead() {
	eyeColor = "black";
	earringAmount = 4;
	hasNose = true;
	noseColor = "orange";
	teethAmount = 2;
	hatColor = "black";
	shoeColor = "black";
	hasArms = false;
	count = 0;
} 

           //give initial values to all the instance variables that are declared as private } 
//initializer/ parameterized constructor 
public PotatoHead(String ec, int ea, boolean hn, String nc, int ta, String hc, String sc, boolean ha ) 
{ 
            	eyeColor = ec;
	earringAmount = ea;
	hasNose = hn;
	noseColor = nc;
	teethAmount = ta;
	hatColor = hc;
	shoeColor = sc;
	hasArms = ha;
	count = 0;
} 
/******************************************************/ 

//Accessor Methods 
public String getEyeColor() 
{ 
return eyeColor; 
} 
public int getEarringAmount() 
{ 
return earringAmount; 
} 

public boolean getHasNose() 
{ 
return hasNose; 
} 

public String getNoseColor() 
{ 
return noseColor; 
} 

public int getTeethAmount() 
{ 
return teethAmount; 
} 
public String getHatColor() 
{ 
return hatColor; 
} 
public String getShoeColor() 
{ 
return shoeColor; 
} 
public boolean getHasArms() 
{ 
return hasArms; 
} 



/**********************************************************************/ 

//mutator methods 
public void setEyeColor(String e) 
{ 
eyeColor = e; 
} 
public void setEarringAmount(int e) 
{ 
earringAmount = e; 
} 

public void setHasNose(boolean h) 
{ 
hasNose = h; 
} 

public void setNoseColor(String n) 
{ 
noseColor = n; 
} 

public void setTeethAmount(int t) 
{ 
teethAmount = t; 
} 
public void setHatColor(String h) 
{ 
hatColor = h; 
} 
public void setShoeColor(String s) 
{ 
 shoeColor=s; 
} 
public void setHasArms(boolean h) 
{ 
hasArms=h; 
} 

public void talk(){
	System.out.println("Superb");
}
public void rps(){
	int num = (int) (Math.random()*3);
	switch(num){
		case 0:
		System.out.println("rock");
		break;
		case 1:
		System.out.println("paper");
		break;
		case 2:
		System.out.println("scissors");
	}
}
public void countUp(){
	count++;
	System.out.println(count);
}

//toString 
public String toString() 
{ 

return "Eye Color, "+eyeColor+"\nEarring Amount, "+earringAmount+"\nHas Nose, "+hasNose+"\nTeeth Amount, "+teethAmount+"\nHat Color, "+hatColor+"\nShoe Color, "+shoeColor+"\nHas Arms, "+hasArms+"\n"; } 
/*****************************************************/ //main method 
public static void main (String [] args) 
{ 
//create objects or instances
//call or access constructors
//call or access (test) all of the methods
PotatoHead jim = new PotatoHead();
PotatoHead bob = new PotatoHead("black",3,true,"red",20,"brown","green",true);
String eye = bob.getEyeColor();
jim.setTeethAmount(5);
System.out.println(eye);
System.out.print(bob.toString());
bob.rps();
for(int i=0;i<999999999;i++){
	bob.countUp();
}
}
}
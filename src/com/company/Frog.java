package com.company;

public class Frog {
	private String name;
	private int xPos;
	private int yPos;
	
	public Frog(String n,int x, int y)		// constructor
	{
		name = n;
		xPos=x;
		yPos=y;
		System.out.println(name);
	}
	public void setPos(int x, int y)	// accessor methods
	{
		xPos = x;
		yPos = y;
	}
	public int getXPos()
	{
		return xPos;
	}
	public int getYPos()
	{
		return yPos;
	}
	public void moveWest()		// change the pos of the frog
	{
		xPos = xPos-1;
	}
	public void moveEast()
	{
		xPos = xPos + 1;
	}
	public void moveNorth()
	{
		yPos=yPos+1;
	}

    public void jump(int spaces){
        this.setPos(getXPos() + spaces, getYPos() + spaces);
    }

    public void visit(Frog friend){
        this.setPos(friend.getXPos(), friend.getYPos());
    }
	
	public void eatFly()
	{
		System.out.println("Yum");
	}
	public String toString()
	{
		String s = "Hi I am "+ name +" the frog and I live at "+ xPos + " " + yPos;
		return s; 
	}
	

	public static void main(String[] args) {
		Frog f1 = new Frog("Freddy",3,4);	// create an instance of Frog
		f1.eatFly();						// call Frog methods
		f1.moveNorth();
		System.out.println(f1);
		
		Frog f2 = new Frog("Francine", -2,0);
		f2.eatFly();
		f2.jump(2);
		f1.visit(f2);
		System.out.println(f1);
		System.out.println(f2);
		
        Frog frank = new Frog("Frank", 0, 0);
        frank.jump(1);
        frank.jump(3);
        System.out.println(frank);
        frank.visit(f1);
        System.out.println(frank);

	}

}

/*  Output
Freddy
Yum
Hi I am Freddy the frog and I live at 3 5
Francine
Yum
Hi I am Freddy the frog and I live at 0 2
Hi I am Francine the frog and I live at 0 2
*/

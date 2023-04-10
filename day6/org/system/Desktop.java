package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("The Desktop size is 32 inch");
	}
	
	public static void main(String[] args)
	{
		Desktop ds=new Desktop();
		ds.computerModel();
		ds.desktopSize(); 
	}
}

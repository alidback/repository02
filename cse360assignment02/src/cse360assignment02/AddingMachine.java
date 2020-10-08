package cse360assignment02;

public class AddingMachine { //Adding Machine class
  private int total;
  private String str = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () { //returns total
    return total;
  }
  
  public void add (int value) { //adds values
	  total = total + value;
	  str = str + " + " + value;
  }

  public void subtract (int value) { //subtracts values
	  total = total - value;
	  str = str + " - " + value;
  }

  public String toString () { //returns string
    return str;
  }

  public void clear() { //clears things
	  str = "0";
  }
}
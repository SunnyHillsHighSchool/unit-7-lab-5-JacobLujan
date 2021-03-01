//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jacob Lujan


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number
{

//private instance variable (must be an Integer)
  Integer num;
//constructor
  public Number()
  {
    num = 0;
  }

  public Number(Integer i)
  {
    num = i;
  }
//getter method
  public Integer getNum()
  {
    return num;
  }
//setter method
  public void setNum(Integer z)
  {
    num = z;
  }
//isOdd method
  public boolean isOdd()
  {
    if(num % 2 == 1)
    {
      return true;
    }
    return false;
  }
//isPerfect method
  public boolean isPerfect()
  {
    int r = 0;
    for(int x = 1; x < num; x++)
    {
      if(num % x == 0)
      {
        r = x + r;
      }
    }
    if(r == num)
    {
      return true;
    }
    return false;
  }

//toString
  public String toString()
  {
    return "" + num;
  }
}
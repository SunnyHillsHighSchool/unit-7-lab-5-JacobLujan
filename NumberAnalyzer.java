//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[] analyze)
  {
    list = new ArrayList<Number>();
    for(int a = 0; a < analyze.length; a++)
    {
      list.add(new Number(analyze[a]));
    }
  }
	//write count odds
  public int countOdds()
  {
    int b = 0;
    for(int c = 0; c < list.size(); c++)
    {
      if(list.get(c).isOdd())
      {
        b++;
      }
    }
    return b;
  }
	//write count evens
  public int countEvens()
  {
    int d = 0;
    for(int e = 0; e < list.size(); e++)
    {
      if(list.get(e).isOdd() == false)
      {
        d++;
      }
    }
    return d;
  }
	//write count perfects
	public int countPerfects()
  {
    int b = 0;
    for(int a = 0; a < list.size(); a++)
    {
      if(list.get(a).isPerfect())
      {
        b++;
      }
    }
    return b;
  }
	//write a toString
  public String toString()
  {
    return "" + list;
  }
}
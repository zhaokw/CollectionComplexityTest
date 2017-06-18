import java.util.*;
public class Main {
  public static void main(String[] args){
	  long start,end,duration;
	  Collection<String> l=new ArrayList<String>();
	  
	  //ArrayList
	  start=System.nanoTime();
	  for(int i=0;i<10000;i++)
		  l.add("abcdefg");
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("ArrayList "+"construction time:"+duration);
	  start=System.nanoTime();
	  ((ArrayList<String>) l).get(5004);//get a large random index
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("ArrayList "+"getting time:"+duration);
	  start=System.nanoTime();
	  l.add("abcdefg");
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("ArrayList "+"adding time:"+duration);
	  start=System.nanoTime();
	  l.remove(5732);
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("ArrayList "+"deleting time:"+duration);
	  start=System.nanoTime();
	  System.out.println(" ");
	  
	  //LinkedList
	  l=new LinkedList<String>();
	  start=System.nanoTime();
	  for(int i=0;i<10000;i++)
		  l.add("abcdefg");
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("LinkedList "+"construction time:"+duration);
	  start=System.nanoTime();
	  ((LinkedList<String>) l).get(5030);//get a large random index
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("LinkedList "+"getting time:"+duration);
	  start=System.nanoTime();
	  l.add("abcdefg");
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("LinkedList "+"adding time:"+duration);
	  start=System.nanoTime();
	  l.remove(5732);
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("LinkedList "+"deleting time:"+duration);
	  System.out.println(" ");
	  
	  //Vector
	  l=new Vector<String>(10,10);
	  start=System.nanoTime();
	  for(int i=0;i<10000;i++)
		  l.add("abcdefg");
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("Vector "+"construction time:"+duration);
	  start=System.nanoTime();
	  ((Vector<String>) l).get(5030);//get a large random index
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("Vector "+"getting time:"+duration);
	  start=System.nanoTime();
	  l.add("abcdefg");
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("Vector "+"adding time:"+duration);
	  start=System.nanoTime();
	  l.remove(5732);
	  end=System.nanoTime();
	  duration=end-start;
	  System.out.println("Vector "+"deleting time:"+duration);
  }
}

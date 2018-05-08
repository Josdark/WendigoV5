package src;

import java.util.ArrayList;

public class Individual {
	ArrayList<Class> genome;
	ArrayList<Object> genes;

	public Individual(ArrayList<Class> parameters)
	{
		genome = parameters;
		genes = new ArrayList<Object>();
	}
	
	public ArrayList<Class> getGenome(){
		return genome;
	}
	
	public ArrayList<Object> getGenes(){
		return genes;
	}
	
	public void readGenome() {
		if(genome.size()==1)
		System.out.println("THERE IS "+genome.size()+" GENE");
		else
		System.out.println("THERE ARE "+genome.size()+" GENES");
		int G = 0;
		for (Class gene : genome) {
			System.out.println("G"+G+" : "+gene+"  :  "+genes.get(G)); G++;
		}
	}
	
	public void randomize()
	{
		for (Class parameter : genome){
			if (parameter.equals(int.class))
				genes.add(new Integer(((int) (Math.random()*10))));
			if (parameter.equals(double.class))
				genes.add(new Double(((double) (Math.random()*Math.random()*10))));
			if (parameter.equals(long.class))
				genes.add(new Long((long) (Math.random()*Math.random()*100)));
			if (parameter.equals(float.class))
				genes.add(new Float(((float) Math.random()*Math.random()*100)));
			if (parameter.equals(short.class))
				genes.add(new Short((short) (Math.random()*Math.random()*10)));
			if (parameter.equals(boolean.class))
				if (Math.random()>=.5)
					genes.add(new Boolean(true));
				else
					genes.add(new Boolean(false));
			if (parameter.equals(null))
				genes.add(null);
		} 
		 
	}
	
}

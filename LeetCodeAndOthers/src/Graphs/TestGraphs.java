package Graphs;

public class TestGraphs {

	public int val;
	boolean bool;
	/*public static void main(String... args) {
		CreateNodeGraph<String> graph = new CreateNodeGraph<String>();
		
		graph.addVertex("hanu");
		graph.removeVertex("hanu");
		
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bool ? 1231 : 1237);
		result = prime * result + val;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestGraphs other = (TestGraphs) obj;
		if (bool != other.bool)
			return false;
		if (val != other.val)
			return false;
		return true;
	}

	
	
	
}

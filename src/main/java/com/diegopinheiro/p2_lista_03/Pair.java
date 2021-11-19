package com.diegopinheiro.p2_lista_03;

public class Pair {
	
	private String left = new String();
	private String right = new String();
	
	Pair(String left, String right) throws Exception {
		if (left == null || right == null){
			throw new Exception("null values");
		} else if (left ==""|| right=="") {
			throw new Exception("You have to input values");
		} else {
			this.left = left;
			this.right = right;
		}
		
	};
	
	@Override
	public String toString(){
		return "(" + this.left + ", " + this.right + ")" ;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pair) {
			Pair other = (Pair) obj;
			if(this.left.equals(other.left) && this.right.equals(other.right)) {
				return true;
			}
		}
		return false;
	}


}

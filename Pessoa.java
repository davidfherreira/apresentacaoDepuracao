package Trabalho;

public class Pessoa {
	
	    
	    private String nome;
	    private float peso;
	    private float altura;

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public float getPeso() {
	        return peso;
	    }

	    public void setPeso(float peso) {
	        this.peso = peso;
	    }

	    public float getAltura() {
	        return altura;
	    }

	    public void setAltura(float altura) {
	        this.altura = altura;
	    }
	    
	    public String toString (){
	    return "Nome= " + this.nome + ", Peso= " + this.peso+"kg" + ", Altura= " + this.altura+"m"; 
	    }
	    
	    public void calcularImc(Pessoa pessoa){
	        float imc = pessoa.peso/(pessoa.altura*pessoa.altura);
	        
	        if(imc >= 18.5  && imc <= 24.9){
	            System.out.println("Faixa de peso normal !!!");
	            System.out.println("IMC= " + imc + "\n");
	        }
	        else if (imc >= 25 && imc <= 30){
	            System.out.println("Faixa acima do peso !!!");
	            System.out.println("IMC= " + imc + "\n");
	        }
	        else if(imc > 30 ){
	            System.out.println("Faixa obesidade extrema !!!");
	            System.out.println("IMC= " + imc + "\n");
	        }
	        else{
	            System.out.println("Faixa abaixo do peso !!!");
	            System.out.println("IMC= " + imc + "\n");
	        }
	        
	    
	    }
	    
	

}

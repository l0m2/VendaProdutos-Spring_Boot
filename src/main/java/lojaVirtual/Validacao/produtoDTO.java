package lojaVirtual.Validacao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class produtoDTO {

	@NotBlank 
	  private String nomeProduto;
	@NotNull
	private int quantidadeProduto;
	@NotNull
	private double precoProduto;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	
}

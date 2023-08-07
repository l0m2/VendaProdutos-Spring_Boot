package lojaVirtual.Models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
public class produtoModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private UUID id;
	@Column(nullable=false, unique=true, length=30)
	private String nomeProduto;
	@Column(nullable=false)
	private int quantidadeProduto;
	@Column(nullable=false)
	private double precoProduto;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void aumentarProduto(int n) {
		this.quantidadeProduto = quantidadeProduto + n;
	}

}

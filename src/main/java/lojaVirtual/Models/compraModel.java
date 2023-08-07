package lojaVirtual.Models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_COMPRA")
public class compraModel implements Serializable {
 
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private clienteModel idCliente;
	@ManyToOne
	@JoinColumn(name = "idProduto")
	private produtoModel idProduto;
	@Column(nullable=false)
	private double precoPago;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public clienteModel getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(clienteModel idCliente) {
		this.idCliente = idCliente;
	}
	public produtoModel getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(produtoModel idProduto) {
		this.idProduto = idProduto;
	}
	public double getPrecoPago() {
		return precoPago;
	}
	public void setPrecoPago(double precoPago) {
		this.precoPago = precoPago;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}

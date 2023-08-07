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
@Table(name="TB_CLIENTE")
/*
 * Serializable- para ser convertida em Bytes e posteriormente restaurada em sua forma original
 */
public class clienteModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(nullable=false, length=40)
	private String nomeCliente;
	@Column(nullable=true,unique=true, length=12)
	private String telefoneCliente;
	@Column(nullable=true)
	private double saldoCliente;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public double getSaldoCliente() {
		return saldoCliente;
	}
	public void setSaldoCliente(double saldoCliente) {
		this.saldoCliente = saldoCliente;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void Deposito(double valor) {
		this.saldoCliente= saldoCliente + valor;
	}

}

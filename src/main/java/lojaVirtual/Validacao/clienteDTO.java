package lojaVirtual.Validacao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class clienteDTO {

  @NotBlank 
  private String nomeCliente;
  @NotBlank
  @Size(max=13)
  private String telefoneCliente;
  @NotNull
  private double saldoCliente;
  
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
  
  
}

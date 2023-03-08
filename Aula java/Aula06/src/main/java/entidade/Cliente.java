package entidade;

public class Cliente {

	protected int codCliente;
	public String nomeCliente;
	public String cpfCliente;
	public String emailCliente;

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
    
	public Cliente() {
		
	}

    public Cliente (int codCliente, String nomeCliente, String cpfCliente,String email) {
    	
    	this.codCliente = codCliente;
    	this.nomeCliente = nomeCliente;
    	this.cpfCliente = cpfCliente;
    	this.emailCliente = emailCliente;
		
	}
}

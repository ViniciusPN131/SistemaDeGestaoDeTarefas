package modelo;

import java.util.Date;

public class Tarefas {
	
	private String tituloTarefa;
	private String descricao;
	private Date dataVencimento;
	private String status;
	
	public String getTituloTarefa() {
		return tituloTarefa;
	}
	public void setTituloTarefa(String tituloTarefa) {
		this.tituloTarefa = tituloTarefa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}

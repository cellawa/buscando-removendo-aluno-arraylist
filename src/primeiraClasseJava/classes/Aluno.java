package primeiraClasseJava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.Pessoa;
import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa {
	/* Atributos do Aluno */
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() { /* cria dos dados na memoria - sendo padr�o do Java */

	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;

	}

	/* recebe dados */
	public void setnome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// metodo que retorna a media do aluno
	public double getMedianota() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();

		}

		return somaNotas / disciplinas.size();

	}

	public boolean getAlunoAprovado() {
		double media = this.getMedianota();
		if (media >= 60) {
			return true;

		} else {
			return false;

		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMedianota();
		if (media >= 60) {
			if (media >= 70) {
				return StatusAluno.APROVADO;

			} else {

				return StatusAluno.RECUPERACAO;
			}

		} else {
			return StatusAluno.REPROVADO;

		}

	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", data=" + data + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculado=" + serieMatriculado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCPF);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(numeroCPF, other.numeroCPF);
	}

	@Override /* Identifica m�todo sobreescrito */
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	public String msgMaiorIdade () {
		return this.pessoaMaiorIdade() ?" Oba aluno maior de iidade" : "Xii aluno menor de idade";
		
		
		
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500;
	}
}

package repository;

import java.util.ArrayList;
import java.util.List;

import model.Enfermeiro;
import model.Medico;

public class BancoDao {
	
	public static List<Medico> medicos = new ArrayList<Medico>();
	
	
	
//   ==================================================================================
	public static List<String> pacientes = new ArrayList<String>();
	
	public String adicionapaciente(String paciente) {
		if (pacientes.size() < 5) {
			pacientes.add(paciente);
			return "Paciente inserido para atendimento de hoje.";
		} else {
			return "Limite máximo de pacientes diarios atingido.";
		}
	}
	
	public void excluipaciente(int OrdemAtendimento) {
		pacientes.remove(OrdemAtendimento - 1);
	}
	

	public String consultapaciente(int OrdemAtendimento) {
		return pacientes.get(OrdemAtendimento - 1);	
	}

	//Verifica a lista de pacientes para adicionar na consulta paciente.
	public List<String> consultaPacientes() {
		return pacientes;
	}

//	==================================================================================
	public static List<Enfermeiro> enfermeiros = new ArrayList<Enfermeiro>();
	
	public String adicionaenfermeiro(Enfermeiro registro) {
		if (enfermeiros.size() < 1) {
			enfermeiros.add(registro);
			return "Enfermeiro selecionado e adicionado.";
		} else {
			return "Limite máximo de pacientes diarios atingido.";
		}
	}
	
	public List<Enfermeiro> adicionaenfermeiro() {
		return enfermeiros;
	}

//	==================================================================================
	
	public static List<String> lembretes = new ArrayList<String>();

	
	public String adicionalembrete(String lembrete) {
		if (lembretes.size() < 1) {
			lembretes.add(lembrete);
			return "lembrete adicionado.";
		} else {
			return "1 lembrete por vez.";
		}
	}
	
	//Retornando uma lista de funções.
	public List<String> consultaLembretes() {
		return lembretes;
	}
//	==================================================================================



}

package entities;

import entities.enums.NivelExperiencia;

import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {
    private String nome;
    private NivelExperiencia nivelExperiencia;
    private double salarioBase;

    private Departamento departamento;
    private List<HorasDeContrato> contratos = new ArrayList<>();

    public Trabalho() {

    }

    public Trabalho(String nome, NivelExperiencia nivelExperiencia, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivelExperiencia = nivelExperiencia;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelExperiencia getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(NivelExperiencia nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasDeContrato> getContratos() {
        return contratos;
    }

    public void addHorasDeContrato(HorasDeContrato contrato) {
        contratos.add(contrato);
    }

    public void deletarContrato(HorasDeContrato contrato) {
        contratos.remove(contrato);
    }

    public double faturamento(int ano, int mes) {
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();
        for (HorasDeContrato contrato : contratos) {
            calendario.setTime(contrato.getDate());
            int c_ano = calendario.get(Calendar.YEAR);
            int c_mes = calendario.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                soma += contrato.valorTotal();
            }
        }
        return soma;
    }
}

package com.mycompany.projetopessoas;
public class Professor extends Pessoas {
    //Atributos
    private String especialidade;
    private float salario;
    
    //Metodos
    
    public void receberAumento( float am ){
        this.salario += am;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}

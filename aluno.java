package com.mycompany.projetopessoas;
public class aluno extends Pessoas{
    //Atributos
    private int mat;
    private String curso;
    
    //Metodos 
    
    public void cancelarMat(){
        System.out.println(" Sua Matricula foi cancelada! ");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}

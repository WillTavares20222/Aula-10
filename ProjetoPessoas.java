package com.mycompany.projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        //Classe Principal
        Pessoas p1 = new Pessoas();
        aluno p2 = new aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
         
        p1.setNome(" Pedro");    
        p1.setSexo("M");
        p1.setIdade(23);
        p2.setNome(" Maria");
        p2.setSexo("F");
        p2.setIdade(40);
        p2.setCurso("POO");
        p3.setNome(" Claudio");
        p3.setSexo("M");
        p3.setIdade(33);
        p3.setSalario(2500.75f);
        p4.setNome(" Fabiana");
        p4.setSexo("F");
        p4.setIdade(50);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}

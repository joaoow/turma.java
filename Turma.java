/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import javax.swing.JOptionPane;

/**
 *
 * @author sala303b
 */
public class Turma {
    private Aluno[] alunos = new Aluno[10];
    private String atividade;
    String instrutor, turno;
    private int lotacao = 0;
    private double preco = 0.0;
    
    //metodos construtores
    public Turma(){
        
    }

    public Turma(String atividade, String instrutor, String turno) {
        this.atividade = atividade;
        this.instrutor = instrutor;
        this.turno = turno;
    }
    
    //metodos getters e setters

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    //metodos avulsos
    //adicionarAluno
    public void adionarAluno(Aluno aluno){
        if(lotacao<10){
           alunos[lotacao] = aluno;
           lotacao++;
           JOptionPane.showMessageDialog(null, "aluno cadastrado");
        }else{
            JOptionPane.showMessageDialog(null,"aluno nao cadastrado." + "turma cheia!");
        }
        
    }
    //imprimirAlunos
    public void imprimirAlunosEspeciais(){
        if(lotacao>0){
            String s = "";
            for(int i=0; i<lotacao;i++){
                if(alunos[i].isEspecial()){
                s =s + alunos[i].getNome() + "\n";
                
                if(s.equals("")){
                    JOptionPane.showMessageDialog(null,"nao existem" + "alunos especiais na turma");
                }else{
            
        }
            JOptionPane.showMessageDialog(null,"lista de alunos especiais\n" + s);
                
            
            }else{
            JOptionPane.showMessageDialog(null, "nao existem alunos" + "cadastrados");
                }
            }
        }
    }
}
        
    
    
            
        

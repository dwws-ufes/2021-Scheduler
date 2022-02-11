package br.ufes.inf.dishfy.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import javax.swing.ImageIcon;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(length = 20, nullable = false)
    private String email;

    @Column(length = 255, nullable = false)
    private String senha;

    private ImageIcon fotoPerfil;

    @Column(nullable = false)
    private int tamanhoMax;

    @OneToMany //(mappedBy = "user")
    private List<Consumo> consumo;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Receita> receitas;

    public List<Receita> getReceitas() {
        return this.receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    //public Usuario(String nome, String email, String senha) {
    //    this.nome = nome;
    //    this.email = email;
    //    this.senha = senha;
    //    this.fotoPerfil = null;
    //    TODO: Repensar esse valor tamanhoMax
    //    this.tamanhoMax = 30;
    //    this.consumo = null;
    //    this.receitas = null;
    //}

    //public Usuario(String nome, String email, String senha,
    //    ImageIcon fotoPerfil,int tamanhoMax) {
    //        this(nome, email, senha);
    //        this.fotoPerfil = fotoPerfil;
    //}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ImageIcon getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(ImageIcon fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public int getTamanhoMax() {
        return tamanhoMax;
    }

    public void setTamanhoMax(int tamanhoMax) {
        this.tamanhoMax = tamanhoMax;
    }

    public List<Consumo> getConsumo() {
        return this.consumo;
    }

    public void setConsumo(List<Consumo> consumo) {
        this.consumo = consumo;
    }

}

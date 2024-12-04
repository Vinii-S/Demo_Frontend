package br.edu.ifba.demo.frontend.dto;

import java.sql.Date;
import java.time.Year;


public class LivroDTO {

    private Long id_Livro;
    private String titulo;
    private String autor;
    private String editora;
    private Year anoPublicacao;
    private String genero;
    private String isbn;
    private Integer numPaginas;
    private String sinopse;
    private String idioma;
    private Date dataCadastro;
    private Double preco;
    
    public Long getId_Livro() {
        return id_Livro;
    }

    public void setId_Livro(Long idLivro) {
        this.id_Livro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Year getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Year anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "LivroDTO [idLivro=" + id_Livro + ", titulo=" + titulo + ", autor=" + autor + ", editora=" + editora
                + ", anoPublicacao=" + anoPublicacao + ", genero=" + genero + ", isbn=" + isbn + ", numPaginas="
                + numPaginas + ", sinopse=" + sinopse + ", idioma=" + idioma + ", dataCadastro=" + dataCadastro
                + ", preco=" + preco + "]";
    }

    
}

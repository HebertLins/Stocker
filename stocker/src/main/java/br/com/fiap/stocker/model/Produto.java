package br.com.fiap.stocker.model;

public class Produto {
    
    private int id;
    private String nome;
    private int qtd;
    private float preco;
    private String desc;
    private TipoProduto tipo;
    
    public Produto() {
    }


    
    public Produto(int id, String nome, int qtd, float preco, String desc, TipoProduto tipo) {
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
        this.desc = desc;
        this.tipo = tipo;
    }



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

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + qtd;
        result = prime * result + Float.floatToIntBits(preco);
        result = prime * result + ((desc == null) ? 0 : desc.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id != other.id)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (qtd != other.qtd)
            return false;
        if (Float.floatToIntBits(preco) != Float.floatToIntBits(other.preco))
            return false;
        if (desc == null) {
            if (other.desc != null)
                return false;
        } else if (!desc.equals(other.desc))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", qtd=" + qtd + ", preco=" + preco + ", desc=" + desc
                + ", tipo=" + tipo + "]";
    }

    

    
    

}

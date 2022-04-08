package br.com.senai.model;

public class Endereço {

        private String rua;
        private String bairro;
        private String cidade;
        private int numero;
        private String complemento;

        public void setRua(String rua){
            this.rua = rua;
        }
        public String getRua(){
            return rua;
        }

        public void setBairro(String bairro){
            this.bairro = bairro;
        }
        public String getBairro(){
            return bairro;
        }

        public void setCidade(String cidade){
            this.cidade = cidade;
        }
        public String getCidade(){
            return cidade;
        }

        public void setNumero(int numero){
            this.numero = numero;
        }
        public int getNumero(){
            return numero;
        }

        public String getComplemento() {
            return complemento;
        }
        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        public String toString(){
            return "Rua: " + rua + ", Bairro: " + bairro + ", Cidade: " + cidade + ", numero: " + numero + ", complemento: " + complemento;
        }
    }

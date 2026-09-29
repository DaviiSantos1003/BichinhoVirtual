public class  Correcao {
    private String nome;
    private int fome;
    private int energia;
    private String humor;

    public Correcao(String nome) {
        this.nome = nome;
        energia = 5000;
        fome = 10;
        humor = "ALegre";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        if (fome >=0 && fome <=100){
            this.fome = fome;
        }else{
            IO.println("Digite um valor válido");
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia <0 || energia >100){
            IO.println("Digite um valor valido");
        }else{
            this.energia = energia;
        }
        this.energia = energia;
    }

    public String getHumor() {
        if(energia >=50 && fome <=50){
            return humor = "Normal";
        }else if (energia >=75 && fome >=75) {

            return humor = "Bravo";
        }else{
            return humor = "ta mac";
        }

    }

}
public class Pet {

    private String nome;
    private int fome;
    private int energia;
    private int humor;

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", fome=" + fome +
                ", energia=" + energia +
                ", humor=" + humor +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFome(int fome) {

        if(fome < 0 || fome >100){
            IO.println("Valor inválido");
        }else{
            this.fome = fome;
        }


    }

    public void setEnergia(int energia) {


        if(energia < 0 || energia>100){
            IO.println("Valor inválido");
        }else{
            this.energia = energia;
        }
    }
    public void humor(){
        humor = fome + energia;
        if(humor < 0){
        }else if(humor < 50){
            IO.println("Ele está irritado");
        } else if (humor < 80) {
            IO.println("Ele esta calmo");

        }else{
            IO.println("Alegre");

        }












    }
}
package heranca_interface.figuraGeometrica;

public class AppFiguraGeometrica {

    public static void main(String[] args) {

        //Criando instancias de cada figura.
        Quadrado q1 = new Quadrado();
        q1.setLado(2);
        q1.setNome("Quadrado");

        Circulo ci1 = new Circulo();
        ci1.setRaio(2);
        ci1.setNome("Circulo");

        Triangulo tr1 = new Triangulo();
        tr1.setAltura(2);
        tr1.setBase(3);
        tr1.setNome("Triangulo");

        Cubo cu1 = new Cubo();
        cu1.setLado(3);
        cu1.setNome("Cubo");

        Cilindro cil1 = new Cilindro();
        cil1.setAltura(3);
        cil1.setRaio(2);
        cil1.setNome("Cilindro");

        Piramide pi1 = new Piramide();
        pi1.setAltura(3);
        pi1.setApotema(4);
        pi1.setArestaBase(2);
        pi1.setNumpoliBase(4);
        pi1.setBase(q1);
        pi1.setNome("Piramide");

        //Adicionando as instâncias a um vetor do tipo Figura Geométrica.
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = q1;
        figuras[1] = ci1;
        figuras[2] = tr1;
        figuras[3] = cu1;
        figuras[4] = cil1;
        figuras[5] = pi1;

        for(FiguraGeometrica figura : figuras){
            System.out.println("==============================");
            System.out.println(figura.getNome());

            // Usando o "instanceOf" para verificar de qual tipo é o objeto na posição do vetor.
            if(figura instanceof Figura2D){
                System.out.println("Area: ");
            // Downcast da variável figura (Superclasse) para variável fg2d (subclasse).
                Figura2D fg2d = (Figura2D) figura;
                System.out.println(fg2d.calcularArea());
            }

            if(figura instanceof Figura3D){
                System.out.println("Area: ");
                Figura3D fg3d = (Figura3D) figura;
                System.out.println(fg3d.calcularArea());
                System.out.println("Volume: ");
                System.out.println(fg3d.calcularVolume());
            }
        }


    }
}

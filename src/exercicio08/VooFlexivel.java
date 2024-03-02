package exercicio08;

import java.util.Arrays;

public class VooFlexivel extends Voo {

    public VooFlexivel(int numero, Boolean[] assentos) {
        super(numero);
        this.assentos = assentos;
        Arrays.fill(assentos, false); //preenche todo o array com o valor false
    }

    public int getTotalAssentos() {
        int totalAssentos = 0;
        for (int i = 0; i < assentos.length; i++) {
            totalAssentos++;
        }
        System.out.println("Este voo contém " + totalAssentos + " assentos.");
        return totalAssentos;
    }
}

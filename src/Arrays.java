import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        boolean existe = false;

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;


        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);

        int buscandoo = 15;

        for(Integer inter : list){

            if(inter == buscandoo){
                existe = true;
                break;
            }
        }


        if (existe){
            System.out.println("Numero " + buscandoo + " Encontrado!");
        }else {
            System.out.println("No existe el numero " + buscandoo + " en la lista!");
        }

    }
}
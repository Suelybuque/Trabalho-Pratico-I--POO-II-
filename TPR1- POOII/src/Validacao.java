import java.io.*;
public class Validacao {
    public Validacao(){};

    public String validarString(String str ){
        String s=" ";

        try {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println(str);
                s= br.readLine();
                if (s.length()<5)
                    System.out.println("Invalido! Tente novamente");
            }while (s.length()<5);
        }catch (IOException io){
            System.out.println(io.getMessage());
        }

        return s;
    }

    public int validarInt(String str, int  min, int max){
        int val=0;

        System.out.println(str);
        try {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            do {
                val=Integer.parseInt(br.readLine());
                if (val<min && val>max)
                    System.out.println("Invalido!Tente novamente.");
            }while (val<min && val>max);

        }catch (NumberFormatException|IOException nio){
            System.out.println(nio.getMessage());
        }
        return val;
    }
}



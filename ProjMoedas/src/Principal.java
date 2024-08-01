
import javax.swing.JOptionPane;

/*
 * @author paulo.souza
 * 25/07/2024
 * Este programa mostrará a conversão do Real para outras moedas e de outras moedas para real
 */
public class Principal {
    public static void main(String[] args) {
        double cotdolar=5.66;
        double dolar;
        double euro;
        double peso;
        double rubia;
        double coteuro=6.14;
        double cotpeso=0.0061;
        double cotrubia=0.068;
        double valorconv=0;
        double valorreal=0;
        int op=0, opc=0;
        opc=Integer.parseInt(JOptionPane.showInputDialog("Oque deseja fazer?\n"
                + "1- Converter Real para Moedas\n"
                + "2- Converter Moedas para Real\n"));
        if (opc==1) {
               valorreal=Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor em Reais: "));
        op=Integer.parseInt(JOptionPane.showInputDialog("Converter\n"
                + "1-Real para Dolar\n"
                + "2-Real para Euro\n"
                + "3-Real para Peso\n"
                + "4-Real para Rubia"));
        if (op==1) {
            valorconv=valorreal/cotdolar;
            JOptionPane.showMessageDialog(null,"O valor de R$ "+valorreal+" equivale a "+valorconv+" dólares");
        }else{
            if(op==2){
                valorconv=valorreal/coteuro;
                JOptionPane.showMessageDialog(null,"O valor de R$ "+valorreal+" equivele a "+valorconv+" euros");
            }else{
                if (op==3){
                    valorconv=valorreal/cotpeso;
                    JOptionPane.showMessageDialog(null,"O valor de R$ "+valorreal+" equivale a "+valorconv+" pesos");
                }else{
                    if (op==4) {
                        valorconv=valorreal/cotrubia;
                        JOptionPane.showMessageDialog(null,"O valor de R$ "+valorreal+" equivale a "+valorconv+" pesos");
                    }else{
                        JOptionPane.showMessageDialog(null,"Opção Inválida !!");
                    }
                
            }
            }
        }
        }else {
            if(opc==2) {
                op=Integer.parseInt(JOptionPane.showInputDialog("Qual moeda deseja converter?\n"
                        + "1-Dólar\n"
                        + "2-Euro\n"
                        + "3-Peso\n"
                        + "4-Rubia\n"));
                if (op==1) {
                     dolar=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólares"));
                     valorconv=cotdolar*dolar;
                     JOptionPane.showMessageDialog(null,"O valor de "+dolar+" dólares convertidos para real é igual a: "+valorconv);
                }else{
                    if (op==2) {
                        euro=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em euros"));
                        valorconv=euro*coteuro;
                        JOptionPane.showMessageDialog(null,"O valor de "+euro+" euros convertidos para real é igual a: "+valorconv);
                    } else{
                        if (op==3) {
                            peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em pesos"));
                            valorconv=peso*cotpeso;
                            JOptionPane.showMessageDialog(null,"O valor de "+peso+" pesos convertidos para real é igual a: "+valorconv);
                        } else {
                            if (op==4) {
                                rubia=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em rubias"));
                                valorconv=rubia*cotrubia;
                                JOptionPane.showMessageDialog(null,"O valor de "+rubia+" rubias convertidos para real é igual a: "+valorconv);
                            } else {
                                JOptionPane.showMessageDialog(null,"Opção Inválida !!");
                            }
                    }
                        
                } 
            }
         }
     
        }
    }
}

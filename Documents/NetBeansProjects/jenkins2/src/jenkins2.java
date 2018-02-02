/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins;
/**
 *
 * @author remoes1617daw2
 */
import java.io.*;
public class jenkins2 {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        File f = new File("index.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>");bw.newLine();
            bw.write("  <head>");bw.newLine();
            bw.write("    <title>");bw.newLine();
            bw.write("      Treballant amb l'IC Jenkins");bw.newLine();
            bw.write("    </title>");bw.newLine();
            bw.write("  </head>");bw.newLine();
            bw.write("  <body>");bw.newLine();
            bw.write("    Projecte per provar l'IC Jenkins");bw.newLine();
            bw.write("  </body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
            bw.write("2a Modificació del projecte jenkins");bw.newLine();

        }
    }
}
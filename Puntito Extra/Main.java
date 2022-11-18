package puntitoextra;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String archivoNo1 = "texto1.txt";
        String Contenido1 = readFileContent(archivoNo1);
        boolean PrimBalanceo = checkParentesis(Contenido1);
        System.out.println("Archivo " + archivoNo1 +  " - Balanceo: " + PrimBalanceo);

        String archivoNo2 = "texto2.txt";
        String Contenido2 = readFileContent(archivoNo2);
        boolean SegunBalanceo = checkParentesis(Contenido2);
        System.out.println("Archivo " + archivoNo2 + " - Balanceo: " + SegunBalanceo);
    }

    public static boolean checkParentesis(String stringToValidate) {
        StackN<Character> Validacion = new StackN<>();

        for (int i = 0; i < stringToValidate.length(); i++) {
            char currentChar = stringToValidate.charAt(i);
            switch (currentChar) {
                case '(':
                case '[':
                case '{':
                	Validacion.push(currentChar);
                    break;

                case ')':
                case ']':
                case '}':
                    if (Validacion.isEmpty())
                        return false;
                    else {
                        char charInStack = Validacion.pop();
                        if (currentChar == ')' && charInStack != '(')
                            return false;
                        else if (currentChar == ']' && charInStack != '[')
                            return false;
                        else if (currentChar == '}' && charInStack != '{')
                            return false;
                    }
                    break;

                default:
                    break;
            }
        }

        return Validacion.isEmpty();
    }

    public static String readFileContent(String fileName) {
        String line, fileContent = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                fileContent += line;
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Leyendo Archivo");
        }
        return fileContent;
    }
}
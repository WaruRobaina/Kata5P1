package kata5p1;

import java.io.IOException;
import java.util.List;
import static kata5p1.createNewTable.createNewTable;

public class Kata5P1 {

    public static void main(String[] args) throws IOException {
        createNewTable();
        String fileName = "email.txt";
        List<String> mailList = MailListReader.read(fileName);
        InsertarDatosTabla idt = new InsertarDatosTabla();
        for (String mail : mailList) {
            idt.insert(mail);
        }
        SelectApp app = new SelectApp();
        app.selectAll();   
    }     
}

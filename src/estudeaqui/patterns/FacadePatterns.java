/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudeaqui.patterns;

/**
 *
 * @author victor
 */
public class FacadePatterns {
    
    AdapterJsonImport importFile;

    public FacadePatterns(int option, String filename) throws Exception {
        if (option == 0) {
            importFile.getJsonData(filename);
        }
    }

}

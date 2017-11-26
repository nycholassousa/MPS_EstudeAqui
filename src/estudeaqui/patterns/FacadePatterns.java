package estudeaqui.patterns;

public class FacadePatterns {
    
    AdapterJsonImport importFile;

    public FacadePatterns(int option, String filename) throws Exception {
        if (option == 0) {
            importFile.getJsonData(filename);
        }
    }

}

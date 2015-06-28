package main.runnable;


import main.handle.SadouskiParser;

public class Main {
    public static void main(String[] args) {

        SadouskiParser parser = new SadouskiParser();

        parser.prepareFiles();
        String a;
        String b;

////
//        String allContext = "";
//        try {
//            String str;
//            File file = new File("Test1");
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            while ((str = bufferedReader.readLine()) != null){
//                allContext += str;
//            }
//            bufferedReader.close();
//        }
//        catch (IOException e){
//            System.out.print(e);
//        }

//        TestLexer testLexer = new TestLexer(stream);
//        TokenStream tokenStream = new CommonTokenStream(testLexer);
//        TestParser parser = new TestParser(tokenStream);
//        parser.program();
//        System.out.println("ok");
    }
}

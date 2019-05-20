package FilesAnd_I_OPackage;

import java.io.*;

public class FilesAnd_I_O {
    public static void main(String[] args) {
        /**Advice to who use this project to learn java
         *
         * this class method has few errors
         * see the comelier errors and correct those
         * */
        try {
            byteStreams();
            characterStreams();
            standardStreams();
            byteArrayInputStream();
            dataInputStream();
            fileClass();
            fileReaderClass();
            fileWriterClass();
            creatingDirectories();
            listingDirectories();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private static void byteStreams() throws IOException {
        System.out.println("Byte Streams");
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("\n\n\n");
    }

    private static void characterStreams() throws IOException {
        System.out.println("Character Streams");
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("\n\n\n");
    }

    private static void standardStreams() throws IOException {
        System.out.println("Standard Streams - InputStreamReader");
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while(c != 'q');
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
        System.out.println("\n\n\n");
    }

    private static void byteArrayInputStream()throws IOException {
        System.out.println("ByteArrayInputStream");
        ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);

        while( bOutput.size()!= 10 ) {
            // Gets the inputs from the user
            bOutput.write("hello".getBytes());
        }
        byte b [] = bOutput.toByteArray();
        System.out.println("Print the content");

        for(int x = 0 ; x < b.length; x++) {
            // printing the characters
            System.out.print((char)b[x]  + "   ");
        }
        System.out.println("   ");

        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        System.out.println("Converting characters to Upper case " );

        for(int y = 0 ; y < 1; y++) {
            while(( c = bInput.read())!= -1) {
                System.out.println(Character.toUpperCase((char)c));
            }
            bInput.reset();
        }
        System.out.println("\n\n\n");
    }

    private static void dataInputStream()throws IOException {
        System.out.println("DataInputStream");

        // writing string to a file encoded as modified UTF-8
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("E:\\file.txt"));
        dataOut.writeUTF("hello");

        // Reading data from the same file
        DataInputStream dataIn = new DataInputStream(new FileInputStream("E:\\file.txt"));

        while(dataIn.available()>0) {
            String k = dataIn.readUTF();
            System.out.print(k+" ");
        }
        System.out.println("\n\n\n");
    }

    private static void fileClass() {
        System.out.println("File Class");
        File f = null;
        String[] strs = {"test1.txt", "test2.txt"};
        try {
            // for each string in string array
            for(String s:strs ) {
                // create new file
                f = new File(s);

                // true if the file is executable
                boolean bool = f.canExecute();

                // find the absolute path
                String a = f.getAbsolutePath();

                // prints absolute path
                System.out.print(a);

                // prints
                System.out.println(" is executable: "+ bool);
            }
        } catch (Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        }
        System.out.println("\n\n\n");
    }

    private static void fileReaderClass()throws IOException {
        System.out.println("FileReader Class");
        File file = new File("Hello1.txt");

        // creates the file
        file.createNewFile();

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);

        // Writes the content to the file
        writer.write("This\n is\n an\n example\n");
        writer.flush();
        writer.close();

        // Creates a FileReader Object
        FileReader fr = new FileReader(file);
        char [] a = new char[50];
        fr.read(a);   // reads the content to the array

        for(char c : a)
            System.out.print(c);   // prints the characters one by one
        fr.close();

        System.out.println("\n\n\n");
    }

    private static void fileWriterClass()throws IOException {
        System.out.println("FileWriter Class");
        File file = new File("Hello1.txt");

        // creates the file
        file.createNewFile();

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);

        // Writes the content to the file
        writer.write("This\n is\n an\n example\n");
        writer.flush();
        writer.close();

        // Creates a FileReader Object
        FileReader fr = new FileReader(file);
        char [] a = new char[50];
        fr.read(a);   // reads the content to the array

        for(char c : a)
            System.out.print(c);   // prints the characters one by one
        fr.close();
        System.out.println("\n\n\n");
    }

    public static void creatingDirectories() {
        System.out.println("Creating Directories");
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);

        // Create directory now.
        d.mkdirs();
        System.out.println("\n\n\n");
    }

    public static void listingDirectories() {
        System.out.println("Listing Directories");
        File file = null;
        String[] paths;

        try {
            // create new file object
            file = new File("/tmp");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }


}
public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", "This is a text file with some sample content.");
        File file2 = new File("file2.txt", "Another file containing important data.");
        File file3 = new File("file3.txt", "This file has the secret hidden here.");
        File file4 = new File("file4.txt", "This file has the another secret hidden here.");
        File file5 = new File("file5.txt", "This is a text file with some sample content.");




        Folder folder1 = new Folder("Documents");
        Folder folder2 = new Folder("Projects");
        Folder rootFolder = new Folder("Root");


        folder1.add(file1);
        folder1.add(file2);

        folder2.add(file3);

        rootFolder.add(folder1);
        rootFolder.add(folder2);
        rootFolder.add(file4);

        System.out.println("Searching for 'secret':");
        rootFolder.search("secret");

        System.out.println("\nSearching for 'data':");
        rootFolder.search("data");

        System.out.println("\nSearching for 'sample':");
        file5.search("sample");



    }
}